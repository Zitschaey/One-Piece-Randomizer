package com.code.main;

public class App {
	public static void main(String[] args) {
		OnePiecePerson Max = new OnePiecePerson();

		printOnePiecePersonInfo(Max);

	}

	public static void printOnePiecePersonInfo(OnePiecePerson person) {
		System.out.println("**************************************");
		System.out.println("************ One Piece ****************");
		System.out.println("**************************************");

		System.out.println("\nHerkunft:");
		System.out.println("Kommt aus der Insel: " + person.getInsel().getInselName());
		System.out.println("Kommt aus der See: " + person.getInsel().getSeaName());
		System.out.println("Kommt aus der Region: " + person.getInsel().getRegionName());

		System.out.println("\nKräfte:");
		System.out.println("Besitzt folgende Teufelsfrucht: " + person.getTeufelsfrucht().getName());
		System.out.println("Ist vom Typ: " + person.getTeufelsfrucht().getTyp());
		System.out.println("Kann folgendes: " + person.getTeufelsfrucht().getBeschreibung());

		System.out.println("\n**************************************");
	}
}
