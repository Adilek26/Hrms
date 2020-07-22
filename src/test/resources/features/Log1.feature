#Author: adilek.26@gmail.com
#@sprint5 @login
#
 #@smoke
     #Scenario Outline:
     #When user enter valid "<UserName>" and "<Password>"
     #And user click on login button
     #Then "<FirstName>" is successfully logged in
     #Examples:
     #| UserName |Password | FirstName |
     #|Admin | Hum@nhrm123 |Admin |
     #| abd77 |Syntax123! | Abdullah |
     #@regression
     #Scenario Outline: Negative Login Error Message Validation
  #When user enter "<Username>" and "<Password>" 
  #And user click on login button
  #Then user see "<ErrorMessage>"
  #Examples: 
  #| Username | Password  | ErrorMessage                  |
  #| Admin    | Qwerty123 | Invalid credentials       |
  #| Hello    | Syntax123!| Invalid credentials |
  #| Admin123 | Qwer123   | Invalid credentials       |
  #|          | admin123  | Username cannot be empty  |
  #| Admin    |           | Password cannot be empty  |