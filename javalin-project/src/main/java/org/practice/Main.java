package org.practice;

import io.javalin.Javalin;
import org.practice.models.User;
import org.practice.utils.InitializeDB;

public class Main {
    public static void main(String[] args) {

//        InitializeDB.initializeDB();
        InitializeDB.initializeTables();

        String uuid = java.util.UUID.randomUUID().toString();

        User u1 = new User("john", "doe", "john@gmail.com", "000000");
        User john = u1.createUser(u1);
        System.out.println(john);

//    System.out.println(user1.getClass().getSimpleName());
//    System.out.println(user1.getClass().getEnclosingMethod().getName());

//
//
//
//        var app = Javalin
//                          .create()
//                          .get("/", ctx -> ctx.result("ciao").status(200))
//                          .start(4000);
    }

}