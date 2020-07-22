package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class SaifinCodeleri {

	public class JDBCDemo {
		String dbUsername = "syntax_hrm";
		String dbPassword = "syntaxhrm123";
		// JDBC: driver type:hostname:port/dbName
		String url = "jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
		@Test
		public void dataBaseDemo() throws SQLException {
			Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);
			System.out.println("DB Connection is successful");
			System.out.println(connection);
			Statement st = connection.createStatement();
			ResultSet resultSet = st.executeQuery("select * from hs_hr_employees");
			System.out.println("FirstName" +"\t"+ "LastName");
			while (resultSet.next()) {
				String columnData = resultSet.getString("emp_firstname");
				String columnData1 = resultSet.getString("emp_lastname");
				System.out.println(columnData + "\t\t"+ columnData1);
			}
			resultSet.close();
			st.close();
			connection.close();
		}
	}
}
