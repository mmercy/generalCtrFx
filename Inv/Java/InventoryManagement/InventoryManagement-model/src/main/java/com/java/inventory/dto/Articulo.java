package com.java.inventory.dto;

import java.io.Serializable;

import com.java.inventory.dto.base.BaseModel;

import lombok.Data;

@Data
public class Articulo extends BaseModel implements Serializable  {
	
	
	/**
	 * Serial Version UID.
	 */
	private static final long serialVersionUID = -9165360251808520912L;
	
	
	private String nombre;
	private String descripcion;
	private String codigoBarra;
	
	private int cantidadDisponibles;
	private int cantidadTrasladada;
	
	private TipoArticulo tipoArticulo;


}
