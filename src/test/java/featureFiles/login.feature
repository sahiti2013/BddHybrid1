@Regression
Feature:registration feature for AutomationPractice site
  As an User
  I want to see RegistrationPage

#happy path scenario
  @EnterValidEmail
  Scenario: verify that can navigate to RegistrationPage
    Given User on home Page
    When user Clicks SignIn button
    And User enters email as "testemail123@gmail.com"
    And Clicks Create An Account button
    Then user should be on Registration Page

#Unhappy path scenario
  @EnterInvalidEmail
  Scenario Outline:Verify Email validation Feedback message
#    Given User on home Page
#    When user Clicks SignIn button
    Given user on Home page
    When user click the SignIn button in home page
    And enters a valid email as "<ValidEmail>"
    And clicks Create An Account button
    Then User should see feedback message as "<FeedBackMessage>"
    Examples:
      | ValidEmail | FeedBackMessage        |
      | testmail   | Invalid email address. |
      | 1233       | Invalid email address. |

