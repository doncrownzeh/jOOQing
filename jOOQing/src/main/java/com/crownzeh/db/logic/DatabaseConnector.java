package com.crownzeh.db.logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

	public static Connection connectToDatabse() {
		Connection connection = null;
		 try {
	        	try {
	        		Class.forName("org.postgresql.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
	        	String url = "jdbc:postgresql://localhost:5432/workout";
	        	String login = "postgres";
	        	String password = "dbpass";
	            connection = DriverManager.getConnection(url, login, password);
	            System.out.println("Connection to PostgreSQL databse has been established.");
	            
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        } finally {
				   System.out.println("DatabaseConnector has finished his work.");		
	        }
	        return connection;
	}
	
	

}
