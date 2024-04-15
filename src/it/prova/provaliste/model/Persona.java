package it.prova.provaliste.model;

import java.util.*;

public class Persona {

	private String nome; 
	private String cognome; 
	private int eta; 
	
	public Persona() {
		
	}
	
	public Persona(String nome, String cognome, int eta) {
		
		this.nome = nome; 
		this.cognome = cognome; 
		this.eta = eta; 
	}
	
	public String getNome() {
		return nome; 
	}
	
	public void setNome(String nome) {
		this.nome = nome; 
	}
	
	public String getCognome() {
		return cognome; 
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome; 
	}
	
	public int getEta() {
		return eta; 
	}
	
	public void setEta(int eta) {
		this.eta = eta; 
	}
	
	
	public boolean presenteInElencoEquals(List<Persona> persone) {
		
		return persone.contains(this); 
		
	}
	@Override
	public boolean equals(Object obj) {  // tasto destro-Source-Generate hashCode() and equals()
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(cognome, other.cognome) && eta == other.eta && Objects.equals(nome, other.nome);
	}
	
//	public boolean presenteInElenco(List<Persona> persone) {	
//		
//		
//	}
	
	
	
}
