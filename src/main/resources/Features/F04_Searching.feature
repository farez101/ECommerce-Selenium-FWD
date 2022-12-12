@smoke
  Feature: Logged User Could Search for Product
    Scenario: user login successfully and search for any product
      Given user go to register page
      And user enter first name "Ahmed" and last name "Fares"
      And user enter email "fares.ahmed311@gmail.com" field
      And user fills Password fields "P@ssw0rd" "P@ssw0rd"
      And user clicks on register button
      Then success message is displayed
      And user search for item "Apple"
      And user press on search button
      Then user finds product search result
      And user search for item SKU "APPLE_CAM"
      And user press on search button
      Then user find SKU result



