package com.practice.interfaces;

import com.practice.enumeration.ToyotaModels;

import java.util.List;

public interface Vehicle {
    public static final String manufacture = "Japan";

		List<ToyotaModels> models = null;

		public abstract void addFeatures(String feature);
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
