package com.practice.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(null);
        set1.add(null);
        set1.add(null);
        System.out.println(set1);

    }
}
