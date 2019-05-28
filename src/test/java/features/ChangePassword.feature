Feature: Change Password

Scenario: User can change the password

Given User is on TaniaKsiazka main page
When User clicks on Log In link
Then Log In page is displayed
When User types email
And User types password
And User clicks Log in button
Then User is logged and username is displayed
And User click change pasword link
Then Change password page is displayed
And User type and confirm the new password
Then The password is changed