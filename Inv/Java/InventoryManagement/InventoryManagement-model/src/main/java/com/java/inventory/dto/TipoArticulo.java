package com.java.inventory.dto;

import java.io.Serializable;

import com.java.inventory.dto.base.BaseModel;


public class TipoArticulo extends BaseModel implements Serializable  {
	/**
	 * Serial Version UID.
	 */
	private static final long serialVersionUID = -5025809467525568023L;

	private String tipoArticulo;
	private String descripcion;

	public String getTipoArticulo() {
		return tipoArticulo;
	}
	public void setTipoArticulo(String tipoArticulo) {
		this.tipoArticulo = tipoArticulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
