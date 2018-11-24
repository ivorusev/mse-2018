package com.oop.patterns.bridge;

public class GoodKnight extends Knight {

	public GoodKnight(Weapon weapon, KnightMove move) {
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
