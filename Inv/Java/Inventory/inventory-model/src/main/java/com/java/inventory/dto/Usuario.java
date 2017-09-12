package com.java.inventory.dto;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Usuario implements ObjetoAcceso  {
	/**
	 * Serial Version UID.
	 */
	private static final long serialVersionUID = -7921487754136597725L;
	
	private String identificador;
	private String nombres;
	private String paterno;
	private String materno;
	private String usuario;
	private String password;
	private Date fechaCreacion;
	private boolean activo;
	private TipoRol rol;
}
