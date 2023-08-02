package com.code.test.main.run;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class OnePiecePerson {
	
	private Teufelsfrucht teufelsfrucht;
	private InselHerkunft insel;
	
	
	public OnePiecePerson() {
		super();
		this.teufelsfrucht = new TeufelsfruchtDatabse().getTeufelsfruchtRandom();
		this.insel = new InselHerkunftDatabase().getTeufelsfruchtRandom() ;
	}

	
	
}
