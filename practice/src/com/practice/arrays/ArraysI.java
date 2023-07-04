package com.practice.arrays;

import java.util.Arrays;

public class ArraysI {
    public static void main(String[] args) {
        arraysBinarySearch();
        arraysCompare();
        arraysCopyOf();
    }


    public static void arraysBinarySearch(){
        int[] a1 = {1,2,3};
        int matchingIndex = Arrays.binarySearch(a1, 112 );
        System.out.println("Arrays.binarySearch " + matchingIndex);

    }

    public static void arraysCompare(){
        String[] s1 = {"a","b","c"};
        String[] s2 = {"a","b","d"};
        int result = Arrays.compare(s1, s2);
        if (result > 0) {
            System.out.println("Arrays.compare : Array S1 values are greater than S2 values");
        } else if( result < 0) {
            System.out.println("Arrays.compare : Array S1 values are less than S2 values");
        } else {
            System.out.println("Arrays.compare : s1 equals s2");
        }
    }

    public static void arraysCopyOf() {
        int[] i1 = {1,2,3};
        int[] i2 = Arrays.copyOf(i1,  i1.length * 2);
        String[] s1 = {"a","b","c"};
        System.out.println("Arrays.copyOf : " + Arrays.toString(i2));
        System.out.println("Arrays.copyOf : " + Arrays.toString(Arrays.copyOf(s1, s1.length * 2)));
    }
}
