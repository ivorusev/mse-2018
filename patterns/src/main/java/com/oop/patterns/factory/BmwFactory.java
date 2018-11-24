package com.oop.patterns.factory;

public class BmwFactory implements CarFactory {

	@Override
	public Tires createTires() {
		return new BmwTires();
	}

	@Override
	public Engine createEngine() {
		return new BmwEngine();
	}

}
