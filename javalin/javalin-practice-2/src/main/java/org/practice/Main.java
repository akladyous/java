package org.practice;

import io.javalin.Javalin;
import org.practice.models.User;
import org.practice.services.users.UserServices;
import org.practice.utils.InitializeDB;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Main {
    private static UserServices userService = new UserServices();

    public static void main(String[] args) throws SQLException, NoSuchFieldException, IllegalAccessException {
    

//        InitializeDB.initializeTables();
//        String uuid = UUID.randomUUID().toString();
//        System.out.println("uuid : " + uuid);
//        UsersTable.info();

        all();
//        create();
//        get(4);
//        update(3);
//        delete(7);




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
    public static void get(int id){
        System.out.println("get user");
        User u1 = userService.getUser(id);
        System.out.println("user by id : " + u1);
        System.out.println("-".repeat(40));
    }
    public static void update(int id){
        User user = userService.getUser(id);
        if ( user == null ) {
            System.out.println("user not found");
            return;
        }
        System.out.println("updating user : ");
        System.out.println(user);
        System.out.println("with : ");
        user.firstName = "john";
        user.lastName = "travolta";
        user.email = "john_travolta@gmail.com";
        User john = userService.updateUser(user);
        System.out.println("update user : \n");
        System.out.println(john);
        System.out.println("-".repeat(40));
    }
    public static void delete(int id){
        System.out.println("delete user\n");
        Boolean isDelete = userService.deleteUser(id);
        if (isDelete) {
            System.out.println("user deleted successfully");
        } else {
            System.out.println("error deleting user");
        }
        System.out.println("-".repeat(40));
    }

}