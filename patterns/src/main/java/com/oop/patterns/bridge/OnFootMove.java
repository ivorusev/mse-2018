package com.oop.patterns.bridge;

public class OnFootMove implements KnightMove {

	@Override
	public void move() {
		System.out.println("This knight is poor and moves on FOOT!");
	}

}
