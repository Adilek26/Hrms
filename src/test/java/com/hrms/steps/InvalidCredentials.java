package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.When;

public class InvalidCredentials extends CommonMethods{
	@When("user enter invalid {string},{string}, and user see {string}")
	public void user_enter_invalid_and_user_see(String username, String password, String errmessage, io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String,String>>invld=dataTable.asMaps();
	   for(Map<String,String>credential:invld) {
		   sendText(login.username,credential.get("UserName"));
		   sendText(login.password,credential.get("Password"));
		   jsClick(login.loginBtn);
		  String act= login.errorMsg.getText();
		  String exp=credential.get("ErrorMessage");
		  Assert.assertEquals("Mismatch errg", exp, act);
		  
	   }


	}
}

