@smoke
Feature: add products to wishlist
  Scenario: user can add different products to wishlist
    Given user go to register page
    And user enter first name "Ahmed" and last name "Fares"
    And user enter email "fares.ahmed5@gmail.com" field
    And user fills Password fields "P@ssw0rd" "P@ssw0rd"
    And user clicks on register button
    Then success message is displayed
    When user go to home page
    And user click on item apple macBook
    And user add item apple macBook to wishlist
    Then confirm message wishlist appears
    And user click on item samsung laptop
    And user add item samsung laptop to wishlist
    Then confirm message wishlist appears