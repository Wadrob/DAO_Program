package main.java.pl.coderslab.entity;

import java.sql.*;
import java.util.Scanner;

public class DbUtil {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/workshop2?useSSL=false&characterEncoding=utf8";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "coderslab";
    private static final String CREATE_USER_QUERY = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    public static User createUser (User user){
        try (Connection connection = DbUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(CREATE_USER_QUERY)){
            preparedStatement.setString(1, user.Username);
            preparedStatement.setString(2, user.email);
            preparedStatement.setString(3, user.password);
            preparedStatement.executeUpdate();

            ResultSet rs = preparedStatement.executeQuery("SELECT * FROM users");
            while (rs.next()){
                String operator = rs.getString("email");
                int id = rs.getInt("id");
                if (operator.equals(user.email)){
                    user.id = id;
                }
            }
            System.out.println("Dodano do bazy z id: " + user.id);
            System.out.println("");
            return user;

        }
        catch (SQLException e){
            e.printStackTrace();
            return user;
        }
    }



}

