package com.practice.functional;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionDemo {

    public static void main(String[] args) {
        ArrayList<Integer> ar1 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        ar1.stream().filter(n -> n > 5).collect(Collectors.toList());

        Predicate<Integer> predicate = n -> n > 5;

        System.out.println(incrementByOne.apply( 1));
    }
    static Function<Integer, Integer> incrementByOne = n -> n+1;
    static int increment(int num) {
        return num + 1;
    }
}
