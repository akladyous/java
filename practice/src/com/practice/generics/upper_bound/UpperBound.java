package com.practice.generics.upper_bound;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBound {
    public static void main(String[] args) {
        List<Integer> intNums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        double sumOfIntegers = sumList(intNums);
        System.out.println(sumOfIntegers);


    }

    public static double sumList(List<? extends Number> list) {
        return list.stream().mapToDouble(Number::doubleValue).sum();
    }
}
