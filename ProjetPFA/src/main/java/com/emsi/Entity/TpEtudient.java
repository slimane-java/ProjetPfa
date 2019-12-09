package com.emsi.Entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TpEtudient implements Serializable{
	
	@Id
	@ManyToOne
	private Tp tp;
	@Id
	@ManyToOne
	private Etudiant etudiant;
	
	private String Url;
	private float point;

}
