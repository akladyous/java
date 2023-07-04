package com.practice.arrays;

import java.util.Arrays;
import java.util.Objects;

public class Comparing2Arrays {

    public static void main(String[] args) {

        Integer[] intArray1 = {1,2,3};
        Integer[] intArray2 = {1,2,3};

        System.out.printf("%-25s %b%n" ,"object1.equals(object2)",  intArray1.equals(intArray2));
        System.out.printf("%-25s %b%n", "Object.equals",  Objects.equals(intArray1, intArray2));
        System.out.printf("%-25s %b%n", "Arrays.deepEquals", Arrays.deepEquals(intArray1, intArray2) );
        System.out.printf("%-25s %b%n", "Objects.deepEquals",  Objects.deepEquals(intArray1, intArray2));


    }
}
