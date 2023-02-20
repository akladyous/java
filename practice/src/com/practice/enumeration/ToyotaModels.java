package com.practice.enumeration;

public enum ToyotaModels {
	AVALON(1994),
	BELTA(2005),
	BZ3(2022),
	CAMRY(1982),
	CENTURY(1967),
	COROLLA( 1966);

	private final Integer year;

	ToyotaModels(Integer year) {
		this.year = year;
	}

	public Integer getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "ToyotaModels{" +
						"year=" + year +
						'}';
	}
}
