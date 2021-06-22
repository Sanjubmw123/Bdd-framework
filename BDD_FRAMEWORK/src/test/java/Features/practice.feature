Feature: User wants to be on tutorial_login site

Scenario: need to  login on tutorialsite

Given I should be  able to login on tutorial site as a valid user
When If i  enter Firstname "Nabin" LastName "smith"
And I fill all text field and entered date "10-10-2020"
Then I should click  on next site
