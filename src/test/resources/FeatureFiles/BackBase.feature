Feature: CRUD Article on BBlog website

Scenario: CRUD(Create,Read,Update,Delete) article
Given I navigate to Application
And I login into the Application
And I entered details in the post
Then I clicked profile and ReadMore
And I read details in the post
Then I clicked profile and ReadMore
And I edited details in the post
Then I clicked profile and ReadMore
Then I deleted details in the post
Then I logged out






