@Regression1
Feature:add to cart feature for AutomationPractice site
  As an User
  I want to see summary of dresses added

#happy path Scenario:
@AddTOCart
Scenario Outline: Verify that user added dresses to cart successfully
Given user on Home page
When enters text in search box as "<Text>"
And clicks search button
Then user should see dresses displayed on the page
When user clicks Add To Cart button
And Clicks Continue Shopping
And again Clicks Add To Cart button
And Clicks Proceed To checkout button
Then user should see Summary of the items added successfully
Examples:
  |Text|
  |dresses|