package com.practice.generics.generic_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        int totalItems = GenericMethods.countItems(new Integer[]{1,2,3,4,5});
        System.out.println("total elements : " + totalItems);

        GenericMethods.printArray(new Character[] {'a','b','c'});

        int greaterNumberCount = GenericMethods.countGreaterThan(new Integer[]{1,2,3,4,5}, 4);
        System.out.println("greater number count : " + greaterNumberCount);

        var rangeOf10 =  IntStream
                                        .range(1,11)
                                        .boxed()
                                        .toArray( Integer[]::new );
        int res = GenericMethods.getRandomObject(rangeOf10);
        System.out.println("random object from array of ");
    };
}
