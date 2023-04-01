package com.practice.modifiers;

import com.practice.reflection.FieldsModifier;

public class ModifiersDemo {
    final static Integer varInt = 1;
    static String varStr = new String("hello");
    void prova(){};


    public static void main(String[] args) {
        FieldsModifier.getFieldsModifier(ModifiersDemo.class);
    }

}
