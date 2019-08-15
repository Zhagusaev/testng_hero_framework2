# new feature
# Tags: optional

Feature: Instagram login automation
  Background:
    Given I navigate to Instagram.com

  Scenario: Happy path

    When User logs in with valid credentials
    Then use can successfully log in

    Scenario: Forgot password
      When I change the password
      And use it to log in
      Then user can successfully log in


  Scenario: Forgot login
    When I change the login
    And use it to log in
    Then user can successfully log in