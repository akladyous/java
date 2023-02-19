package com.practice.interfaces;

public interface Vehicle {
    public static final Integer value = 1;

    public abstract void make();
    public static void info() {
        System.out.println("from static method");
        System.out.println("called private method: baz");
    }
    public default void printDescription() {
        System.out.println("from default method");
    }
    private void baz() {
        System.out.println("from private method");
    }
}
