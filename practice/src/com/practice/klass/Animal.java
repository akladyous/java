package com.practice.klass;


public class Animal {
    String name;
    Integer age;
    private static Integer ids = 0;

    static {
        System.out.println("invoked static block");
    }
    {
        System.out.println("invoked private block");
    }

    public Animal(String name,  Integer age) {
        this.name = name;
        this.age = age;
        ids ++;
    }

};
