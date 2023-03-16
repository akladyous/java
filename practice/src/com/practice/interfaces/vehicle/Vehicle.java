package com.practice.interfaces.vehicle;

import com.practice.enumeration.ToyotaModels;

import java.util.List;

public interface Vehicle {
    public static final String manufacture = "Japan";

    public abstract void addFeatures(String feature);

    public default void printDescription() {
        System.out.println("from default method");
    }
    //

}
