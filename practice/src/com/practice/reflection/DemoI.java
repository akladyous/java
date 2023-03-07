package com.practice.reflection;

import com.practice.functional.FunctionDemo;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class DemoI {
    public static void main(String[] args) {

        Method[] methods = FunctionDemo.class.getMethods();
        for (Method method : methods) {
//            method.getModifiers()
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
