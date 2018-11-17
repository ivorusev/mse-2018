package com.ru.oop.lambda;

import java.util.function.Predicate;

public class WordVerifier {

	public static boolean verify(String string) {
		Predicate<String> wordVerifier = (s) -> s.matches("[A-Z]{1,1}[a-z]+");
		return wordVerifier.test(string);
	}
}
