package com.practice.klass;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class ClassDemo {

    public static void main(String[] args) {

        List<Field>  fields = Arrays.asList(User.class.getDeclaredFields());
        for (Field f: fields) {
            System.out.println(f.getName());
        }
    }

}
