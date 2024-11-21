@DuckDuckGo
Feature: search duckduckGo
  Scenario: search content on duckduckGo
    Given User open duckduckGo
    When User see title must be "DuckDuckGo - Your protection, our priority."
    Then User search "Jakarta" on duckduckGo
    And User see information about "Jakarta" on result