Feature: Create account in leaftaps

Scenario: Creating multiple account

#Given Launch the browser and load the url
And Enter username 
And Enter password 
When Click on login button
Then Verify sucessful login

When Click crmsfa link
And Click Accounts tab

And Click on Find Accounts tab
Given Enter the name to  as 'Aswathi'
When Click on Find accounts button
And Click on edit name
And Click edit tab

Given   Select Industry
And Select Ownership
And Select Currency
When Click save button



