package com.practice.arrays;

import java.util.Arrays;

public class CopyingArrays {

    public static void main(String[] args) {

        int[] intArray1 = {1,2,3};
        int[] intArray2 = Arrays.copyOf(intArray1, intArray1.length);



    }
}
