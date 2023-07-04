Feature: Login to website "http://www.automationpractice.pl/index.php"
  In order to login in "http://www.automationpractice.pl/index.php"
  As a user
  I want to use the functionalities of the website

  Scenario: Successful login
    Given a user is on the "http://www.automationpractice.pl/index.php" page
    And the user clicks "Sign in" from the menu
    And the user enters valid credentials
    |Email                 |Password       |
    | test_account87@abv.bg| testAccount87!|
    When the user clicks "Sign in" button on the "Login" page
    Then the user is redirected to the "Home" page