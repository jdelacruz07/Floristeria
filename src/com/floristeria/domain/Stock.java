package com.floristeria.domain;

import java.util.ArrayList;
import java.util.List;

public class Stock {

	public List<Object> stock() {
		double flowerStock = 20.0;
		double treeStock = 5.0;
		double woodDecorationStock = 10.0;
		double plasticDecorationStock = 20.0;
		List<Object> stock = new ArrayList<>();

		stock.add(flowerStock);
		stock.add(treeStock);
		stock.add(woodDecorationStock);
		stock.add(plasticDecorationStock);

		System.out.println("Flower stock: " + stock.get(0) + " | Tree stock: " + stock.get(1)
				+ " | Wood decoration stock: " + stock.get(2) + " | Plastic decoration stock: " + stock.get(3));

		return stock;

	}
}
