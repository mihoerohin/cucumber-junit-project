@eating
Feature: Eating too many cucumbers may not be good for you
  user story: Eating too much of anything may not be good for you

  @eating
  Scenario: Eating a few is no problem
    Given Janna is hungry
    When She eats some cucumbers
    Then She will be full
