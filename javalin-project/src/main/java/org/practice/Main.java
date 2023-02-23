package org.practice;

import io.javalin.Javalin;
import io.javalin.apibuilder.EndpointGroup;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var app = Javalin
                          .create()
                          .get("/", ctx -> ctx.result("ciao").status(200))
                          .start(4000);
    }




}