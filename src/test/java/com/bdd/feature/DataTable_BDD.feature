Feature: This feature file is about datatable

Scenario: Validate the reg form using datatable
Given Launch chrome browser
And Open the url "https://demo.automationtesting.in/Register.html"
Then User validate the application title
When User clicks the fname and enter the value in FirstName
|FirsttName|
|helo|
And User enter value in lastname and email
|LastName|Email|
|testlastname|abc@gmail.com|