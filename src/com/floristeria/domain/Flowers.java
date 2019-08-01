package com.floristeria.domain;

public class Flowers extends Entity {

	String color;

	public Flowers(int id, String name, double price, String color, int stock) {
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
					
		//return "ID: " + this.getId() + " | Article " + this.getName() + " amb color " + this.color + "| Stock: " + this.getStock() 
		//+ " uds" + " | Preu: " + this.getPrice() + " €";
		
		return super.toString()+ "| Color: " + this.getColor();
	}
	
}
