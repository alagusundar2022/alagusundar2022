#Author: alagu.ecommerse.com
Feature: RealmeMobileValidation

  @map
  Scenario: Hardcoded Values
    Given user launches flipkart application
    And user login by entering valid crendentials
    When user search mobile
    And user click on the mobile name
    Then user validate the mobile names
