package com.practice.record;

import java.lang.reflect.RecordComponent;

public class RecordDemo {


    public static void main(String[] args) {
        record User(String name, int age){};

        User u1 = new User("paolo", 20);
        System.out.println(u1.getClass().getSimpleName());


        RecordComponent[] components = u1.getClass().getRecordComponents();

        for (RecordComponent component : components) {
            System.out.println("Component name: " + component.getName());
            System.out.println("Component type: " + component.getType().getName());
        }
    }


}
