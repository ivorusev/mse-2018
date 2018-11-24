package com.oop.patterns.bridge;

public class Sword implements Weapon {

	@Override
	public void swing() {
		System.out.println("Swings a SWORD!");
	}

}
