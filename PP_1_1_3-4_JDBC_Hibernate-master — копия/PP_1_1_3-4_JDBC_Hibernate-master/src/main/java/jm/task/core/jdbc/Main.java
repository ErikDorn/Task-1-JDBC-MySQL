package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) throws SQLException {
        userService.createUsersTable();
        userService.dropUsersTable();
        userService.saveUser("Monkey", "John", (byte) 78);
        userService.saveUser("Triple", "Deep", (byte) 74);
        userService.saveUser("Mark", "Burn", (byte) 59);
        userService.saveUser("Valera", "GoodGuy", (byte) 74);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();
    }
}
