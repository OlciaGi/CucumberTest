Feature: Search product

Scenario: User can search product on TaniaKsiazka website
	
  Scenario: Searching the books
Given User open TaniaKsiazka page
When User type searched phrase
And User click enter
Then Searched phrase is displayed