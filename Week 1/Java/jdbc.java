package com.revature;

import java.sql;

public class jdbc {
    public static void main(String[] args) {
        // JDBC code to connect to a database and perform operations
        // This is just a placeholder and will not run without proper database setup

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "postgres";
        String password = "pass";

        try {
            // Establishing a connection
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println(connection.isValid(timeout:5)); // Checking if the connection is valid
            System.out.println("Connected to the database successfully!");

            // Creating a statement
            Statement statement = connection.createStatement();

            // Executing a query
            String sql = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(sql);

            // Processing the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // Closing the connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}