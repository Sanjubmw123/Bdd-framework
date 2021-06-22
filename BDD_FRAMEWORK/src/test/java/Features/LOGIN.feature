@smoke
Feature: User should be able to login Tutioral Site
Scenario Outline: user should  able to go to next page;
Given  User wants to go to login site
When  user enter "<firstname>"   and "<lastname>"  
And fill up all the credentilas and pass date "10-31-2020"
And  fill up other forms
Then  user should able to go next page
Examples:
|firstname||lastname|
|john||smith|
|niraj||shakya|