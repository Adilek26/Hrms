package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class MataData {
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	//jdbc:driver type:hostname:port/db name
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	
	@Test
	public void dbMetadata() throws SQLException {
		//This is information about Database
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		//additonal data base but explain databasemetedata or resultsetmetadata
		DatabaseMetaData dbMetaData= conn.getMetaData();
		//to get drivername
		String driverName=dbMetaData.getDriverName();
		// to get databaseversion name
		String dbVersion=dbMetaData.getDatabaseProductVersion();
		System.out.println(driverName);
		System.out.println(dbVersion);
		
	}
	//query - display all the info about employee whose emp_number si 14688
	@Test
	public void rsMetadata() throws SQLException {
		// This is about additional  information from Metadata
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st= conn.createStatement();
		ResultSet rs =st.executeQuery("select * from hs_hr_employees where emp_number = 14688");
		ResultSetMetaData rsMetadata = rs.getMetaData();
		int colNumbers=rsMetadata.getColumnCount();
		System.out.println(colNumbers);
		String colName1=rsMetadata.getColumnName(1);
		System.out.println(colName1);
		
		for(int i=1; i<=colNumbers; i++) {
			String colNames= rsMetadata.getColumnName(i);
			System.out.println(colNames);
		}
		rs.close();
		st.close();
		conn.close();
	}
}
