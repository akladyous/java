package com.practice.object_class;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public String name;
    public int age;
    public int[] favoriteNumbers;

    public Person(String name, int age, int[] favoriteNumbers) {
        this.name = name;
        this.age = age;
        this.favoriteNumbers = favoriteNumbers;
    }

    public static void main(String[] args) {
        Person john = new Person("john", 20, new int[]{1,2,3});
        Person sara = new Person("sara", 22, new int[]{1,2,3});

        sara.equals(john);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.equals(obj)) return true;



        return super.equals(obj);
    }
}
