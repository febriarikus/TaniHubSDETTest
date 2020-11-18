Feature: UI Automation for Checkout An Item
  As registered user
  I want to buy an item
  So that i can checkout the item corectly

  Scenario: checkout an item (following steps already defined)
    Given login as testing user
    When user search minyak goreng in search box
    And user add this item to cart
    Then user checkout the item