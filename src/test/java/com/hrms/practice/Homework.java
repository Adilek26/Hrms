package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Homework {
	//MetaData implemantations
	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";
	String dbUrl="jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	
	@Test
	public void dbMetadata() throws SQLException {
		Connection conn=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		DatabaseMetaData dbMetaData=conn.getMetaData();
		String driverName=dbMetaData.getDriverName();
		String driverP=dbMetaData.getDatabaseProductName();
		String driverG=dbMetaData.getSQLKeywords();
		System.out.println(driverName+" DatabaseProductName: "+driverP+" SQLKeywords: "+driverG);
	}	
		//hw get the resultset metadata store it in the 
		//arraylist and retrieve from array list
		//also get column name get the table type name which table you want
			@Test
	public void rsetMetadata() throws SQLException {
		Connection conn=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from hs_hr_emp_dependents");
		ResultSetMetaData rsMetadata=rs.getMetaData();
		List<String> empDep=new ArrayList<>();
		while(rs.next()) {
		empDep.add(rs.getObject("ed_relationship_type").toString());
		}
		
		System.out.println(empDep);
		for(Object ed:empDep) {
			System.out.println(ed);
		}
		int columnName=rsMetadata.getColumnCount();
		for(int i=1; i<=columnName; i++) {
		String colName=rsMetadata.getColumnName(i);
		
		System.out.println(colName);
		}
		//table type name
		String tableName=rsMetadata.getTableName(1);
		System.out.println("TableName: "+tableName);
			
			}
	
}
