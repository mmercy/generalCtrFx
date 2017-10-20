package com.java.intentory.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.java.intentory.repository.common.AbstractBaseMysqlRepository;
import com.java.inventory.dto.TipoArticulo;

@Repository("tipoArticuloRepository")
public class TipoArticuloRepository extends AbstractBaseMysqlRepository<TipoArticulo> implements IOperaciones<TipoArticulo> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8350792917460183962L;
	
	private String tableName = "TipoArticulo";
	
	private Map<String, Object> getValues(TipoArticulo tipoArticulo){
		Map<String, Object> params = null;
		if (tipoArticulo != null) {
			params = tipoArticulo.getValues();
			/*tipoArticulo varchar(255),
		    descripcion varchar(255)*/
			
			params.put("tipoArticulo", tipoArticulo.getTipoArticulo());
		    params.put("descripcion", tipoArticulo.getDescripcion());
		}
		return params;
	}

	@Override
	public void guardar(TipoArticulo tipoArticulo) {
		if (tipoArticulo != null) {
			super.save(tableName, getValues(tipoArticulo));
		}
		
	}

	@Override
	public void borradoLogico(TipoArticulo objAcceso) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TipoArticulo> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
