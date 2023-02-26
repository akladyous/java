package org.practice;

import io.javalin.Javalin;
import org.practice.DAOs.users.UsersDAO;
import org.practice.models.User;
import org.practice.services.users.UsersTable;
import org.practice.utils.InitializeDB;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws SQLException, NoSuchFieldException, IllegalAccessException {



        InitializeDB.initializeTables();
        String uuid = java.util.UUID.randomUUID().toString();
//
        User userDAO = new User("john", "doe", "john@gmail.com", "000000");

        UsersTable.info();
//        User john = userDAO.createUser(userDAO);
//        System.out.println(john);
//
//        ArrayList<User> users = (ArrayList<User>) userDAO.getAllUsers();
//        System.out.println(users);
//
//        User u1 = userDAO.getUserByID(1);
//        System.out.println("user by id : " + u1);


//
//
//
//        var app = Javalin
//                          .create()
//                          .get("/", ctx -> ctx.result("ciao").status(200))
//                          .start(4000);
    }

}