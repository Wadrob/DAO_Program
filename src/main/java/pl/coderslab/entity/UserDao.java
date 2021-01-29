package main.java.pl.coderslab.entity;

import java.sql.Connection;
import java.sql.SQLException;

public class UserDao {
    public static void main(String[] args) throws SQLException {

        Connection connection = DbUtil.getConnection();
        System.out.println(connection);
    }
}
