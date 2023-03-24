package com.practice.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodsModifier {

    public static void getMethodsModifiers(Class c) {
        System.out.println("-".repeat(80));
        System.out.printf("%-25s%-10s%-25s%n", "method", "type","modifier");
        System.out.println("-".repeat(80));
        Method[] methods = c.getMethods();

        for ( Method method : methods) {
            String methodName = method.getName();
            Class<?> returnType = method.getReturnType();
            int modifiers = method.getModifiers();
            String modifierName;

            if ( ! Modifier.isPublic(modifiers) &&
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
