Feature: Check TwojProfil page

Scenario: User log in to TaniaKsiazka and check taht TwojProfil page is displayed
	
Given User is on TaniaKsiazka main page
When User clicks on Log In link
Then Log In page is displayed
When User types email
And User types password
And User clicks Log in button
Then User is logged and username is displayed
And User click on Nowoci button
Then Nowoci page is displayed
And User click TwojProfil Link
Then Twoj profil page is displayed


