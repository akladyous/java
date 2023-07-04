package com.practice.functional;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionDemo {

    public static void main(String[] args) throws NoSuchMethodException {
        int test1 = incrementByOne.apply(1);
        System.out.println("Function.apply : " + test1);
//        System.out.println(itoUpperHex.apply(2310));

        intToHex.andThen(x -> x.toUpperCase());
        intToHex.andThen(String::toUpperCase);
        intToHex.compose(x -> Integer.valueOf(x.toString()));

        String result = intToHex
                                .compose(incrementByOne)
                                .andThen(toUpperCase)
                                .apply(1);
        System.out.println("result  : " + result);

        // function return a function

    }


    public static Function<Integer, Integer> incrementByOne = (num) -> num+1;
    static Function<Integer, String> intToHex = i -> Integer.toHexString(i);
    static Function<String, String> toUpperCase = String::toUpperCase;;
    static Function<Integer, Integer> prova (Integer x) {
        return (Integer y) -> x + y;
    }
    static  {
        System.out.println("a static block executes code before the object initialization");

    }

//    static Function<Integer,String> itoUpperHex;
//    static {
//        Function<String, String> toUpperCase = String::toUpperCase;
//        itoUpperHex = toUpperCase.compose(intToHex);
//    }


}

