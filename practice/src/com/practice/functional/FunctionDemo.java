package com.practice.functional;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionDemo {

    public static void main(String[] args) {
        ArrayList<Integer> ar1 = new ArrayList<>(List.of(1,2,3,4));
        ar1.stream().filter(n -> n > 5).collect(Collectors.toList());
//        System.out.println(incrementByOne.apply( 1));
        ar1.forEach(consumer);


        int test1 = incrementByOne.apply(1);
        System.out.println("Function.apply : " + test1);
        incrementByOne.andThen()

    }
    static Consumer<Integer> consumer = e -> System.out.println(e);
    static Function<Integer, Integer> incrementByOne = n -> n+1;




}

