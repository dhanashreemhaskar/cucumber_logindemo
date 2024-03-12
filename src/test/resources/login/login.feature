
@smoke
Feature: login feature
  @tag1
  Scenario: validating login page
    Given user open chrome and enter url
    When user enter username
    And user enter password
    And click on login
    Then welcome back message is displayed

  