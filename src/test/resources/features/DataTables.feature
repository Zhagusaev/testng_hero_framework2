# new feature
# Tags: optional

Feature: Intorduction to datatables
@dataTable
  Scenario: A scenario
    Given the following users exist:
      | name   | email              | twitter    |
      | Aslak  | aslak@cucumber.io  | @aslak     |
      | Julien | julien@cucumber.io | @jbpros    |
      | Matt   | matt@cucumber.io   | @mattwynne |

    When user writes email to Aslak
    Then Aslak responds
