package com.java.inventory.dto;

import java.io.Serializable;
import java.util.Date;

import com.java.inventory.dto.base.BaseModel;

public class Inventario extends BaseModel implements Serializable {
	private Almacen almacen;
	private Articulo articulo;
	private Date fechaIngreso;
	private Integer cantidad;

}
