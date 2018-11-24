package com.oop.patterns.bridge;

public class Axe implements Weapon {

	@Override
	public void swing() {
		System.out.println("Swings an AXE!");
	}

}
