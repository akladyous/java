package com.practice.interfaces.demo;

public interface DemoInterface {
    public static final String fieldString = "Public Static Final";
    public abstract void abstractMethod();
    public default void defaultMethod(){
        System.out.println("2- Default method");
        System.out.println("   default methods are methods that can have a body");

        privateStaticMethod();
        privateMethod();
    };
    public static void staticMethod() {
        System.out.println("3- static method");
        privateStaticMethod();
    }
    private static void privateStaticMethod(){
        System.out.println("private static method");
    };
    // private
    private void privateMethod() {
        System.out.println("private method");
    }
}
