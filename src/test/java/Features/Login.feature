   Feature: Test feature functionality of TV HUT
    @release
    Scenario: Verify the details on home page
      Given Verify that home page is displayed register or login options
      Then Website should be displayed
    @release
    Scenario: Verify the register on home page
      Given Verify that register contains name, email, telephone, password and submit button
      And Clicks on the register button from the right of the corner
      When Fill up the required fields with valid credentials
      Then Clicks on the continue button

    @release
   Scenario: Test the valid login
    Given user is on login page
    And user click on login button
    And user enters username and password
    And click on login button
    Then user should land on homepage

