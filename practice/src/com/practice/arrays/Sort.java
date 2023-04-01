package com.practice.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
        Integer[] numbers = {5, 1, 8, 2, 6, 3, 9, 4, 7};
        Arrays.sort(numbers);
        System.out.println("Ascending order");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(Arrays.toString(numbers));

        Integer[] integers = new Integer[5];
        integers[1] = 0;
        integers[4] = 4;
        System.out.println(Arrays.toString(integers));
    }
}
