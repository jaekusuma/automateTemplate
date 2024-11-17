Feature: Open Google
  Scenario: Open Google via web browse
    Given User Open google
    When User see title must be "Google"
    Then User search "Jakarta"
    And User see information about "Jakarta"