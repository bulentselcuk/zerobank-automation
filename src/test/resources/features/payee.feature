@bill
Feature:  Pay Bills Page

  Background:
    Given The user is on the login page
    When The user enter the valid credential
    And The user navigate to "Pay Bills" module


  Scenario: The title of Pay Bills Page
    Then Account activity page should have the title "Zero - Pay Bills"

