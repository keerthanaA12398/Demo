Feature: Test registration functionality

Scenario: Test Registration with valid inputs
Given user launches chrome browser
And user navigates to registration page
And user enters the username
And user enter the password
And user enters the confirm password
And user click submit
Then user verify successful
