package com.oop.patterns.factory;

public class Launcher {

	public static void main(String[] args) {
		CarFactory factory = CarClient.buildCar(Cars.BMW);
		factory.createTires().roll();
		factory.createEngine().start();
	}

}
