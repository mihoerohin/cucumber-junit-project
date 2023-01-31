Feature: Library app login feature
  User Story: As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are: librarian, student, admin

  Background:
    Given user is on the library login page

  @librarian @employee
  Scenario: Login as a librarian
  #  Given user is on the library login page
    When user enter librarian username
    And  user enter librarian password
    Then user should see dashboard

    @student
  Scenario: Login as a student
 #   Given user is on the library login page
    When user enter student username
    And  user enter student password
    Then user should see dashboard

      @admin
  Scenario: Login as a admin
 #   Given user is on the library login page
    When user enter admin username
    And  user enter admin password
    Then user should see dashboard