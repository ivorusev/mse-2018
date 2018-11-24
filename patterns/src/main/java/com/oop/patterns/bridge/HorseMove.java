package com.oop.patterns.bridge;

public class HorseMove implements KnightMove {

	@Override
	public void move() {
		System.out.println("Moves with a HORSE");
	}

}
