@smoketest
Feature: Checkout test
  Scenario: Checkout product saucelabs backpack until complete
    When User login with valid username "standard_user" and password "secret_sauce"
    And Add to cart button saucelabs backpack is displayed
    And Click Add to cart saucelabs backpack
    And Click cart icon
    And Click checkout button
    And Input first name "Wisnu" and last name "Munawar" and postal code "12345"
    And Click continue button
    And Click finish button
    Then Should be displayed checkout complete with title "Thank you for your order!"