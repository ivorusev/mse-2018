package com.oop.patterns.singleton;

public class World {

	private static World world;
	
	private World() {
	}

	public synchronized static World getInstance() {
		if (world == null) {
			world = new World();
			return world;
		}
		return world;
	}
}
