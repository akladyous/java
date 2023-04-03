package com.practice.collection.list.ArraList;

import java.util.*;


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

        nums.remove(Integer.valueOf(5));
        nums.replaceAll(num -> (int) Math.pow(num,2));
        System.out.println(nums);
        nums.set(1, 2);
        System.out.println(nums);

        Iterator<Integer> numsIterator = nums.iterator();
        while(numsIterator.hasNext()) {
            System.out.println(numsIterator.next());
        }
        ListIterator<Integer> iterator = nums.listIterator(1);
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

    public static int randomNum(int maxNumber) {
        Random random = new Random();
        return random.nextInt(1, maxNumber);

    };



}
