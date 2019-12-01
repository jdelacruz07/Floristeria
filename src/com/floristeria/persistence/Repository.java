package com.floristeria.persistence;

import java.util.ArrayList;
import java.util.List;

import com.floristeria.domain.Entity;

public class Repository {
	private static List<Entity> inventory = new ArrayList<>();

	public Repository() {

	}

	public void addItem(Entity item) throws Exception {
		if (inventory == null)
			throw new Exception();
		inventory.add(item);
	}

	public List<Entity> getAllInventory() {
		return inventory;
	}

	
}
