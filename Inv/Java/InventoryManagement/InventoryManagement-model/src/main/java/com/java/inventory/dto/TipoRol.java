package com.java.inventory.dto;

import java.io.Serializable;

import com.java.inventory.dto.base.BaseModel;


public class TipoRol extends BaseModel implements Serializable  {
	/**
	 * Serial Version UID.
	 */
	private static final long serialVersionUID = 2463645733369913330L;
	
	private String rol;
	private String desription;
	

	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getDesription() {
		return desription;
	}
	public void setDesription(String desription) {
		this.desription = desription;
	}


}
