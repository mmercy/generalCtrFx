package com.java.intentory.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.java.intentory.repository.common.AbstractBaseMysqlRepository;
import com.java.inventory.dto.Direccion;

@Repository("direccionRepository")
public class DireccionRepository extends AbstractBaseMysqlRepository<Direccion> implements IOperaciones<Direccion> {

	/**
	 * Serial Version UID.
	 */
	private static final long serialVersionUID = 9223197522480208574L;
	
	private String tableName = "Direccion";
	
	@Override
	public void guardar(Direccion direccion) {
		if (direccion != null) {
			super.save(tableName, getValues(direccion));
		}
		
	}

	@Override
	public void borradoLogico(Direccion direccion) {
		// TODO Auto-generated method stub
		
	}
	
	private Map<String, Object> getValues(Direccion direccion){
		Map<String, Object> params = null;
		if (direccion != null) {
			params = direccion.getValues();
			
			 /* numero varchar(100),
    calle varchar(255),
    colonia varchar(255),
    municipio varchar(255),
    estado varchar(255),*/
			params.put("numero", direccion.getNumero());
			params.put("calle", direccion.getCalle());
			params.put("colonia", direccion.getColonia());
			params.put("municipio", direccion.getMunicipio());
			params.put("estado", direccion.getEstado());
		}
		return params;
	}

	@Override
	public List<Direccion> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
