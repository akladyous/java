package com.practice.reflection;

import com.practice.functional.FunctionDemo;
import com.practice.klass.Reflect;
import com.practice.klass.User;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class DemoI {
    public static void main(String[] args) {

        Field[] fields = Reflect.class.getDeclaredFields();

        for (Field field : fields) {
            String fieldName = field.getName();
            String modifierName;
            if ( ! Modifier.isPublic(field.getModifiers()) &&
                 ! Modifier.isPrivate(field.getModifiers()) &&
                 ! Modifier.isProtected(field.getModifiers())
            ) {
                modifierName = "Package-Private";
            } else {
                modifierName = Modifier.toString(field.getModifiers());
            }

//            String modifierName = Modifier.toString(field.getModifiers());
            String fieldType = field.getType().getSimpleName();
            Modifier.isFinal(field.getModifiers());

            System.out.printf(
                    "Field: %-20s type: %-6s modifier: %-3s%n", fieldName, fieldType, modifierName
            );
        }
        System.out.println("-".repeat(50));

        Method[] methods = FunctionDemo.class.getMethods();
        for (Method method : methods) {
            method.getModifiers();
            Modifier.classModifiers();
            System.out.println(
                    "Method ( " +
                            method.getName() +
                            " ) Modifier: " +
                            Modifier.toString(method.getModifiers())
            );
        }
    }
}
