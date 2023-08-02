package com.code.test.main.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class InselHerkunftDatabase {

	ArrayList<InselHerkunft> inselListe = new ArrayList<InselHerkunft>(
			Arrays.asList(new InselHerkunft("Alabasta", "Grand Line", "Paradise"),
					new InselHerkunft("Dressrosa", "Grand Line", "Paradise"),
					new InselHerkunft("Fishman Island", "Grand Line", "Unterwasser"),
					new InselHerkunft("Skypia", "Grand Line", "Paradise"),
					new InselHerkunft("Punk Hazard", "Grand Line", "New World"),
					new InselHerkunft("Whole Cake Island", "New World", "Big Mom-Territorium"),
					new InselHerkunft("Wano Kuni", "New World", "Wano-Land"),
					new InselHerkunft("Zou", "New World", "Mokomo Dukedom"),
					new InselHerkunft("Drum Rockies", "Grand Line", "Paradise"),
					new InselHerkunft("Sabaody Archipel", "Grand Line", "Paradise"),
					new InselHerkunft("Water Seven", "Grand Line", "Paradise"),
					new InselHerkunft("Enies Lobby", "Grand Line", "Paradise"),
					new InselHerkunft("Impel Down", "Grand Line", "Paradise"),
					new InselHerkunft("Marineford", "Grand Line", "Paradise"),
					new InselHerkunft("Amazon Lily", "Grand Line", "Paradise"),
					new InselHerkunft("Pirate Island", "Grand Line", "Paradise"),
					new InselHerkunft("Banaro Island", "Grand Line", "Paradise"),
					new InselHerkunft("Karakuri Island", "Grand Line", "Paradise"),
					new InselHerkunft("Baltigo", "New World", "Revolutionary Army-Territorium"),
					new InselHerkunft("Elban", "Grand Line", "Paradise")));

	public InselHerkunft getTeufelsfruchtByName(String name) {

		
		for (InselHerkunft insel : inselListe) {
			if (name.equals(insel.getInselName())) {
				return insel;

			}

		}
		throw new IllegalArgumentException("Insel mit dem Namen \"" + name + "\" wurde nicht gefunden.");

	}

	public InselHerkunft getTeufelsfruchtRandom() {
		Random randomNumber = new Random();
		return inselListe.get(randomNumber.nextInt(inselListe.size()));

	}
}
