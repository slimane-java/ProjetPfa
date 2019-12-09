package com.emsi.Entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Professeur extends User{
	
	private String Specialite;

	
	
	public Professeur() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Professeur(int idUser, String nom, String prenom, Date dateNaissance, Date dateIntegrer, String email,
			String tel) {
		super(idUser, nom, prenom, dateNaissance, dateIntegrer, email, tel);
		// TODO Auto-generated constructor stub
	}



	public String getSpecialite() {
		return Specialite;
	}



	public void setSpecialite(String specialite) {
		Specialite = specialite;
	}



	@Override
	public String toString() {
		return "Info"+this.toString()+"Professeur [Specialite=" + Specialite + "]";
	}



	
	

}
