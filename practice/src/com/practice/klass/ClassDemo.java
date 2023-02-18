package com.practice.klass;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class ClassDemo {

    public static void main(String[] args) {
        String UserName = User.name;
        User paolo = new User();
        Integer user_id = paolo.getId();
        paolo.setId(1);
        System.out.println(User.name);
        System.out.println(User.prova);
        System.out.println(User.getCounter());


        List<Field>  fields = Arrays.asList(User.class.getDeclaredFields());
        for (Field f: fields) {
            System.out.println(f.getName());
        }
    }

}
