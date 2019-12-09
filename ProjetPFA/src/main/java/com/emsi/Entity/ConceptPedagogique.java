package com.emsi.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ConceptPedagogique implements Serializable{
	@Id
	private int IdCP;
	private String Nom;
	private String Type;
	private String Url;
	private String Description;
	@ManyToOne
	private Chapiter chapiter;
	public ConceptPedagogique(String nom, String type, String url, String description) {
		super();
		
		Nom = nom;
		Type = type;
		Url = url;
		Description = description;
	}
	public ConceptPedagogique() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	
	

}
