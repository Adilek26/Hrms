Feature: Sace Demo Login

Scenario: invalid login
Given user is on employee list page
When user retrive all data from the ui 
And user retrive all data from database using below query
    | select emp_firstname, emp_lastname, emp_birthday , hs_hr_employee; |
Then user compare both data and it should match
And user logs out

Scenario: invalid login
Given user is on employee list page
And user enters following names and click on enter
|John|
|Omer|
|Hichem|
|Sarmed|
And user validates that dropdown 
|Jan|
|Feb|
|Mar|
|Apr|
|May|
|Jun|
|Jul|
|Aug|
|Sep|
|Oct|
|Now|
|Dec|
Then user compare both data and it should match
And user logs out