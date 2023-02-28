package com.practice.arrays;

import com.practice.klass.Animal;

import java.util.*;

public class ArraysClass {

    public static Integer xxx;
    public static void main(String[] args) {

        System.out.println("SORT Method - array of Integers");
        int[] arrRandInt = generateRandomNumbers( 10);
        System.out.println("SORT Method - array of integers");
        Arrays.sort(arrRandInt);
        System.out.println(Arrays.toString(arrRandInt));
        System.out.println("-".repeat(40));

        String[] names = {"Alba", "Jane", "Mark", "Ralph", "David"};
        System.out.println("SORT Method - array of Strings");
        Arrays.sort(names);
        System.out.println("names sorted : " + Arrays.toString(names));
        System.out.println("-".repeat(40));

        System.out.println("BinarySearch Method");
        int matchIndex;
        String numbersStr[] = {"one", "two", "three", "four", "five"};
        matchIndex = Arrays.binarySearch(numbersStr, "three");
        System.out.println("matchIndex : " + matchIndex);
        System.out.println("-".repeat(40));

        System.out.println("FILL Method");
        int[] arrInt1 = new int[5];
        Arrays.fill(arrInt1, 5);
        System.out.println(Arrays.toString(arrInt1));
        System.out.println("-".repeat(40));

        System.out.println("copyOf Method");
        int[] arrInt2 = Arrays.copyOf(arrInt1, arrInt1.length + 5);
        System.out.println(Arrays.toString(arrInt2));
        System.out.println("-".repeat(40));

        System.out.println("equals Method");
        int[] arrInt3 = {1,2,3,4,5};
        int[] arrInt4 = {1,2,3,4,5};
        if (Arrays.equals(arrInt3, arrInt4)) {
            System.out.println("Arrays are equals");
        } else {
            System.out.println("Arrays are not equals");
        }
        System.out.println("-".repeat(40));

        System.out.println("Arrays.addAll Method");
        ArrayList<String> listOfNumbers = new ArrayList<>();
        listOfNumbers.addAll(Arrays.asList("one", "two","three", "four", "five"));
        listOfNumbers.addAll(List.of("six", "seven", "eight", "nine", "ten"));
        System.out.println("ArrayList<String> : " + listOfNumbers);
        System.out.println("-".repeat(40));


        System.out.println("ArraysList -> toArray Method");
        ArrayList<String> numLetters = new ArrayList<>(Arrays.asList("one", "two","three", "four", "five"));
        var toArrayTest1 = numLetters.toArray(new String[numLetters.size()]);
        System.out.println("with var  : " + Arrays.toString(toArrayTest1));
        Object[] toArrayTest2 = numLetters.toArray();
        System.out.println("with Object[]  : " + Arrays.toString(toArrayTest2));
        Integer[] toArrayTest3 = numLetters.toArray(new Integer[numLetters.size()]);
        System.out.println("with Type[] : " + Arrays.toString(toArrayTest3));
        System.out.println("-".repeat(40));


//        Integer arNums1Copy[] = new Integer[5];
//        int result = Arrays.compare(arNums1.toArray(arNums1Copy), arNums2.toArray());
//        List<Integer> nn = IntStream.range(1,10).boxed()

        System.out.println("Collections.shuffle Method");
        String[] arrLetters = {"a","b","c","d","e","f","g","h"};
        ArrayList<String> ListLetters = new ArrayList<>(Arrays.asList(arrLetters));
        Collections.shuffle(ListLetters);
        System.out.println("-".repeat(40));

        System.out.println("Arrays.deepEquals");
        String[] arrStr1 = {"a","b","c","d","e","f","g","h"};
        String[] arrStr2 = {"a","b","c","d","e","f","g","h"};
        ArrayList<String> arrStr4 = new ArrayList<>(List.of(arrStr1));
        boolean deepEquals1 = Arrays.deepEquals(
                        new List[] {Arrays.asList(arrStr1)},
                        new List[] {List.of(arrStr1)}
        );
        Boolean deepEquals2 = Arrays.deepEquals(
                        new List[] {Arrays.asList(arrStr1)},
                        new ArrayList[] {arrStr4}
        );
        System.out.println("deepEquals : " + Boolean.toString(deepEquals1));
        System.out.println("deepEquals : " + deepEquals2.toString());
        System.out.println("-".repeat(40));
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
