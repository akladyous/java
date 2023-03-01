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
        ArrayList<Integer> ar1 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        ar1.stream().filter(n -> n > 5).collect(Collectors.toList());
//        System.out.println(incrementByOne.apply( 1));
        ar1.forEach(consumer);

        System.out.println(randomID.get());
        String uid = String.valueOf(uuid.get());
        System.out.println(isPositive.test(1));
    }
    static Predicate<Integer> isPositive = number -> number > 0;

    static Function<Integer, Integer> incrementByOne = n -> n+1;
    static Consumer<Integer> consumer = e -> System.out.println(e);
    static Supplier<Integer> randomID= () -> new Random().nextInt();
    static Supplier<UUID> uuid = () -> UUID.randomUUID();

    static int increment(int num) {
        return num + 1;
    }



}

