package com.oop.springboot.demo.dto;

public class Knight {
	
	private String name;
	private int age;
	private Weapon weapon;
	
	public Knight() {
	}
	
	public Knight(String name, int age, Weapon weapon) {
		super();
		this.name = name;
		this.age = age;
		this.weapon = weapon;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
}
