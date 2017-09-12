package com.java.inventory.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Articulo implements ObjetoAcceso  {
	
	
	/**
	 * Serial Version UID.
	 */
	private static final long serialVersionUID = -9165360251808520912L;
	
	private Integer id;
	private String nombre;
	private String descripcion;
	private Date fechaCreacion;
	private String usuarioAlta;
	private String codigoBarra;
	
	private int cantidadDisponibles;
	private int cantidadTrasladada;
	
	private TipoArticulo tipoArticulo;


}
