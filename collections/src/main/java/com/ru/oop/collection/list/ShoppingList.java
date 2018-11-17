package com.ru.oop.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShoppingList {

	private final Comparator<Product> priceComparator = (o1, o2) -> {
		double result = o1.getPrice() - o2.getPrice();
		if (result < 0) {
			return -1;
		} else if (result > 0) {
			return 1;
		} else {
			return 0;
		}
	};

	private final Comparator<Product> nameComparator = (o1, o2) -> o1.getName()
			.compareTo(o2.getName());

	private final Comparator<Product> qComparator = (o1, o2) -> o1
			.getQuantity() - o2.getQuantity();

	private static ShoppingList shoppingList = new ShoppingList();

	private static List<Product> products = new ArrayList<>();

	private ShoppingList() {
	}

	public static ShoppingList getInstance() {
		return shoppingList;
	}

	public void add(Product product) {
		products.add(product);
	}

	public int getProductsCount() {
		return products.size();
	}

	public List<Product> sort(SortingCriteria criteria) {
		if (SortingCriteria.PRICE == criteria) {
			Collections.sort(products, priceComparator);
		}
		if (SortingCriteria.NAME == criteria) {
			Collections.sort(products, nameComparator);
		}
		if (SortingCriteria.QUANTITY == criteria) {
			Collections.sort(products, qComparator);
		}
		return new ArrayList<Product>(products);
	}

	public void printElements() {
		products.forEach(System.out::println);
	}

	public static void main(String[] args) {
		List<Product> test = new ArrayList<Product>();
		test.add(new Product("asd", 12.3, 3));
		test.add(new Product("asd1", 12.3, 3));
		test.add(new Product("asd2", 12.3, 3));

		test.parallelStream().map(Product::getName)
				.forEach(System.out::println);
	}
}
