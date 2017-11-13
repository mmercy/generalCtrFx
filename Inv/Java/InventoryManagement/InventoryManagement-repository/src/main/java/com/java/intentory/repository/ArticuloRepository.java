package com.java.intentory.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.java.intentory.repository.common.AbstractBaseMysqlRepository;
import com.java.inventory.dto.Articulo;

@Repository("articuloRepository")
public class ArticuloRepository extends AbstractBaseMysqlRepository<Articulo> implements IOperaciones <Articulo> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5756811255681008100L;
	
	private String tableName = "Articulo";
	
	
	private Map<String, Object> getValues(Articulo articulo){
		Map<String, Object> params = null;
		if (articulo != null) {
			params = articulo.getValues();
			
			 /* nombre varchar(255),
			    descripcion varchar(255),
			    codigoBarra varchar(255),
			    idTipoArticulo int,*/
			params.put("nombre", articulo.getNombre());
			params.put("descripcion", articulo.getDescripcion());
			params.put("codigoBarra", articulo.getCodigoBarra());
			params.put("idTipoArticulo", articulo.getTipoArticulo().getId());
		}
		return params;
	}


	@Override
	public void guardar(Articulo articulo) {
		if (articulo != null) {
			super.save(tableName, getValues(articulo));
		}
		
	}


	@Override
	public void borradoLogico(Articulo objAcceso) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Articulo> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
