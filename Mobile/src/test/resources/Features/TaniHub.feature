Feature: Search
  As a User
  I want to search specific product
  So that I got the detail of product

  Scenario: search specific product
    Given on tanihub homescreen
    When I select area jabodetabek
    And I search product : Rose Brand Minyak Goreng 2 L Karton
    Then I got the detail of Rose Brand Minyak Goreng 2 L Karton