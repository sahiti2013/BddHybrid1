Feature: Able to contact customer services team @smoke

  @RegressionTest
  Scenario Outline: Verify user can able to contact CustomerServices sucessfully
    Given user on Home page
    When user Clicks Contact Us button
    Then user should see contactUs page.
    #Given as user on ContactUs page.
    When user selects Subject Heading as "<Heading>"
    And user enters Email as "<Email>"
    And selects order refrence as "<OrderRefrence>"
    And attaches file "<FilePath>"
    And enters Message as "<TypeMessage>"
    And clicks Send button
    Then user should see Feedback message as "<Feedback Message>"
    Examples:

      | Heading | Email               | OrderRefrence          | FilePath                                    | TypeMessage             | Feedback Message                                     |
      | 2       | sahisunny@gmail.com | JRHZDVQKU - 10/12/2017 | C://BddHybrid1//src//main//resources//7.png | Wrong Product Delivered | Your message has been successfully sent to our team. |