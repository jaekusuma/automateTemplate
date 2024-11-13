Feature: Open Google
  Scenario: Open Google via web browse
    Given User Open google
    Then User see title must be "Google"