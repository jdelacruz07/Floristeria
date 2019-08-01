package com.floristeria.application;

import com.floristeria.domain.Decoration;
import com.floristeria.domain.Entity;
import com.floristeria.domain.Flowers;
import com.floristeria.domain.Trees;
import com.floristeria.persistence.Repository;

public class Controller {

	private Repository repository = new Repository();

	public Controller() {

	}

	public void createFlower(int id, String name, double price, String color, int stock) throws Exception {
		Flowers flower = new Flowers(id, name, price, color, stock);
		repository.addItem(flower);

	}

	public void createTree(int id, String name, double price, double height, int stock) throws Exception {
		Trees tree = new Trees(id, name, price, height, stock);
		repository.addItem(tree);

	}

	public void createDecoration(int id, String name, double price, boolean isWood, int stock) throws Exception {
		Decoration decoration = new Decoration(id, name, price, isWood, stock);
		repository.addItem(decoration);

	} // ctrl alt flechita

	public void seeStock() {

		System.out.println("Mostrant tot el stock:");

		for (Entity item : repository.getAllInventory()) {
			
			System.out.println(item.toString());


		}

	}
	
}
