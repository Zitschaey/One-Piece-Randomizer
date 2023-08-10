package com.code.test.main.run;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.code.main.InselHerkunft;
import com.code.main.InselHerkunftDatabase;
import com.code.main.Teufelsfrucht;
import com.code.main.TeufelsfruchtDatabse;

class TestTeufelsfruchtDatabase {

	static TeufelsfruchtDatabse dataBase;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		dataBase = new TeufelsfruchtDatabse();
	}

	@Test
	void getTeufelsfruchtByNameTestEquals() {
		// given
		Teufelsfrucht check = new Teufelsfrucht("Sprung-Sprung-Frucht", "test success", "test success");

		// when

		Teufelsfrucht response = dataBase.getTeufelsfruchtByName("Sprung-Sprung-Frucht");
		// then

		assertEquals(response.getName(), check.getName());

	}

	@Test
	void getTeufelsfruchtByNameTestThrowIllegelArgument() {

		// then
		assertThrows(IllegalArgumentException.class, () -> {
			dataBase.getTeufelsfruchtByName("NonExistentFruit");
		}, "Insel mit dem Namen \"NonExistentFruit\" wurde nicht gefunden."

		);

	}

	@Test
	void getTeufelsfruchtRandomTestNotEquals() {

		// when

		Teufelsfrucht randomFrucht1 = dataBase.getTeufelsfruchtRandom();
		Teufelsfrucht randomFrucht2 = dataBase.getTeufelsfruchtRandom();
// then
		assertNotEquals(randomFrucht1, randomFrucht2);

	}

}
