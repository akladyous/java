package com.practice.klass;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    String name;
    Integer age;
    private static Integer ids = 0;

    public Animal(String name,  Integer age) {
        this.name = name;
        this.age = age;
        ids ++;
    }

    public void info(){
        System.out.println("name : " + this.name + " age : " + this.age);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
