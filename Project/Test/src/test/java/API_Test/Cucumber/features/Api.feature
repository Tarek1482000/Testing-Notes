Feature: Testing Bored API

  Scenario: Verify API Status Code
    Given GET API
    When I request a random activity from the API
    Then The response status code should be 200

  Scenario: Verify Response Body Content
    Given GET API
    When I request a random activity from the API
    Then The response should contain an activity
    And The response should contain a type
    And The response should contain participants
    And The response should contain a price
    And The response should contain a key
    And The response should contain accessibility
