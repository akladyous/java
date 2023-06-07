package com.practice.klass.todos;

public class Profile extends User {
    private String firstName;
    private String lastName;
    private byte age;


    public Profile(String email, String password, String firstName, String lastName, byte age) {
        super(email, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


}
