package it.prova.provaliste.test;

import java.util.Arrays;
import java.util.List;

import it.prova.provaliste.model.Persona;

public class TestPersona {

	public static void main(String[] args) {

		
		
		List<Persona> persone = Arrays.asList(new Persona("Max", "Cara", 29), new Persona("John", "Marston", 43),
				new Persona("Arthur", "Morgan", 32), new Persona("Rick", "Sanchez", 74)); 
		
		
		
		Persona io = new Persona("Max", "Cara", 29);  // questa è un'istanza
		
		
		
		System.out.println(io.presenteInElencoEquals(persone));
		
		
		
	}

}
