Feature: Mark Attendence


  Background:
    Given I navigate to the application

  @Regression
  Scenario Outline: Positive Test of Submitting the order

   Given Login with username "<name>" and password "<password>"
  And I navigate to HomePage
    When I click on attendance
    And Verify the time
    Then "Successfully marked your attendance" message is displayed

    Examples:
      | name|password|
      | achinimeekandawattage@gmail.com |Am-12345|