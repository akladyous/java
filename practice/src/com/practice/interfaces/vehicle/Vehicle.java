package com.practice.interfaces.vehicle;

import com.practice.enumeration.ToyotaModels;

import java.util.List;

public interface Vehicle {
    public static final String manufacture = "Japan";

    public abstract void addFeatures(String feature);

    public default void printDescription() {
        System.out.println("from default method");
				baz();
    }
    //
    private void baz() {
        System.out.println("from private method");
    }
    private static void prova(){};


    public static void info() {
        System.out.println("from static method");
        System.out.println("called private method: baz");
    }
}
