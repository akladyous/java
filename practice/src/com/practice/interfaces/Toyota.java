package com.practice.interfaces;

import com.practice.enumeration.ToyotaModels;

import java.util.ArrayList;

public class Toyota implements Vehicle {
	public String model;
	public String color;
	public Integer year;
	public ArrayList<String> features;


	public Toyota(String model, String color, Integer year) {
		this.model = model;
		this.color = color;
		this.year = year;
	}

	public static void main(String[] args) {
		Vehicle.info();
		Toyota camry = new Toyota("camry", "white", 2023);
		camry.printDescription();
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
		return super.toString();
	}


	public void gps(Vehicle vehicle) {
		Vehicle obj1 = (Vehicle) vehicle;

	}
}
