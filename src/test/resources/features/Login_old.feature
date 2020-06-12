Feature: Login

	
  Scenario: valid admin login
    When user enter valid admin username and password
    And user click on login button
    Then admin user is successfully logged in


  Scenario: valid ess login
    When user enter valid ess username and password
    And user click on login button
    Then ess user is successfully logged in
    
   
     Scenario Outline:
     When user enter valid "<UserName>" and "<Password>"
     And user click on login button
     Then "<FirstName>" is successfully logged in
     Examples:
     | UserName |Password | FirstName |
     |Admin | Hum@nhrm123 |Admin |
     | abd77 |Syntax123! | Abdullah |

	
  Scenario: Login with valid username and invalid password
    When User enter valid username and invalid password
    And user click on login button
    Then User see Invalid Credentials text on login page
   
