package com.ygr.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSqlExample {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/orgdetails", "postgres",
					"postgres");

			Statement statement = connection.createStatement();
//			statement.execute("insert into employee values (2,'harshit', 'jain')");
			ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");
			while (resultSet.next()) {
				System.out.println();
				System.out.printf("firstName: %s  lastName: %s", resultSet.getString("firstName"), resultSet.getString("lastName"));
			}

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}