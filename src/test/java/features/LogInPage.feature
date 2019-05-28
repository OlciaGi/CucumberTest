Feature: Log in to system

Scenario: User can log in to TaniaKsiazka
	
Given User is on TaniaKsiazka main page
When User clicks on Log In link
Then Log In page is displayed
When User types email
And User types password
And User clicks Log in button
Then User is logged and username is displayed