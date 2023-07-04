Feature: Purchase from the website "http://www.automationpractice.pl/index.php"
  In order to make a purchase from the "http://www.automationpractice.pl/index.php"
  As a user
  I want to successfully do purchases in the website

  Scenario: User makes a successful purchase
    Given a user is logged on the "http://www.automationpractice.pl/index.php" page
    And the user clicks "T-Shirts" from the main menu
    And the user selects an item "Faded Short Sleeve T-shirts" with the following properties:
      | Quantity | Size | Color |
      | 2        | M    | Blue  |
    When the user clicks "Add to cart" button on the "Home" page
    Then the shopping cart on the Home page is updated with the quantity 2 of the selected item
    And the selected item is added to the cart with the following properties:
      | Quantity | Size | Color |
      | 2        | M    | Blue  |