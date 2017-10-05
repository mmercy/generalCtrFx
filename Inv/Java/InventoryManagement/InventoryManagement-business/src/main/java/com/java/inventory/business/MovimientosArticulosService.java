package com.java.inventory.business;

import java.util.List;

import com.java.inventory.business.def.IOperaciones;
import com.java.inventory.dto.Articulo;
import com.java.inventory.dto.ProductoMovimiento;

public class MovimientosArticulosService implements IOperaciones<ProductoMovimiento> {

	public void guardar(ProductoMovimiento productoMovimiento) {
		List<Articulo> articulos = productoMovimiento.getArticulos();
		
		if (articulos != null) {
			for (Articulo articulo : articulos) {
				//Actualizar las cantidades de articulos
				//articulo.get
			}
		}
		
	}

	public void borradoLogico(ProductoMovimiento productoMovimiento) {
		// TODO Auto-generated method stub
		
	}

	public List<ProductoMovimiento> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
