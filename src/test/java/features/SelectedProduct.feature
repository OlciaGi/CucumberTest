Feature: Preview the product and add it to the basket

  Scenario: Select product and add to cart
Given User open TaniaKsiazka page
When User chose Fantastyka from categories
Then Page with Fantastyka books is displayed
And User click on Book
Then Product page are displayed
And User adds book to the basket
Then Book added to the basket