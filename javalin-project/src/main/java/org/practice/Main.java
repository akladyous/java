package org.practice;

import io.javalin.Javalin;
import org.practice.models.User;
import org.practice.utils.App;

public class Main {
    public static void main(String[] args) {

//    User user1 = new User();

//    System.out.println(user1.getClass().getSimpleName());
//    System.out.println(user1.getClass().getEnclosingMethod().getName());

        System.out.println("prova");
        App.initializeDB();
        App.initializeTables();


    //    var app = Javalin
    //                      .create()
    //                      .get("/", ctx -> ctx.result("ciao").status(200))
    //                      .start(4000);
    }

}