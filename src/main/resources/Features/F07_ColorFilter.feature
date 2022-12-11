@smoke
  Feature: user filter using color
    Scenario:
      Given user go to home page
      When user hover on Apparel and selects shoes subcategory
      And user filter with color red
      Then user check that only one shoe is appearing