Feature: EnstoEnd Scenario for TestMeApp

Background: Login with valid credentials

Given User is on homepage
When User enters username and password and click on login button


Scenario: Successful Checkout

Given Navigate to all categories electronic and headphone
And Add product into shopping cart
When proceed to checkout
And select bank and add credentials
Then redirect to the thankyou page

Scenario Outline: user logs into TestMeApp

Given Registered user click on login link
When user enters the username "<uname>"
And user enters the password "<pwd>"
Then Clicks on login button to access the website

Examples:
     |uname   | pwd         |
     |lalitha | password123 |
     
     
     
     
     
