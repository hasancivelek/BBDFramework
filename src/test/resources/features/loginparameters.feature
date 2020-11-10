 @web
  Feature: Login Admin Feature
    Background:
      Given I am on admin panel page
    @parameters
      Scenario Outline: Verify invalid login for multiple users
        When I enter <username> into username text fields on admin page
        And I enter <password> into password text fields on admin page
        And I click on login button on admin login page
        Then I verify that I used invalid credentials

        Examples:
        | username       | password |
        |hasan@gmail.com | 123ed    |
        |jim@hotmail.com | 12345    |
        |liz@yahoo.com   | 233edf45 |