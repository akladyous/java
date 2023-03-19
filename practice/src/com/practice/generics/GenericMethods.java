package com.practice.generics;

public class GenericMethods {

    public static <T> void printArray(T[] array) {
        for ( T element : array) {
            System.out.println("element : " + element);
        }
    };


}
