package com.practice.arrays;

import java.util.Arrays;

public class ResizeArray {

    public static void main(String[] args) {
        solution1();

    }

    // used to resize the array.
    public static void solution1(){
        int[] a1 = {1,2,3};
        int[] a2 = new int[a1.length + 3];
        System.arraycopy(a1,0,a2,0,a1.length);
        System.out.println(Arrays.toString(a2));
    }


}
