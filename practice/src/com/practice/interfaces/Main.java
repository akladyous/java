package com.practice.interfaces;


import com.practice.enumeration.ToyotaModels;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println(ToyotaModels.COROLLA.getYear());
		System.out.println(Arrays.toString(ToyotaModels.values()));

//		System.out.println("");
	}
}
