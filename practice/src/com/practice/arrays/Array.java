package com.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

    public static void main(String[] args) {
        //define arrayList in different way
        String[] arrStr1 = {"a","b","c","d"};
        String arrStr2[] = {"e","f","g","h"};

        ArrayList<String> listStr1 = new ArrayList<>(Arrays.asList(arrStr1));
        ArrayList<String> listStr2 = new ArrayList<>(List.of(arrStr2));

        List[] l1 = new List[] {Arrays.asList(1,2,3,4,5)};
        System.out.println(Arrays.toString(l1));
        for (List n : l1) {
            System.out.println(n);
        }


        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(2,3,4,5));

        var i3 = l2.toArray();

        Integer[] i4 = l2.toArray(new Integer[l2.size()]);
        System.out.println(Arrays.toString(i4));


        int[] n1 = new int[6];
        Arrays.fill(n1, 1);
        System.out.println(Arrays.toString(n1));

        int[] n2 = new int[]{4,1,2,7,9,5};
        Arrays.sort(n2);
        System.out.println(Arrays.toString(n2));
    }
}
