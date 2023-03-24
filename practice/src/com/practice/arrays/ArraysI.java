package com.practice.arrays;

import java.util.Arrays;

public class ArraysI {
    public static void main(String[] args) {
        binarySearch();
    }

    public static void binarySearch(){
        int[] a1 = {1,2,3};
        int matchingIndex = Arrays.binarySearch(a1, 112 );
        System.out.println("Arrays.binarySearch " + matchingIndex);

    }
}
