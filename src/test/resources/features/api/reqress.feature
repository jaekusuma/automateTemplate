@apiTest
Feature: API reqress
  Scenario: GET Single User
    Given User get endpoint "/api/users/" with parameter 1
    Then User get response 200 OK
    And Body contain id = 1 first_name = "George" and last_name = "Bluth"
    And Assert JSon Body Scheme