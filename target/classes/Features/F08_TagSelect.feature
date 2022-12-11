@smoke
  Feature: Different Tag selection
    Scenario: user selects different tags
      Given user go to home page
      When user select computer Category Tab
      And user select tag cool from popular tags
      Then page load with title containing cool
      And user select tag game from popular tags
      Then page load with title containing game
