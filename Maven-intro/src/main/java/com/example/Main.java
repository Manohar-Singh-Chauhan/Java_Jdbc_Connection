package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
         int a = 10 / 2;
        int b = 20 / 4;
        int c = 60 / 6;
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy_db","root","12345678");
        Statement statement = connection.createStatement();
        statement.execute("create table jbdl(id int, name varchar(30))");
    }
}
