package com.floristeria;

import com.floristeria.application.Controller;
import com.floristeria.domain.Entity;
import com.floristeria.domain.Florist;
import com.floristeria.persistence.Stock;

public class Main {

	public static void main(String[] args) throws Exception {
		Florist flowerPower = new Florist("Flower Power");
		Controller controller = new Controller();
		Stock stock = new Stock();

		System.out.println("Has creado correctamente la floristeria " + flowerPower.getName());

		controller.createDecoration(Entity.getCounter(), "Tabla  ", 30, true, 20);
		controller.createDecoration(Entity.getCounter(), "Tabla  ", 30, false, 20);
		controller.createDecoration(Entity.getCounter(), "Mesa   ", 50, false, 30);
		controller.createDecoration(Entity.getCounter(), "Mesa   ", 50, true, 30);
		controller.createFlower(Entity.getCounter(), "Tulipan", 5, "red", 20);
		controller.createTree(Entity.getCounter(), "Pino   ", 100, 20.0, 5);
		controller.seeStock();
		stock.stock();
		

	}

}