Feature: Login functionality

Background: User is on main page
Given user launch browser with exe"D:\\dhana\\Automation support\chromedriver.exe"
Given user provide url as"http://primusbank.qedgetech.com/"


Scenario: Login functionality with valid credentials
When user provide "Admin" as username
When user provide "Admin" as password
When user click on login button 
Then application shows user profile to user