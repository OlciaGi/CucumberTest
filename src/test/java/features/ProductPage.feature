Feature: Product price filtering

 Scenario: Open product list and filtering the price
 
Given User open TaniaKsiazka page
When User chose Fantastyka from categories
Then Page with Fantastyka books is displayed
And User tapes minimum price 
And User tapes maximum price 
Then Products are displayed