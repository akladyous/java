package com.practice.klass;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class ClassDemo {

    public static void main(String[] args) {
        Cat trappola = new Cat("trappola", 4, "secco");
        System.out.println(trappola);
        Animal.staticMethod();

        List<Field>  fields = Arrays.asList(User.class.getDeclaredFields());
        for (Field f: fields) {
            System.out.println(f.getName());
        }
    }

}
