package com.practice.generics.bounded_type_parameters.upper_bounds;

import java.util.List;

public class SumList {
    public static void main(String[] args) {


    }

    public static double sumList(List<? extends Number> list) {
        return list.stream().mapToDouble(Number::doubleValue).sum();
    }
}
