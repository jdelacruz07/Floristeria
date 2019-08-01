package com.floristeria.domain;

public abstract class Entity {

	protected int id;
	protected String name;
	protected double price;
	protected int stock;
	private static int COUNTER = 1;

	public Entity(int id, String name, double price, int stock) {
		
		this.price = price;
		this.stock = stock;
		this.name = name;
		this.id = id;
		id = COUNTER;
		COUNTER++;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public static int getCOUNTER() {
		return COUNTER;
	}

	public static void setCOUNTER(int cOUNTER) {
		COUNTER = cOUNTER;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "ID: " + this.getId() + " | Article " + this.getName() +  " | Stock: " + this.getStock() 
		+ " uds" + " | Preu: " + this.getPrice() + " € ";
	}

	public abstract void price();
	public abstract void stock();
	
}
