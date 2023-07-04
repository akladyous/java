package com.practice.interfaces.vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Toyota implements Vehicle, Comparable<Toyota> {
	public String model;
	public String color;
	public Integer year;
	public ArrayList<String> features;
	private static List<Toyota> cars = new ArrayList<>();


	public Toyota(String model, String color, Integer year) {
		this.model = model;
		this.color = color;
		this.year = year;
		cars.add(this);
	}

	public static void printAllCars() {
		Collections.sort(cars);
		System.out.println(cars.toString());

	}

	@Override
	public void addFeatures(String feature) {
		features.add(feature);
	}

	@Override
	public void printDescription() {
		Vehicle.super.printDescription();
	}

	@Override
	public String toString() {
		return "Toyota{" +
					   "model='" + model + '\'' +
					   ", color='" + color + '\'' +
					   ", year=" + year +
					   ", features=" + features +
					   '}';
	}

	private void gps(Vehicle vehicle) {
		Vehicle obj1 = (Vehicle) vehicle;

	}
	void prova(){
		//
	}

	@Override
	public int compareTo(Toyota toyota) {
		if (this.year > toyota.year) {
			return 1;
		} else if (this.year < toyota.year) {
			return -1;
		} else return 0;
	}

}
