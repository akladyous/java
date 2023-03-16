package com.practice.interfaces.demo;

public interface DemoInterface {

    public static final String fieldString = "public static final 'field'";

    void abstractMethod();


    public static void publicStatic() {
        System.out.println("public static method");
    }
    private static void privateStaticMethod(){
        System.out.println("private static method");
    };
    private void privateMethod() {
        System.out.println("private method");
    }
}
