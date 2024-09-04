@Multipledata
Feature: Multiple data on Register form

@Reg @sanity
Scenario Outline: Validate the reg form with multiple data
Given Launch chrome browser
And Open the url "https://demo.automationtesting.in/Register.html"
Then User validate the application title
When User clicks the fname and enter the value "<FirstName>"
And User click the lastName and enter "<LastName>" in lastname field
And User enter the email "<Email>"

Examples:
|FirstName|LastName|Email|
|TestFirstName|TestLastname|abc@test.com|
|Testfname1|Testlname1|abc1@test.com|
|Testfname2|Testlname2|abc1@test.com|

@sanity
Scenario: Varify page title
Given Launch chrome browser
And Open the url "https://demo.automationtesting.in/Register.html"
Then User validate the application title

