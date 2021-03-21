Feature: CRUD Article on BBlog website

Scenario: CRUD(Create,Read,Update,Delete) article
Given I navigate and login to BaseBack website
Then I login into the BBlog website
And I create an article
And I click on  my profile and ReadMore button for created article
And I read the article details
And I click on  my profile and ReadMore button for created article
And I edit the created article details
And I click on  my profile and ReadMore button for created article
Then I delete the created article
Then I logged out






