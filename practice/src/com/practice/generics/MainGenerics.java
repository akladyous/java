package com.practice.generics;

public class MainGenerics {

	public static void main(String[] args) {
		AddTwoNums<Integer> numsInteger = new AddTwoNums<>(1, 2);
		AddTwoNums<Double> numsDouble = new AddTwoNums<>(1.11, 2.22);
		numsInteger.print();
		numsDouble.print();


	}
}
