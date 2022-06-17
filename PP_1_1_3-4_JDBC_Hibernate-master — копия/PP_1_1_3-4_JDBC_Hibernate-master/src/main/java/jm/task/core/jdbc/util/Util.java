package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/users?serverTimezone=Europe/Moscow&allowPublicKeyRetrieval=true&useSSL=false&autoReconnect=true";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Sdi+hu+2121=%";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Done!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Error!");
        }

        return connection;
    }
    // реализуйте настройку соеденения с БД
}
