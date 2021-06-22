@Regression
Feature: User wants to be on tutorial_login site

Scenario: Valid user should be able to login on tutorialsite

Given I should be able to login on tutorial site as a valid user
When I enterd Firstname "Suraj" LastName "shah_kafley"
And I filled all text field and entered date "10-4-2020"
Then I lande on next page


