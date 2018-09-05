package exampleSteps;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyData;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import org.junit.Assert;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.rest.SerenityRest.rest;

public class ExampleSteps {

    // PRIVATE ATTRIBUTES TO FORM THE REQUEST
    private static String URL;
    private static String OPERATION;
    private static String CONTENTTYPE;
    private static RequestSpecification spec;

    // PRIVATE METHODS
        // SETTERS
    private void setURL (String url) {
        this.URL = url;
    }

    private void setOperation (String operation) {
        this.OPERATION = operation;
    }

    private void setContenttypeB (String content) {
        this.CONTENTTYPE = content;
    }

        // GETTERS
    private String getUrl () {
        return this.URL;
    }

    private String getContenttype () {
        return this.CONTENTTYPE;
    }

    private String getOperation () {
        return this.OPERATION;
    }

    // STEPS
    @Step
    public void setURLto (String url) {
        setURL(url);
    }

    @Step
    public void setContentTypeTo(String content) {
        setContenttypeB(content);
    }

    @Step
    public void setOperationTo (String op) {
        setOperation(op);
    }

    @Step
    public void setSpec (RequestSpecification spec) { this.spec = spec;}

    @Step
    public void setBody (Map<String, String> bodyMap){
        this.spec = rest().baseUri(getUrl()).contentType(getContenttype()).when();
        System.out.println(getUrl() + "---" + getContenttype());
        File request = new File("C:\\Users\\sergio.esteban\\Documents\\graphql-rest-assured\\src\\test\\resources\\requests\\user.json");
        this.spec.body(request);
    }

    @Step
    public void executeRequest() {
        Response response = null;
        switch (getOperation().toLowerCase()) {
            case "get":
                response = this.spec.get(getUrl());
                break;
            case "delete":
                response = this.spec.delete(getUrl());
                break;
            case "put":
                response = this.spec.put(getUrl());
                break;
            case "post":
                response = this.spec.post(getUrl());
                break;
        }
        Serenity.setSessionVariable("response").to(response);

    }

    @Step
    public void validJson() {
        Response response = Serenity.sessionVariableCalled("response");
        ResponseBodyData bodyData = response.getBody();
        System.out.println(bodyData.toString());
    }

    @Step
    public void verifyResponse(Map<String, String> values) {
        Response response = Serenity.sessionVariableCalled("response");
        /*String [] keys = values.keySet().toArray(new String[values.size()]);
        for (String item : keys) {
            response.getBody().jsonPath().getString(item);
        }*/
        System.out.println(response.getBody().prettyPrint());
    }

    @Step
    public void verifyStatusCode(int statusCode) {
        Response response = Serenity.sessionVariableCalled("response");
        Assert.assertEquals("The status code is incorrect, something in the operation went wrong", statusCode, response.getStatusCode());
    }
}
