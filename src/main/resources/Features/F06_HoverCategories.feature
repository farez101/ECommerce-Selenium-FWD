@smoke
  Feature: Hovering to different Categories
    Scenario: user go to home page and select different categories
      Given user go to home page
      When user hover on Electronics category Tab and select Cell phones
      Then Cell phones from Electronics is loaded
      When user select computer Category Tab
      Then computer Category tab is loaded