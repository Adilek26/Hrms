#Author: syntex team
@sprint6 @addEmployee
Feature: Add new Employee

  Background: 
    Given user is logged with valid admin credentials
    And user navigates to AddEmployeePage

  @mvn
  Scenario: Add Employee with first and lastname 
    When user enters employees "John" and "Smith"
    And user clicks save button
    Then "John Smith" is added successfully 
@regression
  Scenario: Add Employee without employee id
    When user enters employees first name and last name
    And user deletes employee id
    And user clicks save button
    Then employee is added successfully

@smoke
  Scenario: AddEmployee and create Login Credentials
    When user enters employees first name and last name
    And user clicks on create login checkbox
    And user enters login credentials
    And user clicks save button
    Then employee is added successfully

  #to perform DDT in cucumber we use scenerio Outline with Examples
  @smoke
  Scenario Outline: Adding multiple employees
    When User enter employees "<FirstName>", "<MiddleName>" and "<LastName>"
    And user clicks save button
    Then "<FirstName>","<MiddleName>" and "<LastName>" is added succesfully

    Examples: 
      | FirstName | MiddleName | LastName   |
      | James    | J          | Smith      |
      | Fatma   | F          | Ertam      |
      | Sohil    | S          | Arian |
      | Yunus    | Emre       | Eskisehir      |
      
       #adding multiple employees using Cucumber DataTable
  @inProgress
  Scenario: Adding multiple employees
    When user enters employee details and click on save then employee is added
      | FirstName | MiddleName | LastName |
      | John      | J          | Doe      |
      | Jane      | J          | Smith    |
      
      
      @excel
Scenario: Adding employees from excel
When user enters employee data form "Employee1" excel sheet then employee is added