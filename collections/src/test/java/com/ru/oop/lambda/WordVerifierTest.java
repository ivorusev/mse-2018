package com.ru.oop.lambda;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordVerifierTest {

	@Test
	public void test_stringVerifies() {
		boolean result = WordVerifier.verify("This");
		assertTrue(result);
	}
	
	@Test
	public void test_stringNotCorrent() {
		boolean result = WordVerifier.verify("this");
		assertFalse(result);
	}

}
