@home
Feature: Validate the Web page Application

Background:

Given Launch the Browser 
And Open the application
@veedu
Scenario Outline: Enter the all type of credentials

When  Enter the "<username>"and "<password>" 
And Click the Login button
Then Validate the Login Page 
And Close the Browser
Then Validate the browser closed or not

Examples:

|username||password|
|vigneshwaran9721111||y3sJ3ZVNFc@GsWFfffffff|
|queiujdhhhhhhh||uyyyyuiukkkkkkkkkk|

Scenario Outline: Enter the all credentials

When  Enter the "<username>" and "<password>" 
And Click the Login button
Then Validate the Login Page 
And Close the Browser
Then Validate the browser closed or not

Examples:

|username||password|
|aaaaaaakkkkkkk||y3sJ3ZVNFc@GsWFfffffff|
|dgggdd||000000000|