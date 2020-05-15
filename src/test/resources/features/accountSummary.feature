@account
Feature: Account Summary Page

  Background:

    Given user is on the login page
    When user enter the valid credential

  Scenario: Account Summary Page title

    Then Account Summary page should have the title"Zero - Account Summary"

  Scenario: Cash Account

    Then Account summary page should have Cash Account

  Scenario: Investment Account

    Then Account summary page should have Investment Account

  Scenario: Credit Account

    Then Account summary page should have Credit Account

  Scenario: Loan Account

    Then Account summary page should have Loan Account
@Table
  Scenario: Credit Account table

    Then table must have columns "Account", "Credit Card" and "Balance"
