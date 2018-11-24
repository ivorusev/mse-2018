package com.oop.patterns.factory;

public interface CarFactory {
	
	Tires createTires();
	
	Engine createEngine();

}
