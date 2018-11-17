package com.ru.oop.collection.list;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class ShoppingListTest {
	
	private static ShoppingList shoppingList;
	
	@BeforeClass
	public static void init() {
		shoppingList = ShoppingList.getInstance();
		Product p1 = new Product("мляко", 2.60, 2);
		Product p2 = new Product("месо", 5.60, 1);
		Product p3 = new Product("баница", 2.00, 5);
		shoppingList.add(p1);
		shoppingList.add(p2);
		shoppingList.add(p3);
	}
	
	@Test
	public void test_sorting_price() {
		Product p1 = new Product("мляко", 2.60, 2);
		Product p2 = new Product("месо", 5.60, 1);
		Product p3 = new Product("баница", 2.00, 5);
		List<Product> expected = new ArrayList<>();
		expected.add(p3);
		expected.add(p1);
		expected.add(p2);
		
		List<Product> actual = shoppingList.sort(SortingCriteria.PRICE);

		Product[] exp = new Product[expected.size()];
		Product[] act = new Product[expected.size()];
		expected.toArray(exp);
		actual.toArray(act);
		
		assertArrayEquals(exp ,act);
	}
	
	@Test
	public void test_sorting_name() {
		Product p1 = new Product("мляко", 2.60, 2);
		Product p2 = new Product("месо", 5.60, 1);
		Product p3 = new Product("баница", 2.00, 5);
		List<Product> actual = shoppingList.sort(SortingCriteria.NAME);

		List<Product> expected = new ArrayList<>();
		expected.add(p3);
		expected.add(p2);
		expected.add(p1);

		Product[] exp = new Product[expected.size()];
		Product[] act = new Product[expected.size()];
		expected.toArray(exp);
		actual.toArray(act);
		
		assertArrayEquals(exp ,act);
	}
	
	@Test
	public void test_sorting_q() {
		Product p1 = new Product("мляко", 2.60, 2);
		Product p2 = new Product("месо", 5.60, 1);
		Product p3 = new Product("баница", 2.00, 5);
		List<Product> actual = shoppingList.sort(SortingCriteria.QUANTITY);

		List<Product> expected = new ArrayList<>();
		expected.add(p2);
		expected.add(p1);
		expected.add(p3);

		Product[] exp = new Product[expected.size()];
		Product[] act = new Product[expected.size()];
		expected.toArray(exp);
		actual.toArray(act);
		
		assertArrayEquals(exp ,act);
	}
	
	@Test
	public void test_print() {
		// ByteArrayOutputStream str = new ByteArrayOutputStream();
		// PrintStream stream = new PrintStream(str);
		// System.setOut(stream);
		// System.out.println("asd");
		// String a = str.toString();
		shoppingList.printElements();
	}

}
