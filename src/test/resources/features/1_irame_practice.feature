@iframe
Feature: as adviser I should get text from iframe

  Scenario:
    Given Advisor on login page "https://demoqa.com/" and should click Alerts, Frame & Windows button
    When Advisor should clink button Frames
    And Get text from  bigger iframe "This is a sample page"
    And  Get text from smaller iframe "This is a sample page"
    Then Advisor should click Nested Frames
    And Get text from smaller "Child Iframe"
    And  Get text from bigger "Parent frame"
    Then Get get first sentence from Nested Frames "Sample Nested Iframe page."


