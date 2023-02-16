package com.practice.collection.map.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {


    public static void main(String[] args) {
        int ids[] = {1,2,3,4,5};
        HashSet<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(Arrays.asList(6,7,8,9,10));

        for (int i = 0; i < ids.length; i++) {
            set1.add((ids[i]));
        }
        System.out.println(set1);
    }
}
