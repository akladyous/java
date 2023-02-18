package com.practice.arrays;

import com.practice.klass.Animal;

import java.util.*;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] arrInt1 = generateRandomNumbers( 10);
        Arrays.sort(arrInt1);
        System.out.println(Arrays.toString(arrInt1));

        int[] arrInt2 = new int[5];
        Arrays.fill(arrInt2, 5);
        System.out.println(Arrays.toString(arrInt2));

        int[] arrInt3 = Arrays.copyOf(arrInt2, arrInt2.length + 5);
        System.out.println(Arrays.toString(arrInt3));

        Integer matchIndex;
        String[] names = {"Alba", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(names);
        System.out.println("names sorted : " + Arrays.toString(names));
        matchIndex = Arrays.binarySearch(names, "David");
        System.out.println("matchIndex : " + matchIndex);

        int[] arrInt4 = {1,2,3,4,5};
        int[] arrInt5 = {1,2,3,4,5};
        if (Arrays.equals(arrInt4, arrInt5)) {
            System.out.println("Arrays are equals");
        } else {
            System.out.println("Arrays are not equals");
        }
        String[] stringArr1 = {"one", "two", "three", "four", "five"};
        ArrayList<String> ar1 = new ArrayList<>(List.of("six", "seven", "eight", "nine", "ten"));
        ar1.addAll(ar1);
        System.out.println("Array List added " + ar1);
        var newArray = ar1.toArray(new String[ar1.size()]);
        System.out.println("newArray : " + Arrays.toString(newArray));

    }

    private static void provaOne(){
        Animal[] animal = new Animal[5];
        animal[0] = new Animal("one", 3);
        Animal a1 = new Animal("one", 3);
        animal[1] = a1;

        ArrayList<Integer> arrInt = new ArrayList<>(Arrays.asList(8,1,9,5,3,4,2,1,6));
        arrInt.add(5);
        System.out.println(arrInt);

        List<Integer> listInt1 = new ArrayList<>(Arrays.asList(5,3,1,2,4));
        ArrayList<Integer>  arrayListInt2 = new ArrayList<>();
        listInt1.sort(Comparator.naturalOrder());
        System.out.println(listInt1);
    }

    private static int[] generateRandomNumbers(Integer size) {
        Random random = new Random();
        int[] randomNums = new int[size];
        for (int i = 0; i < size ; i++) {
            randomNums[i] = random.nextInt(100);
        }
        return randomNums;
    }
}
