package com.practice.generics.boundedTypeParameters;

public class AddTwoNums <T extends Number> {
    public T valueA;
    public T valueB;

    public AddTwoNums(T valueA, T valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public Number sum(){
        return valueA.intValue() + valueB.intValue();
    };

}
