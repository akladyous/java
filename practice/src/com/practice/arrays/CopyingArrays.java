package com.practice.arrays;

import java.util.Arrays;

public class CopyingArrays {

    public static void main(String[] args) {

        int[] intArray1 = {1,2,3};
        int[] intArray2 = Arrays.copyOf(intArray1, intArray1.length);
        System.out.println("Arrays.copyOf : " + Arrays.toString(intArray2));


        int[] intArray3 = new int[intArray1.length];
        System.arraycopy(intArray1, 0, intArray3, 0, intArray1.length);
        System.out.println("System.arraycopy : " + Arrays.toString(intArray3));

    }
}
