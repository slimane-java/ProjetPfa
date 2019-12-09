package com.emsi.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Filiere implements Serializable{
	
	@Id
	private int IdFiliere;
	private String Nom;
	private Date DataCreation;
	
	@ManyToMany
	private Set<Etudiant>Etudients= new HashSet<Etudiant>();
	public Filiere(int idFiliere, String nom, Date dataCreation) {
		super();
		this.IdFiliere = idFiliere;
		Nom = nom;
		DataCreation = dataCreation;
	}
	public Filiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdFiliere() {
		return IdFiliere;
	}
	public void setIdFiliere(int idFiliere) {
		this.IdFiliere = idFiliere;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public Date getDataCreation() {
		return DataCreation;
	}
	public void setDataCreation(Date dataCreation) {
		DataCreation = dataCreation;
	}
	
	

}
