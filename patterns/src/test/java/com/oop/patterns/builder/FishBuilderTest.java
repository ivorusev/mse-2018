package com.oop.patterns.builder;

import static org.junit.Assert.*;

import org.junit.Test;

import com.oop.patterns.builder.Fish.Builder;

public class FishBuilderTest {

	@Test
	public void test() {
		Builder builder = new Fish.Builder();
		Fish fish = builder.setSize(12).build();
		assertEquals(12, fish.getLength());
		assertEquals(null, fish.getColor());
	}

}
