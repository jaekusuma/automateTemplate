@apiTest
Feature: API reqress
  Scenario: GET Single User
    Given User get endpoint "/api/users/" with parameter 1
    Then User get response 200 OK
    And Body contain id = 1 first_name = "George" and last_name = "Bluth"
    And Assert JSon Body Scheme

  Scenario: POST login user
    Given Post user login with request body "login.json" to endpoint "/api/login"
    Then Status code should be 200 OK
    And Response body contain token "QpwL5tke4Pnpja7X4"
    And Validate valid login user schema