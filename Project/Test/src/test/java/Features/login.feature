

  Feature: Test The login functionality
    Scenario: To login with valid email and valid password
      Given User open the website and go to login page
      When User fill data and click login
      Then User should navigate to home page