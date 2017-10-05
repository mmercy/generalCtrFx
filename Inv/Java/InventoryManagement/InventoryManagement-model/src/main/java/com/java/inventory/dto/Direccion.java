package com.java.inventory.dto;

import java.io.Serializable;

import com.java.inventory.dto.base.BaseModel;

import lombok.Data;

@Data
public class Direccion extends BaseModel implements Serializable {

	/**
	 * Serial Version UID.
	 */
	private static final long serialVersionUID = -7919965109728565953L;
	
	
	private String numero;
	private String calle;
	private String colonia;
	private String municipio;
	private String estado;

}
