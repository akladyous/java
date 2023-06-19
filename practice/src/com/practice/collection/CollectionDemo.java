package com.practice.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionDemo {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.addAll(List.of(2,3,4,5));
        System.out.println(nums);
        nums.clear();
        nums.addAll(List.of(1,2,3,4,5));
        System.out.println("nums contains 1 : " + nums.contains(1));
        System.out.println("nums contains 2,3,4 " + nums.containsAll(List.of(2,3,4)));
        List<Integer> nums2 = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println("list equals method nums1.equals(nums2) : " + nums.equals(nums2));
        List<String> languages = new ArrayList<>();
        languages.addAll(Arrays.asList("JavaScript", "Java", "C++", "Ruby", "Python", "Go", "Rust"));
        languages.retainAll(Arrays.asList("Java", "JavaScript"));
        System.out.println(languages);

    }
}
