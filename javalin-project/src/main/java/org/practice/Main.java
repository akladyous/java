package org.practice;

import io.javalin.Javalin;
import org.practice.DAOs.users.UsersDAO;
import org.practice.models.User;
import org.practice.services.users.UserServices;
import org.practice.services.users.UsersTable;
import org.practice.utils.InitializeDB;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

public class Main {
    private static UserServices userService = new UserServices();

    public static void main(String[] args) throws SQLException, NoSuchFieldException, IllegalAccessException {
        InitializeDB.initializeTables();
        String uuid = UUID.randomUUID().toString();
        System.out.println("uuid : " + uuid);
        //UsersTable.info();

        ArrayList<User> users = (ArrayList<User>) userService.getAllUsers();
        System.out.println("getAllUsers");
        System.out.println(users);
        System.out.println("-".repeat(40));

        System.out.println("create user");
        String email = UUID
                           .randomUUID()
                           .toString()
                           .replace("-","").substring(0,8)
                           .concat("@gmail.com");
        User will = new User("Will", "Smith", email, "000000");
        will = userService.createUser(will);
        System.out.println("John instance : " + will);
        System.out.println("-".repeat(40));

        System.out.println("get user");
        User u1 = userService.getUser(1);
        System.out.println("user by id : " + u1);
        System.out.println("-".repeat(40));

        System.out.println("update user");
        will.firstName = "john";
        will.lastName = "travolta";
        will.email = "john_travolta@gmail.com";
        User john = userService.updateUser(will);
        System.out.println("update user : \n");
        System.out.println(will);
        System.out.println("-".repeat(40));

        // delete user
        System.out.println("delete user\n");
        Boolean isDelete = userService.deleteUser(2);
        if (isDelete) {
            System.out.println("user deleted successfully");
        } else {
            System.out.println("error deleting user");
        }
        System.out.println("-".repeat(40));
//
//
//
//        var app = Javalin
//                          .create()
//                          .get("/", ctx -> ctx.result("ciao").status(200))
//                          .start(4000);
    }

}