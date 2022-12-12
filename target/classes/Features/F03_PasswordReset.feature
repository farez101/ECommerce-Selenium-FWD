@smoke
  Feature: Reset Password
    Scenario: user register in site
      Given user go to register page
      And user enter first name "Ahmed" and last name "Fares"
      And user enter email "fares.ahmed112@gmail.com" field
      And user fills Password fields "P@ssw0rd" "P@ssw0rd"
      And user clicks on register button

    Scenario: user resets his password
      Given user go to login page
      And user press on Forget Password
      And user fill his email
      And user click on recover button
      Then message of instruction is displayed
