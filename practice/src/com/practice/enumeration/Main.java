package com.practice.enumeration;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		DayOfWeeks dayWeek = DayOfWeeks.MONDAY;
		System.out.println(dayWeek);
		System.out.printf("Name is %s - Ordinal %d \n", dayWeek.name(), dayWeek.ordinal());

		System.out.println("-".repeat(40));
		for (int i = 0; i < 7; i++) {
			DayOfWeeks randomDay = getRandomDay();
			System.out.printf(
							"Day is %-10s Ordinal %-2d %s \n",
							randomDay.name(), randomDay.ordinal(), randomDay.weekEnds()
			);
		}
	}

	public static DayOfWeeks getRandomDay(){
		int randomInt = new Random().nextInt(7);
		var allDays = DayOfWeeks.values();
		return allDays[randomInt];
	}
}
