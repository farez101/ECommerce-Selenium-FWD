@smoke
  Feature: Switch Currency to Euro
    Scenario: user select euro currency and items price convert to euro
      Given user go to home page
      And user switch to euro currency
      Then items price currency change to euro