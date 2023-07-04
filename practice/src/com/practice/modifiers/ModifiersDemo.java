package com.practice.modifiers;

import com.practice.reflection.FieldsModifier;

public class ModifiersDemo {
    int packagePrivateField;                        // default
    public int publicField;                         // public
    private int privateField;                       // private
    protected int protectedField;                   // protected

    static int staticField;                         // Package-Private - class field
    public static int publicStaticField;            // Public  - class field
    private static int privateStaticField;          // Private - class field


    public void ModifiersDemo(){};
    public static void setPublicStaticMethod(){};

    protected void setPackagePrivateMethod(){};
    public ModifiersDemo(int packagePrivateField, int publicField, int privateField, int protectedField) {
        this.packagePrivateField = packagePrivateField;
        this.publicField = publicField;
        this.privateField = privateField;
        this.protectedField = protectedField;
    }

    private void privateMethod(){};


    public static void main(String[] args) {
        FieldsModifier.getFieldsModifier(ModifiersDemo.class);
    }

}
