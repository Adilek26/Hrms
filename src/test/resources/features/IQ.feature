Feature: Login Error Message Validation


 Scenario: Negative Login Error Message Validation
  When i enter username and password I see error message
  
  | username | password  | errorMsg                  |
  | Admin    | Qwerty123 | Invalid credentials       |
  | Admin    |           | Password cannot be empty |
  | Admin123 | Qwer123   | Invalid credentials       |
  |          | admin123  | Username cannot be empty  |
  |          |           | Username cannot be empty  |
  
 