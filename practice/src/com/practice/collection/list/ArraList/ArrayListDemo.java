package com.practice.collection.list.ArraList;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class ArrayListDemo {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        if (nums.contains(3)) {
            System.out.println("contains method Returns true if this list contains the specified element.");
        }
        nums.clear();
        nums.addAll(List.of(1,2,3,4,5));
        int valueAtZeroIndex = nums.get(0);
        int indexOfFirstOccurrence = nums.indexOf(5);
        int lastIndexOf = nums.lastIndexOf(5);
        nums.addAll(List.of(5,6,6,7));
        Integer numToRemove = 5;
        nums.remove(numToRemove);




    }

    public static int randomNum(int maxNumber) {
        Random random = new Random();
        return random.nextInt(1, maxNumber);

    };



}
