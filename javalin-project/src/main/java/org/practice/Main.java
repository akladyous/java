package org.practice;

import io.javalin.Javalin;
import org.practice.models.User;
import org.practice.utils.InitializeDB;

public class Main {
    public static void main(String[] args) {

        User u1 = new User();


//    System.out.println(user1.getClass().getSimpleName());
//    System.out.println(user1.getClass().getEnclosingMethod().getName());

        System.out.println("prova");
        InitializeDB.initializeDB();
        InitializeDB.initializeTables();



        var app = Javalin
                          .create()
                          .get("/", ctx -> ctx.result("ciao").status(200))
                          .start(4000);
    }

}