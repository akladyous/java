package com.practice.generics.generic_methods;

import java.util.List;
import java.util.Random;

public class GenericMethods {
    private static final long seed = 13;


    public static <T> void printArray(T[] array) {
        for ( T element : array) {
            System.out.println("element : " + element);
        }
    };

    public static <T extends Number> Integer countItems(T[] array) {
        int count = 0;
        for (T t : array) {
            count ++;
        }
        return count;
    }

    public static <T extends Comparable<T>> Integer countGreaterThan(T[] genericArray, T target) {
        int count = 0;
        for (T num : genericArray) {
            if (num.compareTo(target) > 0) {
                ++count;
            }
        }
        return count;
    }

    public static <T> T getRandomObject(T[] arrayOfObjects){
        Random random = new Random();
        int index = random.nextInt(1, arrayOfObjects.length);
        return arrayOfObjects[index];
    }
}
