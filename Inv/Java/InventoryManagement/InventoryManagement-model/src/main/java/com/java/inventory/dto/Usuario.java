package com.java.inventory.dto;

import java.io.Serializable;

import com.java.inventory.dto.base.BaseModel;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Usuario extends BaseModel implements Serializable   {
	/**
	 * Serial Version UID.
	 */
	private static final long serialVersionUID = -7921487754136597725L;
	
	private String nombres;
	private String paterno;
	private String materno;
	private String usuario;
	private String password;
	private TipoRol rol;
}
