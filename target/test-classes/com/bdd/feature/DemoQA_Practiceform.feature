Feature: Practice for of demoQA

Background:
Given Launch chrome browser
And Open the url "https://demo.automationtesting.in/Register.html"

@test
Scenario: Validating demoQA Registerform
Then User validate the application title
When User clicks the fname and enter the value "TestFirstName"
And User validate the tittleee
And User click the lastName and enter "TestLastname" in lastname field
And User enter the email "abc@test.com"
And User Click the "Male" radio button
Then User validate the Maleradio button is clicked
When User close the browser "test"

@sanity
Scenario: Validate Checkbox in Registerform
When User click "Reading" checkbox
Then User validate REading checkbox is checked