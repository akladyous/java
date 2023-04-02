package com.practice.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4));
        set.clear();
        set.add(5);
        set.addAll(List.of(6,7,8,9,10));
        set.add(null);
        System.out.println(set);
        System.out.println("contains method : " + set.contains(5));;
        set.remove(5);
        System.out.println(set);

        Set<Integer> setII = new HashSet<>(List.of(6,7,8,9,10));
        setII.add(null);
        System.out.println(set.equals(setII));

    }

}
