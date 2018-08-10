package model;

import java.time.LocalDate;

public class Person {
	private String nom;
	private String prenom;
	private LocalDate localDate;
	
	public Person() {
		super();
	}
	
	public Person(String nom, String prenom, LocalDate localDate) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.localDate = localDate;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	
}
