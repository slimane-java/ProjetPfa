package com.emsi.Entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;


public class TpEtudientId implements Serializable{
	@EmbeddedId
	private int IdTp;
	private int IdUser;

	
}
