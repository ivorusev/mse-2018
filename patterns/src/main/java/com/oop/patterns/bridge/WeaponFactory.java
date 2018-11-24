package com.oop.patterns.bridge;

public class WeaponFactory {

	public static Weapon createWeapon(Weapons weapon) {
		if (weapon == Weapons.AXE) {
			return new Axe();
		} else if (weapon == Weapons.SWORD) {
			return new Sword();
		} else {
			throw new IllegalArgumentException("Wrong weapon type");
		}
	}
}
