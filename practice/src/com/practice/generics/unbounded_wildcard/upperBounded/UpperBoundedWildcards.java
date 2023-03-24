package com.practice.generics.unbounded_wildcard.upperBounded;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcards {

    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3);
        List<String> strings = List.of("a","b","c");
        printList(nums);
        printList(strings);
    }

    public static Integer sumListOfNums(List<? extends Number> nums) {
        int sum = 0;
        for (Number number : nums) {
            sum += number.intValue();
        }
        return sum;
    }


    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println("object : " + obj);
        }
    };


};