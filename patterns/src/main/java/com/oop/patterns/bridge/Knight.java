package com.oop.patterns.bridge;

public abstract class Knight {

	protected Weapon weapon;
	protected KnightMove move;

	public Knight(Weapon weapon, KnightMove move) {
		this.weapon = weapon;
		this.move = move;
	}

	public abstract void fight();

	public abstract void move();
}
