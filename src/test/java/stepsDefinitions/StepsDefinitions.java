package stepsDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exampleSteps.ExampleSteps;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;

import java.util.Map;
import java.util.Map;

public class StepsDefinitions {

    private ExampleSteps exampleSteps = new ExampleSteps();

    @When("^I set URL to \"([^\"]*)\"$")
    public void iSetURLTo(String url) {
        exampleSteps.setURLto(url);
    }

    @And("^I set the content type to \"([^\"]*)\"$")
    public void iSetTheContentTypeTo(String contentType) {
        exampleSteps.setContentTypeTo(contentType);
    }

    @And("^I set operation to \"([^\"]*)\"$")
    public void iSetOperationTo(String operation) {
        exampleSteps.setOperationTo(operation);
    }

    @And("^I set body request with:$")
    public void iSetBodyRequestWith(Map<String, String> bodyMap) {
        exampleSteps.setBody(bodyMap);
    }

    @Then("^I execute the request$")
    public void iExecuteTheRequest() {
        exampleSteps.executeRequest();
    }

    @And("^I should get a valid json$")
    public void iShouldGetAValidJson() {
        exampleSteps.validJson();
    }

    @And("^The json should contain this values:$")
    public void theJsonShouldContainThisValues(Map<String, String> responseValues) {
        exampleSteps.verifyResponse(responseValues);
    }

    @And("^The status code must be (\\d+)$")
    public void theStatusCodeMustBe(int responseCode) {
        exampleSteps.verifyStatusCode(responseCode);
    }
}
