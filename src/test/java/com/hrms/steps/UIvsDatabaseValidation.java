package com.hrms.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UIvsDatabaseValidation {

	@Given("user is on employee list page")
	public void user_is_on_employee_list_page() {
	    
	}

	@When("user retrive all data from the ui")
	public void user_retrive_all_data_from_the_ui() {
	   System.out.println("User retrieves values from ui table");
	}

	@When("user retrive all data from database using below query")
	public void user_retrive_all_data_from_database_using_below_query(DataTable query) {
	   System.out.println(query.asList().get(0));
	   System.out.println(query.asList().get(1));
	}

	@Then("user compare both data and it should match")
	public void user_compare_both_data_and_it_should_match() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user logs out")
	public void user_logs_out() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("user validates that dropdown")
	public void user_validates_that_dropdown(io.cucumber.datatable.DataTable data) {
	   System.out.println(data.asList().get(0));
	   System.out.println(data.asList().get(1));
	} 
}
