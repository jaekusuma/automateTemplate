@apiTest
Feature: API reqress
  Scenario: GET Single User
    Given User get endpoint "/api/users/" with parameter 1
    Then User get response "200" OK