# new feature
# Tags: optional

Feature: Multiple scenarios with different set of data

#  Scenario: Buy 10 apples and 5 carrots
#    Given the grocery store is open
#    When We go to the store
#    Then User buys 10 apples and 5 carrots
#
#  Scenario: Buy 1 apples and 2 carrots
#    Given the grocery store is open
#    When We go to the store
#    Then User buys 1 apples and 2 carrots
#
#  Scenario: Buy 100 apples and 50 carrots
#    Given the grocery store is open
#    When We go to the store
#    Then User buys 100 apples and 50 carrots
  @outline
  Scenario Outline: Buy apples and carrots
    Given the grocery store is open
    When We go to the store
    Then User buys <apple> and <carrots>
    Examples:
      | apple | carrots |
      | 10    | 5       |
      | 1     | 2       |
      | 100   | 50      |


  Scenario Outline: Tickets
    Given I navigate to kayak.com
    When user searches for flight <from>  <to>
    And on<date>
    Then list of flights is displayed

    Examples:
      | from    | to       | date |
      | Chicago | New York |      |
      | Alaska  | Miami    |      |
      | LA      | SFO      |      |


  Scenario Outline: Cars
    Given I vavigate to Cars.com
    When user searches for <car> <model>
    And price is <$$$>
    Then list of Cars is displayed

    Examples:
      | car    | model   | $$$   |
      | Toyota | Camry   | 15000 |
      | Nissan | Sentra  | 12000 |
      | Tesla  | Model S | 25000 |


  Scenario Outline: Searching for job
    Given user looks for a job
    When user searches on <website> for a <position>
    And user specifies <salary>, <location>, <startDate>
    Then user gets 1000 of offers
    Examples:
      | salary | website  | position | location | startDate    |
      | 150000 | dice.com | SDET     | Chicago  | July 4, 2019 |




