Feature: Adress book 

Scenario: Add new Adress to AdressBook
Given User is on TaniaKsiazka main page
When User clicks on Log In link
Then Log In page is displayed
When User types email
And User types password
And User clicks Log in button
Then User is logged and username is displayed
When User click on KsiazkaAdresowa link
Then KsiazkaAdresowa page is displayed
When User click add new adress button
And User types name
And User types surname
And User types street and house number
And User types postcode
And User types city
And User enter phone number
Then User click safe adress button
