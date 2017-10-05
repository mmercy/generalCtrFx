package com.java.intentory.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.java.intentory.repository.common.AbstractBaseMysqlRepository;
import com.java.inventory.dto.Almacen;

@Repository("almacenRepository")
public class AlmacenRepository extends AbstractBaseMysqlRepository<Almacen> implements IOperaciones <Almacen> {

	/**
	 * Serial Version UID.
	 */
	private static final long serialVersionUID = 6490914232051030343L;
	
	private String tableName = "Almacen";

	@Override
	public void guardar(Almacen almacen) {
		if (almacen != null ) {
			super.save(tableName, getValues(almacen));
		}
		
	}


	@Override
	public void borradoLogico(Almacen almacen) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Almacen> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Map<String, Object> getValues(Almacen almacen){
		Map<String, Object> params = null;
		if (almacen != null) {
			params = new HashMap<String, Object>();
			/*nombre varchar(255),
		    descripcion varchar(255),
		    telefono1 varchar(20),
		    telefono2 varchar(20),
		    fechaCreacion TIMESTAMP,
		    activo boolean,
		    idDireccion int,*/
			
			params.put("nombre", almacen.getNombre());
		    params.put("descripcion", almacen.getDescripcion());
		    params.put("fechaCreacion", almacen.getFechaCreacion());
		    params.put("activo", almacen.isActivo());
		    params.put("idDireccion", almacen.getDireccion().getId());
		}
		return params;
	}

}
