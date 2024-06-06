@smoketest
Feature: Login Test
  Scenario Outline: Login with valid credentials
    Given User open the web sauce demo
    When User input "<username>" as userName and "<password>" as password and click login
    Then User should be directed to the dashboard page
    Examples:
      |username     |password     |
      |standard_user|secret_sauce |
      |standard_user|secret_sauce |
      |standard_user|secret_sauce |
      |standard_user|secret_sauce |
      |standard_user|secret_sauce |

  Scenario: Login with 1 step
    Given User login with valid username "standard_user" and password "secret_sauce"