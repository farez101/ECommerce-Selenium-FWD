@smoke
  Feature: Order Creation
    Scenario: user makes an order successfully
      Given user go to register page
      And user enter first name "Ahmed" and last name "Fares"
      And user enter email "fares.ahmed7@gmail.com" field
      And user fills Password fields "P@ssw0rd" "P@ssw0rd"
      And user clicks on register button
      Then success message is displayed
      When user go to home page
      And user click on item apple macBook
      And user add item apple macBook to cart
      Then confirm message appears

      When user press on Shopping cart
      Then shopping cart page loads
      When user check accept box to agree terms
      And user click checkout button
      Then checkout page loads
      When user update billing address
      And user press billing address continue button
      And user selected delivery method and pressed continue
      And user selected payment method and pressed continue
      And user pressed payment information continue button
      And user pressed confirm continue button
      Then message of successful order appear


