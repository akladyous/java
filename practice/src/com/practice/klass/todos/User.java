package com.practice.klass.todos;

public class User {
    public String email;
    public String password;
    public Boolean status;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.status = true;
    }
}
