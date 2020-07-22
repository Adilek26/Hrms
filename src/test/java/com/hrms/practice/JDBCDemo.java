package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class JDBCDemo {
	
	String dbUsername= "syntax_hrm";
	String dbPassword="syntaxhrm123";
	//jdbc:type driver :type:host :port:name/db name
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	@Test//to execute workbench junit annotation
	public void abc() throws SQLException {
		//connecting to data base
		Connection conn =DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		System.out.println("DB connection is successful");//to check that my connection is succesful
		Statement st =conn.createStatement();//create a statement to connect
    	ResultSet rs = st.executeQuery("select* from hs_hr_employees");
		rs.next();//iterator give back to boolean
		String firstname=rs.getString("emp_firstname");
		System.out.println(firstname);
		rs.next();
		// if you don't know it is int or string
		String firstname2=rs.getObject("emp_firstname").toString();
		System.out.println(firstname2);
		
		//we we don't know how mwny value we will have bcs of it we use while loop
		String allData;
		while(rs.next()){
			allData =rs.getObject("Emp_firstname").toString();
			System.out.println(allData);
		}
		//if don't want to memory leakuage
		rs.close();//retrieve statement
		st.close();//statement
		conn.close();//connection
		
	}
	
}
