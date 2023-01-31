Feature: User should be able to login with correct credentials

  Background:
    Given user is in web table login page

  @webAppLogin
  Scenario: Wed table login scenario
    When user enters username "Test"
    And user enters password "Tester"
    And user click login button
    Then user should see url contains orders

  @webAppLogin2
  Scenario: Wed login scenario
    When user enters username "Test", password "Tester" and login
    Then user should see url contains orders

  @webAppLogin3
  Scenario: map data table practice
    When user enters below credentials
      | username | web.app.username |
      | password | web.app.password |

  @Janna
  Scenario: Map and Array in login page
    When  user enters below credentials new
      | Janna | Test Tester |



