package com.floristeria.application;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.floristeria.domain.Entity;
import com.floristeria.persistence.Repository;

public class ControllerTest {

	@Test
	public void test() throws Exception {
		Controller controller = new Controller();
		Repository repository = new Repository();
		
		controller.createDecoration(Entity.getCounter(), "Tabla  ", 30, true, 20);
		controller.createDecoration(Entity.getCounter(), "Tabla  ", 30, false, 20);
		List<Entity> items = repository.getAllInventory();
		int count = items.size();
		assertEquals(2, count);
		
	}

}
