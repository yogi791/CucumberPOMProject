@Search-Cars
Feature: Accceptance testing to validate search cars page is working fine.
  In order to validate that the serch cars page is working fine we will do the acceptance testing

  @Search-Cars-Positive
  Scenario: Validate search cars page
    Given I am on the HomePage "https://www.carsguide.com.au/" of CarsGuide website
    When I move to the menu
      | Manu          |
      | Cars For Sale |
      | Sell My Car   |
    And click on "Search Cars" link
    And select car brand as "BMW" from AnyMake dropdown
    And select car model as "1 SERIES" from SelectModel dropdown
    And select location as "Australia" from SelectLocation dropdown
    And select price as "$1,000" from Price dropdown
    And click on FindMyNextCar button
    Then I should see the list of searched car
    And PageTitle should be "Bmw 1 Series Under 1000 for Sale | carsguid"
