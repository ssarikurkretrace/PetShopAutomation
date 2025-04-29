@wip
Feature: User can navigate


  Scenario: click shopping
    Given the user is on the main page
    When the user clicks go shopping
    And Then the user should see following options
      | ToysClothes   |


  Scenario: : User can navigate to toys page
    Given the user is on the main page
    When the user clicks go shopping
    Then user clicks "Toys"
    And user on the "Toys" page



  Scenario: : User can navigate to Clothes page
    Given the user is on the main page
    When the user clicks go shopping
    Then user clicks "Clothes"
    And user on the "Clothes" page


  Scenario: : User can add a product to cart
    Given the user is on the main page
    When the user clicks go shopping
    And user clicks "Toys"
    And user can add product to cart
    Then verify product on the cart


  Scenario: : User can add a buy a product
    Given the user is on the main page
    When the user clicks go shopping
    And user clicks "Toys"
    And user can add product to cart
    Then verify user can buy product

