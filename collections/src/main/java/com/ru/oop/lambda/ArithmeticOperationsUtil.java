package com.ru.oop.lambda;

public class ArithmeticOperationsUtil {

	public static int sum(int i, int j) {
		ArithmeticOperation oop = (number1, number2) -> number1 + number2;
		return oop.execute(i, j);
	}

	public static int multiply(int i, int j) {
		ArithmeticOperation oop = (number1, number2) -> number1 * number2;
		return oop.execute(i, j);
	}

}
