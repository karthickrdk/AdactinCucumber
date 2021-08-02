Feature: Testing the booking functionality of Automation Practice Shopping application

Scenario: Checking the login functionality using valid username and password

Given User must launch the login page 
When User press the sign button to proceed 
And User enter the valid username in the username field
And User enter the valid password in the password field
Then User confirm it and navigate to the main page


Scenario: Checking the functionality of various options available in dress selection page 

Given User must present in the My Account Page
When User move to the women area for selecting the dress
Then User click the casual dress and navigate forward 

Scenario: Checking the functionality of adding the dresses to the cart

Given User must be available in the casual dress area 
When User click the image of specific dress to order
Then User click the add cart and proceed further 

Scenario: Checking the functionality of various checkout available 

Given User should present in the product added page
When User press the proceed to checkout button to move forward
And  User click the proceed to checkout in summary page
And User must press the proceed to checkout in address page 
And User press the checkbox in shipping page 
And User  must press the proceed to checkout in shipping
And User should the payment method to proceed further
Then User should press the confirm order to place his order and proceed with the order confirmation page 
