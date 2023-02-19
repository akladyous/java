package com.practice.enumeration;

public enum ToyotaModels {

	AVALON("XX50", 1994),
	BELTA("Belta", 2005),
	BZ3("BZ23", 2022),
	CAMRY("XV70", 1982),
	CENTURY("G50", 1967),
	COROLLA("E210", 1966);

	private final Integer year;
	private final String model;
	ToyotaModels(String model, Integer year) {
		this.model = model;
		this.year = year;
	}

	public Integer getYear() {
		return year;
	}

	public String getModel() {
		return model;
	}


}
