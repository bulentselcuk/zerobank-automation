@login
Feature: User should be able to login to the application

  Scenario: login with valid credential

    Given The user is on the login page
    When The user enter the valid credential
    Then The user should be able to login

  Scenario: login with invalid credential

    Given The user is on the login page
    When  The user enter the invalid credential
    Then The user should see error message"Login and/or password are wrong."

  Scenario: login with blank user name

    Given The user is on the login page
    When  The user enter the blank username
    Then The user should see error message"Login and/or password are wrong."

  Scenario: login with blank password

    Given The user is on the login page
    When The user enter the blank password
    Then The user should see error message"Login and/or password are wrong."