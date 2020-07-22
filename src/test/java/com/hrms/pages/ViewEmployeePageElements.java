package com.hrms.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HrmsTestBase.BaseClass;

public class ViewEmployeePageElements {

	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement empName;

	@FindBy(id = "empsearch_id")
	public WebElement empID;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;
	
	@FindBy(xpath="//div[@id='profile-pic']//h1")
	public WebElement profilePic;   
	
	//for  SQL Name validation against DB
//		public List<Map<String,String>> getFirstNameFromTable(){
//			List<Map<String,String>> uiName=new ArrayList();
//					for( WebElement row:tableFirstName_1 ) {
//						Map<String,String> storeUiNames=new LinkedHashMap<>();
//						String tableName=row.getText();
//						storeUiNames.put("emp_firstName", tableName);
//						uiName.add(storeUiNames);
//					}
//			return uiName;
//			}

	public ViewEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
		
		
	}
}
