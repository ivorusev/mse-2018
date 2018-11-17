package com.ru.oop.lambda;


import org.junit.Assert;
import org.junit.Test;

public class ArithmeticOperationsTest {
	
	@Test
	public void test_sum() {
		int result = ArithmeticOperationsUtil.sum(2, 2);
		Assert.assertEquals(4, result);
	}
	
	@Test
	public void test_multiply() {
		int result = ArithmeticOperationsUtil.multiply(4, 2);
		Assert.assertEquals(8, result);
	}

}
