package com.emsi.Entity;

import java.util.Date;

public class QSM {

	private int  IdQCM;
	private Date DateCreation;
	private int  Dure;
	private String Type;
	public QSM() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QSM(int idQCM, Date dateCreation, int dure, String type) {
		super();
		IdQCM = idQCM;
		DateCreation = dateCreation;
		Dure = dure;
		Type = type;
	}
	public int getIdQCM() {
		return IdQCM;
	}
	public void setIdQCM(int idQCM) {
		IdQCM = idQCM;
	}
	public Date getDateCreation() {
		return DateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		DateCreation = dateCreation;
	}
	public int getDure() {
		return Dure;
	}
	public void setDure(int dure) {
		Dure = dure;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
	
	
	
	
}
