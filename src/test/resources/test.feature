@Tag1
Feature: Login Test
This features talk about the positive and negative test senerios
Hey
Whatsssp Up

@Tag2
Scenario: Succesfull login scenarios
Given I am able to access magento Web page
When I update teh user name as "natarajan.ramanathan93@gmail.com"
And I update the password as "Welcome123"
And I click on the login botton
Then I should find the magento id as "ID: MAG003417822"

@Tag3
Scenario Outline: Invalid Login
Given I am able to access magento Web page
When I update teh user name as "<user>"
And I update the password as "<pwd>"
And I click on the login botton
Then I should see the error message as "Invalid login or password."
Examples:
|user						|pwd				|
|nat@gmail.com	|password2	|
|test@gmail.com	|justTest		|

