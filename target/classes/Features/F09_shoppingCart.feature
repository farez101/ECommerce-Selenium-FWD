@smoke
  Feature: add products to shopping cart
    Scenario: user can add different products to shopping cart
      Given user go to register page
      And user enter first name "Ahmed" and last name "Fares"
      And user enter email "fares.ahmed4@gmail.com" field
      And user fills Password fields "P@ssw0rd" "P@ssw0rd"
      And user clicks on register button
      Then success message is displayed
      When user go to home page
      And user click on item apple macBook
      And user add item apple macBook to cart
      Then confirm message appears
      And user click on item samsung laptop
      And user add item samsung laptop to cart
      Then confirm message appears