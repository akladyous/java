package com.practice.generics;

import com.practice.generics.bounded_type_parameters.AddTwoNums;

import java.util.List;

public class MainGenerics {

	public static void main(String[] args) {
		AddTwoNums<Integer> numsInteger = new AddTwoNums<>(1, 2);
		AddTwoNums<Double> numsDouble = new AddTwoNums<>(1.11, 2.22);



	}

}
