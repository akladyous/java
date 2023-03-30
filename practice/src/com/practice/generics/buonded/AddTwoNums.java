package com.practice.generics.buonded;

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

    public static void main(String[] args) {
        AddTwoNums<Integer> addTwoNums = new AddTwoNums<>(1,1);
        Number result = addTwoNums.sum();
        System.out.println(result);


        Box<Integer> box = new Box<>();
        box.setT(1);
        box.inspect(2);

    }
}
