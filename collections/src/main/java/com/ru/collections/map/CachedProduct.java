package com.ru.collections.map;

import com.ru.oop.collection.list.Product;

public class CachedProduct {

	private Product product;

	private int count;

	public CachedProduct(Product product) {
		setCount(0);
		this.product = product;
	}

	public String getId() {
		return product.getName() + product.getPrice() + product.getQuantity();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
