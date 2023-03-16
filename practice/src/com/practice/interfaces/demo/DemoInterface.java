package com.practice.interfaces.demo;

public interface DemoInterface {

    public static final String fieldString = "Public Static Final";

    public abstract void abstractMethod();
    public default void defaultMethod(){
        System.out.println("2- Default method");
        System.out.println("   default methods are methods that can have a body");
    };

    public static void StaticMethod() {
        System.out.println("3- static method");
    }
    private static void privateStaticMethod(){
        System.out.println("private static method");
    };
    private void privateMethod() {
        System.out.println("private method");
    }
}
