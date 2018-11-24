package com.oop.pattern.factory;

import static org.junit.Assert.*;

import org.junit.Test;

import com.oop.patterns.factory.BmwEngine;
import com.oop.patterns.factory.BmwTires;
import com.oop.patterns.factory.CarClient;
import com.oop.patterns.factory.CarFactory;
import com.oop.patterns.factory.Cars;

public class CarFactoryTest {

	@Test
	public void test() {
		CarFactory factory = CarClient.buildCar(Cars.BMW);
		assertTrue(factory.createTires() instanceof BmwTires);
		assertTrue(factory.createEngine() instanceof BmwEngine);
	}

}
