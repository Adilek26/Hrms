package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchSteps extends CommonMethods {
	@Given("user is navigated to HRMS")
	public void user_is_navigated_to_HRMS() {
	  setUp();
	}

	@Given("user navigate to employee list page")
	public void user_navigate_to_employee_list_page() {
	    jsClick(dashboard.Pim);
	    jsClick(dashboard.empListPage);
	}

	@When("user enters valid employee id {string}")
	public void user_enters_valid_employee(String empId) {
	   sendText(viewEmp.empID,empId);
	}

	@When("click on search button")
	public void click_on_search_button() {
		jsClick(viewEmp.searchBtn);
		
	}

	@Then("user see employee information is displayed")
	public void user_see_employee_information_is_displayed() {
	   System.out.println("Employee page is displayed");
	   tearDown();
	}

	@When("user enters valid employee {string} and {string}")
	public void user_enters_valid_employee_name_and_lastname() {
	   sendText(viewEmp.empName,"Douglas");
	}

	
}
