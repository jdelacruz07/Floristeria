package com.floristeria.domain;

public class Florist { // has a name, flowers, trees and decoration

	String name;
	
	public Florist() {
		
	}
	
	public Florist(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
