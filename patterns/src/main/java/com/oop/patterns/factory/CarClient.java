package com.oop.patterns.factory;

public class CarClient {

	public static CarFactory buildCar(Cars car) {
		if (car == Cars.BMW) {
			return new BmwFactory();
		} else if (car == Cars.Porsche) {
			return new PorscheFactory();
		} else {
			throw new IllegalArgumentException("Unknown car type");
		}
	}

}
