package com.floristeria.domain;

import java.util.ArrayList;

public class Stock {

	public static ArrayList<Object> stock() {
		
		double flowerStock = 20.0; //0
		double treeStock = 5.0; //1
		double woodDecorationStock = 10.0; //2
		double plasticDecorationStock = 20.0; //3
		
		ArrayList<Object> stock = new ArrayList<>();
		
		stock.add(flowerStock);
		stock.add(treeStock);
		stock.add(woodDecorationStock);
		stock.add(plasticDecorationStock);
		
//		if () {
//			
//		}
		
		System.out.println("Flower stock: " + stock.get(0) + " | Tree stock: " + stock.get(1) + " | Wood decoration stock: " + stock.get(2) + " | Plastic decoration stock: "+ stock.get(3));
		
		return stock;

	}
}
