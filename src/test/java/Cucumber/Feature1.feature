Feature: Mark Attendence


  Background:
    Given I navigate to the application

  @Regression
  Scenario Outline: Positive Test of Submitting the order

   Given Login with username "<name>" and password "<password>"
    And I navigate to HomePage
   # When I click on attendance
    Then "Successfully marked your attendance" message is displayed

    Examples:
      | name|password|
      | Achini10 |Swivel@123|