package com.practice.enumeration;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		DayOfWeeks monday = DayOfWeeks.MONDAY;
		System.out.println(monday);

		System.out.printf("Name is %s - Ordinal %d \n", monday.name(), monday.ordinal());
		System.out.println("-".repeat(40));
		for (int i = 0; i < 7; i++) {
			DayOfWeeks randomDay = getRandomDay();
			System.out.println(randomDay.name());
		}
	}

	public static DayOfWeeks getRandomDay(){
		int randomInt = new Random().nextInt(7);
		var allDays = DayOfWeeks.values();
		return allDays[randomInt];
	}
}
