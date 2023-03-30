package com.practice.generics.generic_methods;

import java.util.List;

public class GenericMethods {

    public static <T> void printArray(T[] array) {
        for ( T element : array) {
            System.out.println("element : " + element);
        }
    };

    public static <T extends Comparable<T>> Integer countGreaterThan(T[] genericArray, T target) {
        int count = 0;
        for (T num : genericArray) {
            if (num.compareTo(target) > 0) {
                ++count;
            }
        }
        return count;
    }

}
