package com.code.test.main.run;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		OnePiecePerson Max = new OnePiecePerson();

		System.out.println("**************************************");
		System.out.println("************ One Piece ****************");
		System.out.println("**************************************");

		System.out.println("\nHerkunft:");
		System.out.println("Kommt aus der Insel: " + Max.getInsel().getInselName());
		System.out.println("Kommt aus der See: " + Max.getInsel().getSeaName());
		System.out.println("Kommt aus der Region: " + Max.getInsel().getRegionName());

		System.out.println("\nKräfte:");
		System.out.println("Besitzt folgende Teufelsfrucht: " + Max.getTeufelsfrucht().getName());
		System.out.println("Ist vom Typ: " + Max.getTeufelsfrucht().getTyp());
		System.out.println("Kann folgendes: " + Max.getTeufelsfrucht().getBeschreibung());

		System.out.println("\n**************************************");

	}
}
