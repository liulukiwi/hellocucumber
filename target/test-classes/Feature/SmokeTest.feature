Feature: Assert home page is loaded

  Background:
    Given I login as admin

  Scenario: s1 View default welcome content page while signed in as 'Test Test' and check that image is present
    When  I go to Home page
    Then  I could view "Welcome to Liferay" in page
    And I could view welcome image in page





