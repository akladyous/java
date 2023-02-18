package com.practice.klass;

public class Employee {

    Integer ID;
    String FirstName;
    String lastName;
    String email;
    String password;
    Boolean active = true;
    Boolean verified = false;

    public Employee() {}
    public Employee(String firstName, String lastName, String email, String password, Boolean active, Boolean verified) {
        FirstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.active = active;
        this.verified = verified;
    }
    public Employee(Integer ID, String firstName, String lastName, String email, String password, Boolean active, Boolean verified) {
        this.ID = ID;
        FirstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.active = active;
        this.verified = verified;
    }

}
