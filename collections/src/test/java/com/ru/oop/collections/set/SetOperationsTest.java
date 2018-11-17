package com.ru.oop.collections.set;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SetOperationsTest {

	@Test
	public void test() {
		Set<Integer> firstSet = new HashSet<>();
		firstSet.add(1);
		firstSet.add(2);
		firstSet.add(3);

		Set<Integer> secondSet = new HashSet<>();
		secondSet.add(3);
		secondSet.add(4);

		Set<Integer> expected = new HashSet<>();
		expected.add(1);
		expected.add(2);

		Set<Integer> actual = SetUtil.getAllInFirstNotInSecond(firstSet,
				secondSet);
		assertEquals(expected.size(), actual.size());
		assertEquals(expected.contains(2), actual.contains(2));
		assertEquals(expected.contains(1), actual.contains(1));
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_2() {
		Set<Integer> firstSet = new HashSet<>();
		firstSet.add(1);
		firstSet.add(2);
		firstSet.add(3);

		Set<Integer> secondSet = new HashSet<>();
		secondSet.add(3);
		secondSet.add(4);

		Set<Integer> expected = new HashSet<>();
		expected.add(1);
		expected.add(2);
		expected.add(4);

		Set<Integer> actual = SetUtil.getNotCommonElement(firstSet,
				secondSet);
		assertEquals(expected, actual);
		
	}

}
