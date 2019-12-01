package com.floristeria.domain;

public class Tree extends Entity {
	double height;

	public Tree(int id, String name, double price, double height, int stock) {
		super(id, name, price, stock);
		this.height = height;
	}

	@Override
	public void price() {

	}

	@Override
	public void stock() {

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return super.toString() + "| Alçada: " + this.height;
	}

}
