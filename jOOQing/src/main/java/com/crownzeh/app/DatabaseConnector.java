package com.crownzeh.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    public static Connection getConnection() {
        return connection;
    }

    private static Connection connection;

    public static void connectToDatabse() {
        connection = null;
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
        }

    }

    public static void closeConnection(){
        try {
            connection.close();
            System.out.println("DatabaseConnector has finished its life.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }


}
