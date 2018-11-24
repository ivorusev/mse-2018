package com.oop.patterns.builder;

public class Fish {
	
	private int length;
	private String color;
	private String name;
	private double weight;
	private boolean isSaltWater;

	public static class Builder {
		
		private int length;
		private String color;
		private String name;
		private double weight;
		private boolean isSaltWater;

		public Builder setSize(int length) {
			this.length = length;
			return this;
		}
		
		public Builder setColor(String color) {
			this.color = color;
			return this;
		}
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder setWeight(double weight) {
			this.weight = weight;
			return this;
		}
		
		public Builder setSaltWater(boolean isSaltWater) {
			this.isSaltWater = isSaltWater;
			return this;
		}
		
		public Fish build() {
			Fish object = new Fish();
			object.setLength(length);
			object.setName(name);
			object.setWeight(weight);
			object.setSaltWater(isSaltWater);
			object.setColor(color);
			return object;
		}
		
	};
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isSaltWater() {
		return isSaltWater;
	}

	public void setSaltWater(boolean isSaltWater) {
		this.isSaltWater = isSaltWater;
	}


}
