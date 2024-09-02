Feature: Login feature for Leaftaps

Scenario: Login using vaild credentials

#Given Launch the browser and load the url
And Enter username 
And Enter password
When Click on login button
Then Verify sucessful login

