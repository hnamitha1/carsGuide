@Search-Cars
Feature: Acceptance testing to validate Search Cars page is working
  In order to validate that
  the search cars page is working fine
  we will do the acceptance testing

  @Search-Cars-Positive
  Scenario: Validate search cars page
    Given I am on the Home Page "https://www.carsguide.com.au/" of CarsGuide
    When I move to the menu
      | Menu     |
      | buy+sell |
      | reviews  |
    And click on "Search Cars" link
    And select carbrand as "Toyota" from AnyMake dropDown
    And select carmodel as "Aristo" from SelectModel dropDown
    And select location as "NSW - Sydney" from SelectLocation dropDown
    And select price as "$1,000" from price dropDown
    And click on Find My Next Car button
    Then I should see list of searched cars
    And the page title should be "Toyota Aristo Under 1000 for Sale Sydney NSW | carsguide"
    

  