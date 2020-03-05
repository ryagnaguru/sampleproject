package com.ygr.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSqlExample {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/orgdetails",
					"postgres", "postgres");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM public.employee");
			while (resultSet.next()) {
				System.out.println(resultSet.getBoolean("empId"));
				System.out.printf("%s %s %s", resultSet.getString("firstName"), resultSet.getString("lastName"), resultSet.getString("empId"));
			}

		} catch (SQLException e) {
			System.out.println("Connection failure.");
			e.printStackTrace();
		}
	}
}