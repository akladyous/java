package org.practice;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {

        var app = Javalin
                          .create()
                          .get("/", ctx -> ctx.result("ciao").status(200))
                          .start(4000);
    }




}