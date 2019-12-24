Feature: My validations on Testme Application

Background: user logs into TestMe Application
Given TestMeApp is launched 
And user logs in using his credentials

  @aut
  Scenario: User acces the registeration link
    Given TestmeApp website is launched
    And User clicks on register link
    When User enters the details
    Then Clicks on register button for account creation

  @smokezzzz
  Scenario Outline: user logins into Testme application
    Given Registered user clicks on Login Link
    When User enters the username "<uname>"
    And User enters the password "<pwd>"
    Then Clicks on Login button to access the website

    Examples: 
      | uname     | pwd         |
      | Lalitha   | password123 |
      | Meghan456 | meghan456   |

@Sanity
Scenario: user wants to purchase a product
Given: Registered user logs into Testme application xx
When user searches for the desired product
And  search leads to the desired product details
Then  user adds the product to the cart and proceeds for the payment


      
  