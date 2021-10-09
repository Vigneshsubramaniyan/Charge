@run
Feature: Validate the Web page Application

Background:

Given Launch the Browser 
And Open the application
@oodu
Scenario Outline: Enter the all type of credentials

When  Enter the "<username>" and "<password>" 
And Click the Login button
Then Validate the Login Page 
And Close the Browser
Then Validate the browser closed or not

Examples:

|username||password|
|vigneshwaran9721||y3sJ3ZVNFc@GsWF|
|1234457||12253666777|
|queiujd||uyyyyuiu|

