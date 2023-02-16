Feature: Login functionality

Background: User is on main page
Given user launch browser with exe"D:\\dhana\\Automation support\chromedriver.exe"
Given user provide url as"http://primusbank.qedgetech.com/"
When user provide "Admin" as username
When user provide "Admin" as password
When user click on login button 
When user click on Branches
When user provide "INDIA" as country
When user provide "MAHARASTRA" as state
When user provide "MUMBAI" as city
When user click on search 
Then user get branch details
Then user click on clear button
Then user click on Roles 
Then user click on Users 
Then user click employee

Scenario: New employee creation functionality
When user click on new employee
When user provide  "Dhanashree" as Employer Name 
When user provide  "Dhanashree" as Login Password
When user provide  "abcd" as Role
When user provide  "Mumbai" asBranch
Then user click on submit button
Then user click on ok 
Then user click on logout button