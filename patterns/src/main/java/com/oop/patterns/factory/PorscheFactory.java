package com.oop.patterns.factory;

public class PorscheFactory implements CarFactory {

	@Override
	public Tires createTires() {
		return new PorscheTires();
	}

	@Override
	public Engine createEngine() {
		return new PorscheEngine();
	}

}
