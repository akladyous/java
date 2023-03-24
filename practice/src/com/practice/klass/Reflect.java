package com.practice.klass;

public class Reflect {
    int packagePrivateField;
    public int publicField;
    private int privateField;
    static int staticField;
    public static int publicStaticField;
    private static int privateStaticField;
    protected int protectedField;


    public Reflect(){};
    public Reflect(int packagePrivateField, int publicField, int privateField, int protectedField) {
        this.packagePrivateField = packagePrivateField;
        this.publicField = publicField;
        this.privateField = privateField;
        this.protectedField = protectedField;
    }

    public static void main(String[] args) {};
    private void privateMethod(){};
}