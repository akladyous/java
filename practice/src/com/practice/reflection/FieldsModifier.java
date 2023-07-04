package com.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldsModifier {

    public static void getFieldsModifier(Class c) {

        System.out.println("-".repeat(80));
        System.out.printf("%-2s %-25s%-10s%-25s%n", "N", "method", "type","modifier");
        System.out.println("-".repeat(80));

        Field[] fields = c.getDeclaredFields();
        for ( int i = 0; i < fields.length; i++ ) {
            String fieldName = fields[i].getName();
            int modifier = fields[i].getModifiers();
            String modifierName;
            if (! Modifier.isPublic(modifier) &&
                        ! Modifier.isPrivate(modifier) &&
                        ! Modifier.isProtected(modifier)
            ) {
                modifierName = "Package-Private";
            } else {
                modifierName = Modifier.toString(modifier);
            }

//            String modifierName = Modifier.toString(modifier);
            String fieldType = fields[i].getType().getSimpleName();
            Modifier.isFinal(modifier);

            System.out.printf(
                    "%-2d %-25s%-10s%-3s%n",
                    i+1,
                    fieldName,
                    fieldType,
                    modifierName
            );
        }
    }
}

