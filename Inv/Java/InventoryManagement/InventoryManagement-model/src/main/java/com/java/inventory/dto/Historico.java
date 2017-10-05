package com.java.inventory.dto;

import java.io.Serializable;
import java.util.Date;

import com.java.inventory.dto.base.BaseModel;


public class Historico extends BaseModel implements Serializable   {
	
	private Articulo articulo;
	private Almacen origen;
	private Almacen destino;
	private Integer cantidad;
	private Date fechaMovimiento;
	private String quienRegistro;
	private Usuario usuarioRecibio;

}
