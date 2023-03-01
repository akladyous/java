package com.practice.functional;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PredicateDemo {

    public static void main(String[] args) {
        List<Integer> nums = IntStream.range(1,11).boxed().toArray(Integer[10]);

        Predicate<Integer> isPositive = number -> number > 0;
        Predicate<Integer> notPositive = isPositive.negate();
        Predicate<Integer> isEven = number -> number %2 == 0;
        Predicate<Integer> positiveAndEven = isPositive.and(isEven);
        Predicate<Integer> positiveOrEven = isPositive.or(isEven);


        System.out.println(isPositive.test(-1));
        System.out.println(notPositive.test(-2));
        System.out.println(positiveAndEven.test(3));
        System.out.println(positiveOrEven.test(3));
    }
}
