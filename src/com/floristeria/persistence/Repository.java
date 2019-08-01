package com.floristeria.persistence;

import java.util.ArrayList;

import com.floristeria.domain.Entity;

public class Repository {
	
	private static ArrayList<Entity> inventory=new ArrayList<>();
	
	public Repository() {
		
		
	}
	
	public ArrayList<Entity> getAllInventory(){
		return new ArrayList<>(inventory);
	}
	
	
	public void addItem(Entity item) throws Exception{
		if(inventory==null) throw new Exception();
		inventory.add(item);
	}

	
	
}
