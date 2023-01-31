Feature: Data Driven testing using Scenario Outline

  @google_scenario_outline
  Scenario Outline: Google capital cities search
    Given User is on Google search page
    When User searches for "<country>" capital
    Then User should see "<capital>" in the page

    Examples:
      | country    | capital          |
      | Azerbaijan | Baku             |
      | Kazakhstan | Nur-Sultan       |
      | Ukraine    | Kyiv             |
      | USA        | Washington, D.C. |
      | Turkey     | Ankara           |

