package com.practice.arrays;

import com.practice.klass.Animal;

import java.util.*;

public class ArrayDemo {

    public static Integer xxx;
    public static void main(String[] args) {
        int[] arrInt1 = generateRandomNumbers( 10);
        /* SORT Method */
        Arrays.sort(arrInt1);
        System.out.println(Arrays.toString(arrInt1));

        int matchIndex;
        String[] arrStr1 = {"Alba", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(arrStr1);
        System.out.println("arrStr1 sorted : " + Arrays.toString(arrStr1));

        /* BinarySearch Method */
        matchIndex = Arrays.binarySearch(arrStr1, "David");
        System.out.println("Arrays.binarySearch : " + matchIndex);

        int[] arrInt2 = new int[5];
        /* FILL Method */
        Arrays.fill(arrInt2, 5);
        System.out.println(Arrays.toString(arrInt2));

        int[] arrInt3 = Arrays.copyOf(arrInt2, arrInt2.length + 5);
        System.out.println(Arrays.toString(arrInt3));

        int[] arrInt4 = {1,2,3,4,5};
        int[] arrInt5 = {1,2,3,4,5};
        if (Arrays.equals(arrInt4, arrInt5)) {
            System.out.println("Arrays are equals");
        } else {
            System.out.println("Arrays are not equals");
        }
        ArrayList<String>  arrNums1 = new ArrayList<>(Arrays.asList("one", "two","three", "four", "five"));
        ArrayList<String> arrNums2 = new ArrayList<>(List.of("six", "seven", "eight", "nine", "ten"));
        ArrayList<String> arrOfNumbers = new ArrayList<>();
        arrOfNumbers.addAll(arrNums1);
        arrOfNumbers.addAll(arrNums2);
        System.out.println("arrOfNumbers.addAll : " + arrOfNumbers);
        var newArray = arrNums1.toArray(new String[arrNums1.size()]);
        System.out.println("newArray : " + Arrays.toString(newArray));

				System.out.println("-".repeat(40));
        String[] arrStr2 = {"one", "two", "three", };
        String[] arrStr3 = {"four", "five", "six"};
        ArrayList<String> arrStr4 = new ArrayList<>();
        int as = arrStr2.length;
        String s1 = " 1";
        s1.length();
        arrStr4.addAll(Arrays.asList(arrStr2));
        arrStr4.addAll(new ArrayList<>(List.of(arrStr3)));
        System.out.println("arrStr4 : " + arrStr4);
        Collections.shuffle(arrStr4);
        boolean deepEquals1 = Arrays.deepEquals(
                        new List[] {Arrays.asList(arrStr2)},
                        new List[] {List.of(arrStr2)}
        );
        Boolean deepEquals2 = Arrays.deepEquals(
                        new List[] {Arrays.asList(arrStr2)},
                        new ArrayList[] {arrStr4}
        );
        System.out.println("deepEquals : " + Boolean.toString(deepEquals1));
        System.out.println("deepEquals : " + deepEquals2.toString());
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
