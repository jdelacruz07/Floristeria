package com.floristeria.domain;

public class Flower extends Entity {
	String color;

	public Flower(int id, String name, double price, String color, int stock) {
		super(id, name, price, stock);
		this.color = color;
	}

	@Override
	public void price() {

	}

	@Override
	public void stock() {

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + "| Color: " + this.getColor();
	}

}
