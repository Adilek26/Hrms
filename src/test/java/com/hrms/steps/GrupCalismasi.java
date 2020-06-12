package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class GrupCalismasi extends CommonMethods {
	@When("i enter username and password I see error message")
	public void i_enter_username_and_password_I_see_error_message(io.cucumber.datatable.DataTable dataTable) {

		
		List<Map<String,String>>maps=dataTable.asMaps();
		 for (Map<String, String> map : maps) {
	          sendText(login.username, map.get("username"));
	          sendText(login.password, map.get("password"));
	          click(login.loginBtn);
	          String expected = map.get("errorMsg");
	          String actual = login.errorMsg.getText();
	          Assert.assertEquals("Mismatch error message", expected, actual);
	      }
	
	  }
	    @When("i enter {string} and {string} I see {string}")
	    public void i_enter_and_I_see(String string, String string2, String string3) {
	      login.login(string, string2);
	      String actual = login.errorMsg.getText();
	      Assert.assertEquals("Mismatch error message", string3, actual);
	    }

	}


