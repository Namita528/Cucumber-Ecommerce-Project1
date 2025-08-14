Feature: Add to Cart and Checkout Functionality

  Scenario: A user can successfully complete a purchase
    Given the user is on the product page
    When the user clicks the "Add to Cart" button
    Then the product is added to the cart
    When the user proceeds to checkout
    Then the billing address page is displayed
    When the user fills in all required billing details
    And the user clicks the "Place Order" button
    Then the order is successfully placed
  