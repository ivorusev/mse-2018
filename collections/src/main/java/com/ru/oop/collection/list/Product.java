package com.ru.oop.collection.list;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public boolean equals(Object obj) {
		Product p = (Product) obj;
		return this.getName().equals(p.getName())
				&& this.getQuantity() == p.getQuantity()
				&& this.getPrice() == p.getPrice();
	}
	
	@Override
	public String toString() {
		return name + " " + quantity + " " + " " + price;
	}

}
