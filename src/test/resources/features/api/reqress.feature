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

  Scenario: POST Create User
    Given Post create user with request body "createUser.json" to endpoint "/api/users"
    Then Status code should be 201 created
    And Response body contain name "morpheus" job "leader"
    And Validate create user json schema

  Scenario: PATCH Update
    Given Patch update user with id 1 with request body "updateUser.json" to endpoint "/api/users/"
    Then Status code should be 200 OK
    And Response body should contain name "Jahe" and job "SQA"
    And Validate patch update json scheme