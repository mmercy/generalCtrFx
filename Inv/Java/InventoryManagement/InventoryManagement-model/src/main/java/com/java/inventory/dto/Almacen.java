package com.java.inventory.dto;

import java.io.Serializable;
import java.util.List;

import com.java.inventory.dto.base.BaseModel;


public class Almacen extends BaseModel implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4354766214838737780L;
	

	private String nombre;
	private String descripcion;
	private String telefono1;
	private String telefono2;
	private Direccion direccion;
	private List<Articulo> articulos;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTelefono1() {
		return telefono1;
	}
	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}
	public String getTelefono2() {
		return telefono2;
	}
	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}
	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	
}
