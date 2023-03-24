package com.practice.functional;

import java.util.ArrayList;
import java.util.List;

public class User {
    public String name;
    public int age;
    private boolean status = false;

    public List<User> users = new ArrayList<>();

    public User(){};

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }
}
