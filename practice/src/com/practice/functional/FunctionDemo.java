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
        int test1 = incrementByOne.apply(1);
        System.out.println("Function.apply : " + test1);
//        System.out.println(itoUpperHex.apply(2310));

        intToHex.andThen(x -> x.toUpperCase());
        intToHex.andThen(String::toUpperCase);
        intToHex.compose(x -> Integer.valueOf(x.toString()));

        String result = intToHex.andThen(toUpperCase).apply(6071974);
        System.out.println("result  : " + result);
    }
    static Function<Integer, Integer> incrementByOne = n -> n+1;

    static Function<Integer, String> intToHex = i -> Integer.toHexString(i);
    static Function<String, String> toUpperCase = String::toUpperCase;;



//    static Function<Integer,String> itoUpperHex;
//    static {
//        Function<String, String> toUpperCase = String::toUpperCase;
//        itoUpperHex = toUpperCase.compose(intToHex);
//    }


}

