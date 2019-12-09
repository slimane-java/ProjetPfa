package com.emsi.Entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Tp {
	
	@Id
	private int    IdTp;
	private String Nom;
	private Date   DateCreation;
	private Date   DateRendu;
	private String Url;
	
	@ManyToOne
	private Cours Cours;
	
	@OneToMany(mappedBy = "tp")
	private Set<TpEtudient> tpEtudient =new HashSet<TpEtudient>();
	
	
	
	public Tp(int idTp, String nom, Date dateCreation, Date dateRendu, String url) {
		super();
		IdTp = idTp;
		Nom = nom;
		DateCreation = dateCreation;
		DateRendu = dateRendu;
		Url = url;
	}
	public Tp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdTp() {
		return IdTp;
	}
	public void setIdTp(int idTp) {
		IdTp = idTp;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public Date getDateCreation() {
		return DateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		DateCreation = dateCreation;
	}
	public Date getDateRendu() {
		return DateRendu;
	}
	public void setDateRendu(Date dateRendu) {
		DateRendu = dateRendu;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	
	

}
