package com.java.inventory.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.java.inventory.dto.base.BaseModel;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ProductoMovimiento extends BaseModel implements Serializable {
	
	/**
	 * Serial Version.
	 */
	private static final long serialVersionUID = 8499437486795277204L;
	
	private Almacen almacen;
	private List<Articulo> articulos;
	private Usuario usuarioRecibio;
	private Usuario usuarioEntrego;
	private String datosPersonalEntrego;
	
	private Date fechaMovimiento;

}
