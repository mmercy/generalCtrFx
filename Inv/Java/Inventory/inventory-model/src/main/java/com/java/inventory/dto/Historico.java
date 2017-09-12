package com.java.inventory.dto;

import java.util.Date;


public class Historico implements ObjetoAcceso  {
	
	private Articulo articulo;
	private Almacen origen;
	private Almacen destino;
	private Integer cantidad;
	private Date fechaMovimiento;
	private String quienRegistro;
	private Usuario usuarioRecibio;

}
