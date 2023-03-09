package com.practice.interfaces.vehicle;

import com.practice.interfaces.vehicle.ToyotaModels;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(ToyotaModels.COROLLA.getYear());
        System.out.println(Arrays.toString(ToyotaModels.values()));
        //
        Toyota corolla = new Toyota(ToyotaModels.COROLLA.name(), "red", 2018);
        Toyota camry = new Toyota(ToyotaModels.CAMRY.name(), "black", 2020);
        //
        Vehicle.info();

    }
}
