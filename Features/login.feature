Feature: all login page scenarios
  # feature is the description of your feature file

  Background: open brower & maximize
    Given I open browser and maximize


  Scenario: to test the functionality of login button for valid inputs
    Given I am on login page
    When I enter username as "admin" password as "admin"
    And I click on login button
    Then I should be land up on the home page


  Scenario: to test the functionality of login button for invalid inputs
    Given I am on login page
    When I enter username as "xyz" password as "pqr"
    And I click on login button
    Then I should be land up on the home page

    @userReg
    Scenario: to test the fuctionality of add user enquiry button
      Given I am on user registration page
      And i expand user details form
      When I enter following data
      | amol | amol@gmail.com | 676767 | pune |
      Then  user equiry should be added



 @mulipleInput
  Scenario Outline: to test the functionality of login button for valid inputs
    Given I am on login page
    When  we username as <username> password as <password>
    And I click on login button
    Then I should be land up on the home page
   Examples:
   | username | password |
   | user-1   | pass-1   |
   | user-2   | pass-2   |
   | user-3   | pass-3   |
   | user-4   | pass-4   |
   | user-5   | pass-5   |