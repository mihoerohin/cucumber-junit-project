Feature: Etsy Title Verification and Etsy Search Functionality Title Verification (without parameterization)

  Background:
    Given User should be on etsy page

  @etsy
  Scenario: Etsy Title Verification.
    Then User sees title is as expected "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone"

  @etsy
    Scenario: Etsy Search Functionality Title Verification (without parameterization)
      When User types "Wooden Spoon" in the search box
      And User clicks search button
      Then User sees "Wooden spoon" is in the title