package it.prova.provaliste.test;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollezioni {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>(); 
		lista.add("Ciao"); 
		lista.add("boh"); 
		
		System.out.println(lista);
		
		lista.remove(1); 
		lista.add("mondo!"); 
		
		System.out.println(lista);

		
		boolean contiene = lista.contains("mondo!"); 	
		System.out.println(contiene);

		
		ArrayList<String> nuovaLista = new ArrayList<String>(); 
		
		boolean vuota = nuovaLista.isEmpty(); 		
		System.out.println(vuota);
		
		
		int dimensione = lista.size(); 		
		System.out.println(dimensione);
		
		
		int indice = lista.indexOf("Ciao"); 		
		System.out.println(indice);
		
		
		String elemento = lista.get(1); 
		System.out.println(elemento);
		
		
		
		lista.set(1, "MONDO!"); 
		System.out.println(lista); 
		
		lista.clear();
		
		
		nuovaLista.add("Hello " + "world!"); 
		
		System.out.println(nuovaLista);
		
		lista.addAll(nuovaLista); 
		
		lista.add("scritto dopo"); 
		
		Collections.reverse(lista);
		
		System.out.println(lista);
		
		
		




		
		
	}

}
