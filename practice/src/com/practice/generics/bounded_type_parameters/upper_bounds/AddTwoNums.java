package com.practice.generics.bounded_type_parameters.upper_bounds;

public class AddTwoNums <T extends Number> {
    public T valueA;
    public T valueB;

    public AddTwoNums(T valueA, T valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public Number result(){
        return valueA.intValue() + valueB.intValue();
    };

    public static void main(String[] args) {
//        AddTwoNums<Integer> addTwoNums = new AddTwoNums<>(1,1);

    }
}
