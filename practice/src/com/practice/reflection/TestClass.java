package com.practice.reflection;

public class TestClass {
    int packagePrivateField;                        // default
    public int publicField;                         // public
    private int privateField;                       // private
    protected int protectedField;                   // protected

    static int staticField;                         // Package-Private - class field
    public static int publicStaticField;            // Public  - class field
    private static int privateStaticField;          // Private - class field

    volatile int volatileField;

    public TestClass(){};

    private void privateMethod(){};
    public TestClass(int packagePrivateField, int publicField, int privateField, int protectedField) {
        this.packagePrivateField = packagePrivateField;
        this.publicField = publicField;
        this.privateField = privateField;
        this.protectedField = protectedField;
    }

    public static void main(String[] args) {
        FieldsModifier.getFieldsModifier(TestClass.class);
    };
}
