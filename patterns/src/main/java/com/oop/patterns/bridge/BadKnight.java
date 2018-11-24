package com.oop.patterns.bridge;

public class BadKnight extends Knight {

	public BadKnight(Weapon weapon, KnightMove move) {
		super(weapon, move);
	}

	@Override
	public void fight() {
		weapon.swing();
	}

	@Override
	public void move() {
		move.move();
	}
	

}
