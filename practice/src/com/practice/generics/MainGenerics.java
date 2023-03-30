package com.practice.generics;

import com.practice.generics.bounded_type_parameters.AddTwoNums;

import java.util.ArrayList;
import java.util.List;

public class MainGenerics {

	public static void main(String[] args) {
		AddTwoNums<Integer> numsInteger = new AddTwoNums<>(1, 2);
		AddTwoNums<Double> numsDouble = new AddTwoNums<>(1.11, 2.22);


		List rawList = new ArrayList();
		rawList.add("-");
		rawList.add("is");
		rawList.add("a");
		rawList.add("raw");
		rawList.add("list");
		rawList.add("of");
		rawList.add("strings");
		rawList.set(0,"this");
		for (Object obj: rawList) {
			String strObj = (String) obj;
			System.out.printf("%-7s has %d characters%n", strObj, strObj.length());
		}


	}

}
