package org.practice.controllers;

import io.javalin.apibuilder.CrudHandler;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;
import org.practice.models.User;

import static io.javalin.apibuilder.EndpointGroup.*;
import static io.javalin.apibuilder.ApiBuilder.*;

public class UserController implements CrudHandler {

    @Override
    public void create(@NotNull Context context) {
        User user = context.bodyAsClass(User.class);
        // find user by id

//        var newUser = users.save(user);
        context.json(user);
        context.status(201);
    }

    @Override
    public void delete(@NotNull Context context, @NotNull String s) {

    }

    @Override
    public void getAll(@NotNull Context context) {

    }

    @Override
    public void getOne(@NotNull Context context, @NotNull String s) {

    }

    @Override
    public void update(@NotNull Context context, @NotNull String s) {

    }
}
