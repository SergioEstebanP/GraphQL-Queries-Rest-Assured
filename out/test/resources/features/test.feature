Feature: Testing https://www.fakerql.com/ - Graphql api qith fake data.

  Scenario:
    When I set URL to "https://fakerql.com/graphql"
    And I set the content type to "application/json"
    And I set operation to "post"
    And I set body request with:
      | id        | wk0z1j1tzj7xc0116is3ckdrx |
      | firstName |                           |
      | lastName  |                           |
      | email     |                           |
      | avatar    |                           |
    Then I execute the request
    #And I should get a valid json
    And The json should contain this values:
      | firstName | Betty                                                              |
      | lastName  | Boehm                                                              |
      | email     | Nelson18@yahoo.com                                                 |
      | avatar    | https://s3.amazonaws.com/uifaces/faces/twitter/drewbyreese/128.jpg |
    #And The status code must be 200
