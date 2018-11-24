package com.oop.patterns.bridge;

public class Launcher {

	public static void main(String[] args) {
		KnightMove move = new HorseMove();
		Knight good = new GoodKnight(WeaponFactory.createWeapon(Weapons.AXE), move);
		good.move();
		good.fight();
	}

}
