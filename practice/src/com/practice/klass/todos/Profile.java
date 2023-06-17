package com.practice.klass.todos;

public class Profile extends User {
    public String firstName;
    public String lastName;
    public byte age;


    public Profile(String email, String password, String firstName, String lastName, byte age) {
        super(email, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
