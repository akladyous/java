package com.practice.generics;

import com.practice.generics.bounded_type_parameters.upper_bounds.AddTwoNums;

public class MainGenerics {

	public static void main(String[] args) {
		AddTwoNums<Integer> numsInteger = new AddTwoNums<>(1, 2);
		AddTwoNums<Double> numsDouble = new AddTwoNums<>(1.11, 2.22);





	}

}
