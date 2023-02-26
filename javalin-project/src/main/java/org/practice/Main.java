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
//        UsersTable.info();

        create();

//
//
//        var app = Javalin
//                          .create()
//                          .get("/", ctx -> ctx.result("ciao").status(200))
//                          .start(4000);
    }

    public  static void all(){
        ArrayList<User> users = (ArrayList<User>) userService.getAllUsers();
        System.out.println("getAllUsers");
        System.out.println(users);
        System.out.println("-".repeat(40));
    }
    public static void create(){
        System.out.println("create user");
        String email = UUID.randomUUID().toString().replace("-","").substring(0,8).concat("@gmail.com");
        User user = new User("firstname 1", "lastname 1", email, "000000");
        user = userService.createUser(user);
        System.out.println("John instance : " + user);
        System.out.println("-".repeat(40));
    }
    public static void get(){
        System.out.println("get user");
        User u1 = userService.getUser(1);
        System.out.println("user by id : " + u1);
        System.out.println("-".repeat(40));
    }
    public static void update(){
        User user = userService.getUser(1);
        System.out.println("update user");
        user.firstName = "john";
        user.lastName = "travolta";
        user.email = "john_travolta@gmail.com";
        User john = userService.updateUser(user);
        System.out.println("update user : \n");
        System.out.println(user);
        System.out.println("-".repeat(40));
    }
    public static void delete(){
        System.out.println("delete user\n");
        Boolean isDelete = userService.deleteUser(2);
        if (isDelete) {
            System.out.println("user deleted successfully");
        } else {
            System.out.println("error deleting user");
        }
        System.out.println("-".repeat(40));
    }

}