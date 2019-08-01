package com.floristeria.domain;

public class Decoration extends Entity {

	boolean isWood;
	String material;// wood or plastic

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
			material="fusta";
		} else {
			material="plàstic";
		}
			
	}

	@Override
	public String toString() {
					
//		return "ID: " + this.getId() + " | Article " + this.getName() + " amb material " + this.isWood + "| Stock: " + this.getStock() 
//		+ " uds" + " | Preu: " + this.getPrice() + " €";
		setWood(isWood);
		return super.toString() + "| Material: " + material;
	}
}
