package com.floristeria.domain;

public class Decoration extends Entity {
	boolean isWood;
	String material;

	public Decoration(int id, String name, double price, boolean isWood, int stock) {
		super(id, name, price, stock);
		this.isWood = isWood;
	}

	@Override
	public void price() {

	}

	@Override
	public void stock() {

	}

	public boolean isWood() {
		return isWood;
	}

	public void setWood(boolean isWood) {
		this.isWood = isWood;
		if (isWood) {
			material = "fusta";
		} else {
			material = "plàstic";
		}
	}

	@Override
	public String toString() {
		setWood(isWood);
		return super.toString() + "| Material: " + material;
	}

}
