Feature: Preview the product and add it to the basket

  Scenario: Select product and add to cart
Given User open TaniaKsiazka page
When User chose Fantastyka from categories
Then Page with Fantastyka books is displayed
And User click on Book
Then Product page are displayed
And User adds book to the basket
And Book added to the basket
And User go to the my cart page
Then User has increased the number of books