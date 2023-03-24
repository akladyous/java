package com.practice.reflection;

import com.practice.functional.FunctionDemo;
import com.practice.klass.Reflect;
import com.practice.klass.User;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class DemoI {
    public static void main(String[] args) {


        System.out.println("-".repeat(80));
        System.out.printf("%-25s%-10s%-25s%n", "method", "type","modifier");
        System.out.println("-".repeat(80));
        Field[] fields = Reflect.class.getDeclaredFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            int modifier = field.getModifiers();
            String modifierName;
            if ( ! Modifier.isPublic(modifier) &&
                 ! Modifier.isPrivate(modifier) &&
                 ! Modifier.isProtected(modifier)
            ) {
                modifierName = "Package-Private";
            } else {
                modifierName = Modifier.toString(modifier);
            }

//            String modifierName = Modifier.toString(modifier);
            String fieldType = field.getType().getSimpleName();
            Modifier.isFinal(modifier);

            System.out.printf(
                    "%-25s%-10s%-3s%n",
                    fieldName,
                    fieldType,
                    modifierName
            );
        }

        System.out.println("-".repeat(80));
        System.out.printf("%-25s%-10s%-25s%n", "method", "type","modifier");
        System.out.println("-".repeat(80));
        Method[] methods = FunctionDemo.class.getMethods();
        for (Method method : methods) {
            String methodName = method.getName();
            Class<?> returnType = method.getReturnType();
            int modifiers = method.getModifiers();
            String modifierName;

            if ( !Modifier.isPublic(modifiers) &&
                 !Modifier.isPrivate(modifiers) &&
                 !Modifier.isProtected(modifiers)
            ) {
                modifierName = "Package-Private";
            } else {
                modifierName = Modifier.toString(modifiers);
            }


            System.out.printf(
                    "%-25s%-10s%-3s%n",
                    methodName,
                    returnType.getSimpleName(),
                    modifierName
            );
        }
    }
}
