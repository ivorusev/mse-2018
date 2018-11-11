package com.edu.ru.oop.sum;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumatorTest {

	@Test
	public void test() {
		assertEquals(4, Sumator.sum(2, 2));
	}

}
