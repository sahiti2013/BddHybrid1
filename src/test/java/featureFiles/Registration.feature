@regression2
Feature: registration feature for AutomationPractice site
  As an User
  I want to see account created successfully

  Scenario: verify that user created a New Account
    Given user on Home page
    When user click the SignIn button in home page
    And enters a valid email as "parne123@gmail.com"
    And clicks Create An Account button
    Then user will be on Register page
    When user have clicked on MRS tiltle
    And user have entered a First Name as "sahi"
    And user have entered a Last Name as "sunny"
    And user have entered a Email "advithreddi@gmail.com"
    And user have entered a Password as "sahisunny"
    And user have selected Date Of Birth "1" "10" "2015"
    And in YOUR ADDRESS section user have entered First Name as "sahi"
    And user have entered a Last name in address as "sunny"
    And user have entered a Address as "1234 melton rd"
    And user have entered a City "london"
    And user have selected a state "5"
    And user have entered a Zip/PostalCode "12345"
    And user have selected a Country "United States"
    And user have entered a Additional Information "Leicestershire"
    And user have entered a Home Phone "011678905332"
    And user have entered a Mobile Phone as " 12334567887"
    And user have entered in Assign an address alias for future reference text box as "same address"
    And user clicks on the Register button
    Then user account created successfully

  @regression3
  Scenario Outline: verify account creation validation message
    Given user on Home page
    When user click the SignIn button in home page
    And enters a valid email as "<ValidEmail>"
    And clicks Create An Account button
    Then user will be on Register page
    When user have clicked on MRS tiltle
    And user have entered a First Name as "<FirstName>"
    And user have entered a Last Name as "<LastName>"
    And user have entered a Email "<EmailId>"
    And user have entered a Password as "<Password>"
    And user have selected Date Of Birth "<date>" "<month>" "<year>"
    And in YOUR ADDRESS section user have entered First Name as "<FirstNameAddress>"
    And user have entered a Last name in address as "<LastNameInAddress>"
    And user have entered a Address as "<Address>"
    And user have entered a City "<City>"
    And user have selected a state "<StateValue>"
    And user have entered a Zip/PostalCode "<PostalCode>"
    And user have selected a Country "<Country>"
    And user have entered a Additional Information "<AdditionalInfo>"
    And user have entered a Home Phone "<HomePhone>"
    And user have entered a Mobile Phone as "<MobileNum>"
    And user have entered in Assign an address alias for future reference text box as "<Alias>"
    And user clicks on the Register button
    Then User should see feedback message as "<FeedBackMessage>"
    Examples:
      | ValidEmail         | FirstName | LastName | EmailId            | Password  | date | month | year | FirstNameAddress | LastNameInAddress | Address        | City   | StateValue | PostalCode | Country       | AdditionalInfo | HomePhone   | MobileNum   | Alias        | FeedBackMessage                                                                  |
      | sahisera@gmail.com | sahi      | reddy    | sahisera@gmail.com | sahisunny | 10   | 7     | 2014 | sahiti           | daida             | 12 blount rd   | London | 5          | 123454568  | United States | Leicestershire | 01163546789 | 0775357853  | Same Address | The Zip/Postal code you've entered is invalid. It must follow this format: 00000 |
      | sahisera@gmail.com | suny      |          | reddy              | sahisunny | 11   | 5     | 1988 | advith           | maryada           | 12 lonsdale rd | Kent   | 4          | 12345      | United States | dresses        | 984667865   | 09974532368 | Same Address | lastname is required.                                                            |

