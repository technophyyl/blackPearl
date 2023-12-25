
Feature: user login validation
  Description: validating given user login to system
#@QATechnicalTest
  Scenario: validating given user login to system
    When Load the login page.
    Then Interact with the interface to change to the username/password version of the login page.
    Then Input the username and password into their corresponding fields.
    Then Click the login button to proceed to the logged-in state.
    Then Check that there is a loaded user number on the dashboard.
