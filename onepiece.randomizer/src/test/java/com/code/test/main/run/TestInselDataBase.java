package com.code.test.main.run;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.code.main.*;

class TestInselDataBase {

	static InselHerkunftDatabase dataBase;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		dataBase = new InselHerkunftDatabase();
	}

	@Test
	void getInselByNameTestEquals() {
		// given
		InselHerkunft check = new InselHerkunft("Baltigo", "test success", "test success");

		// when

		InselHerkunft response = dataBase.getInselByName("Baltigo");
		// then

		assertEquals(response.getInselName(), check.getInselName());

	}

	@Test
	void getInselByNameTestThrowIllegelArgument() {

		// then
		assertThrows(IllegalArgumentException.class, () -> {
			dataBase.getInselByName("NonExistentIsland");
		}, "Insel mit dem Namen \"NonExistentIsland\" wurde nicht gefunden."

		);

	}

	@Test
	void getInselRandomTestNotEquals() {

		// when

		InselHerkunft randomInsel1 = dataBase.getInselRandom();
		InselHerkunft randomInsel2 = dataBase.getInselRandom();
// then
		assertNotEquals(randomInsel1, randomInsel2);

	}

}
