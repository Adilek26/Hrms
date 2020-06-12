package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

import HrmsTestBase.BaseClass;



public class DashboardPageElements extends CommonMethods{
	
	@FindBy(id = "welcome")
	public WebElement welcome;
	
      @FindBy(xpath="//div[@id='branding']/a[1]/img")
      public WebElement logo;
      
      @FindBy(xpath="//a[@id='menu_pim_viewPimModule']")
      public WebElement Pim;
      
      @FindBy(xpath="//a[@id='menu_pim_addEmployee']")
      public WebElement addEmployee;
      
      @FindBy(id="menu_pim_viewEmployeeList")
  	public WebElement empListPage;
      
      @FindBy(xpath="//div[@class='menu']/ul/li")
  	public List<WebElement> dashMenu;
      
      @FindBy(id = "menu_core_viewDefinedPredefinedReports")
  	public WebElement reports;
      
     
      public DashboardPageElements() {
  		PageFactory.initElements(BaseClass.driver, this);
  	}
      public void navigateToAddEmployee() {
    	  jsClick(Pim);
    	  jsClick(addEmployee);
      }
      
      public void navigateToReports() {
    	  jsClick(Pim);
    	  jsClick(reports);
      }
      
}


