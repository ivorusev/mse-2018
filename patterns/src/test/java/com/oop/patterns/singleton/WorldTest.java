package com.oop.patterns.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

import com.oop.patterns.singleton.World;

public class WorldTest {

	@Test
	public void test() {
		World actual = World.getInstance();
		World expected = World.getInstance();
		assertTrue(actual.equals(expected));
	}
	
	@Test
	public void test_multithread() {
		Runnable r = () -> {
			@SuppressWarnings("unused")
			World actual = World.getInstance();
		};
		
		Runnable r1 = () -> {
			@SuppressWarnings("unused")
			World expected = World.getInstance();
		};
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r1);
		t1.run();
		t2.run();
		System.out.println();
	}

}
