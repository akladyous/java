package com.practice.arrays;

import com.practice.klass.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayDemo {

    public static void main(String[] args) {
        Animal[] animal = new Animal[5];
        animal[0] = new Animal("one", 3);
        Animal a1 = new Animal("one", 3);
        animal[1] = a1;

        ArrayList<Integer> arrInt = new ArrayList<>(Arrays.asList(1,2,3,4));
        arrInt.add(5);
        System.out.println(arrInt);

        List<Integer> listInt1 = new ArrayList<>(Arrays.asList(5,3,1,2,4));
        ArrayList<Integer>  arrayListInt2 = new ArrayList<>();
        listInt1.sort(Comparator.naturalOrder());
        System.out.println(listInt1);
    }
}
