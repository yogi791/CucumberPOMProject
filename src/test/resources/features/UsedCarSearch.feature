@Used-Car_Search
Feature: Accceptance testing to validate Used cars search page is working fine.
  In order to validate that the used serach cars page is working fine we will do the acceptance testing

  @Used-Cars-earch-Positive
  Scenario: Validate search cars page
    Given I am on the HomePage "https://www.carsguide.com.au/" of CarsGuide website
    When I move to the menu
      | Manu          |
      | Cars For Sale |
      | Sell My Car   |
    And click on "Used Cars Search" link
    And select car brand as "FORD" from AnyMake dropdown
    And select car model as "BRONCO" from SelectModel dropdown
    And select location as "NSW - Far North Coast" from SelectLocation dropdown
    And select price as "$3,000" from Price dropdown
    And click on FindMyNextCar button
    Then I should see the list of searched car
    And PageTitle should be "Used Ford Bronco Under 3000 for Sale Far North Coast NSW | carsguide"
