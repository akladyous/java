package com.practice.arrays;

import com.practice.klass.Animal;

import java.util.*;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] randomNumbers = generateRandomNumbers(1, 10);
        System.out.println(Arrays.toString(randomNumbers));
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

    private static int[] generateRandomNumbers(Integer from, Integer to) {
        Random random = new Random();
        int[] randomNums = new int[to];
        for (int i = 0; i < to ; i++) {
            randomNums[i] = random.nextInt(from, to);
        }
        return randomNums;
    }
}
