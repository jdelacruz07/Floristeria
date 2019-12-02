package com.floristeria.application;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.floristeria.domain.Entity;
import com.floristeria.persistence.Repository;
import com.floristeria.persistence.Stock;

public class ControllerTest {

	@Test
	public void test() throws Exception {
		Controller controller = new Controller();
		Repository repository = new Repository();
		controller.createDecoration(Entity.getCounter(), "Tabla  ", 30, true, 20);
		controller.createDecoration(Entity.getCounter(), "Tabla  ", 30, false, 20);
		controller.seeStock();
		List<Entity> items = repository.getAllInventory();
		int count = items.size();
		assertEquals(2, count);
	}
	
	@Test
	public void stockTest() {
		Stock stock = new Stock();
		stock.stock();
	}

}
