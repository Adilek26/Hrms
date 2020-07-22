package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class exPage {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	//jdbc:driver type:hostname:port/db name
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	
	@Test
	public void abc() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		System.out.println("DB connection is successful");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from hs_hr_employees");
		rs.next();
		String firstname=rs.getString("emp_firstname");
		System.out.println(firstname);
		rs.next();
//		String firstname2=rs.getString("emp_firstname");//instead of this 
//		System.out.println(firstname2);
		String firstname2=rs.getObject("emp_firstname").toString();
		System.out.println(firstname2);
		
		String allData;
		while(rs.next()) {
			allData=rs.getObject("Emp_firstname").toString();//it is not case sensetive
			System.out.println(allData);
			
		}
		
//		retrieve all the job titles and store them in arraylist and show it 
//		in console it from array list
//		Task1
		Connection conn1 = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st1 = conn1.createStatement();
				ResultSet rs1=st1.executeQuery("select * from ohrm_job_title");
				List<String> jobTitles=new ArrayList<>();
				while(rs1.next()) {
					jobTitles.add(rs1.getObject("job_title").toString());
				}
				System.out.println(jobTitles);
				for(String jt :jobTitles) {
					System.out.println(jt);
				}
				
	
		rs.close();
		st.close();
		conn.close();
		
	}

			
}		

			

