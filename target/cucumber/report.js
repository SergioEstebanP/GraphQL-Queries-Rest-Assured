$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/test.feature");
formatter.feature({
  "name": "Testing https://www.fakerql.com/ - Graphql api qith fake data.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I set URL to \"https://fakerql.com/graphql\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepsDefinitions.iSetURLTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the content type to \"application/json\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitions.iSetTheContentTypeTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set operation to \"post\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitions.iSetOperationTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set body request with:",
  "rows": [
    {
      "cells": [
        "id",
        "wk0z1j1tzj7xc0116is3ckdrx"
      ]
    },
    {
      "cells": [
        "firstName",
        ""
      ]
    },
    {
      "cells": [
        "lastName",
        ""
      ]
    },
    {
      "cells": [
        "email",
        ""
      ]
    },
    {
      "cells": [
        "avatar",
        ""
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitions.iSetBodyRequestWith(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I execute the request",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDefinitions.iExecuteTheRequest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The json should contain this values:",
  "rows": [
    {
      "cells": [
        "firstName",
        "Betty"
      ]
    },
    {
      "cells": [
        "lastName",
        "Boehm"
      ]
    },
    {
      "cells": [
        "email",
        "Nelson18@yahoo.com"
      ]
    },
    {
      "cells": [
        "avatar",
        "https://s3.amazonaws.com/uifaces/faces/twitter/drewbyreese/128.jpg"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitions.theJsonShouldContainThisValues(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
});