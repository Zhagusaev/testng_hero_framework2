# new feature
# Tags: optional
@flightSearch
Feature: Kayak search functionality

  Scenario:Flight search
    Given Kayak flight page is open
    When user search for one way flight from Chicago to New York on 12/25/2019
    Then 5 or more  flights for given dates are displayed

    Scenario: Booking hotel
      Given Kayak hotels page is open
      When user searches for hotel in Istanbul on 6/30/2019
      And chooses to stay from 6/30/2019 to 7/30/2019
      Then list of hotels are shown







