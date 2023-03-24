package com.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldsModifier {

    public static void getFieldsModifier(Class c) {

        System.out.println("-".repeat(80));
        System.out.printf("%-25s%-10s%-25s%n", "method", "type","modifier");
        System.out.println("-".repeat(80));

        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            int modifier = field.getModifiers();
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
            String fieldType = field.getType().getSimpleName();
            Modifier.isFinal(modifier);

            System.out.printf(
                    "%-25s%-10s%-3s%n",
                    fieldName,
                    fieldType,
                    modifierName
            );
        }
    }

}
