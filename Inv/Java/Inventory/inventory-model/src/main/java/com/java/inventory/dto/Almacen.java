package com.java.inventory.dto;

import java.util.List;

public class Almacen implements ObjetoAcceso {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4354766214838737780L;
	
	private Integer id;
	private String nombre;
	private String direccion;
	private String telefono;
	private List<Articulo> articulos;
	
}
