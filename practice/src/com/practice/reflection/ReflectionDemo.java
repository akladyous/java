package com.practice.reflection;

import com.practice.klass.Reflect;

public class ReflectionDemo {


    public static void main(String[] args) {
        FieldsModifier.getFieldsModifier(TestClass.class);

        MethodsModifier.getMethodsModifiers(TestClass.class);
    };

};
