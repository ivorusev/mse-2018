package com.ru.oop.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetUtil {

	public static Set<Integer> getAllInFirstNotInSecond(Set<Integer> firstSet,
			Set<Integer> secondSet) {
		firstSet.removeAll(secondSet);
		return firstSet;
	}

	public static Set<Integer> getNotCommonElement(Set<Integer> firstSet,
			Set<Integer> secondSet) {
		Set<Integer> firstCopy = new HashSet<>(firstSet);
		firstCopy.removeAll(secondSet);
		
		Set<Integer> secondCopy = new HashSet<>(secondSet);
		secondCopy.removeAll(firstSet);
		
		Set<Integer> result = new HashSet<Integer>();
		result.addAll(firstCopy);
		result.addAll(secondCopy);
		return result;
	}

}
