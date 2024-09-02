Feature: Create account in leaftaps

Scenario Outline: Creating multiple account

#Given Launch the browser and load the url
And Enter username 
And Enter password 
When Click on login button
Then Verify sucessful login

When Click crmsfa link
And Click Accounts tab

And Click create account tab
Given Enter account name <aname>
And Enter description <des>
When Click create account button
Then Get account ID

Examples:
|aname|des|
|'Maha'|'Tester'|
|'Aswathi'|'Tester'|
