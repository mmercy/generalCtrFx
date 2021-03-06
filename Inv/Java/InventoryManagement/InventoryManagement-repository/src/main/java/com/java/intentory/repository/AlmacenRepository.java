package com.java.intentory.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.java.intentory.repository.common.AbstractBaseMysqlRepository;
import com.java.intentory.repository.rowmapper.AlmacenRowMapper;
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

	public List<Almacen> listar(Object ... params) {
		String sql = "";
		return super.findByQuery(sql, new AlmacenRowMapper(), params);
	}
	
	private Map<String, Object> getValues(Almacen almacen){
		Map<String, Object> params = null;
		if (almacen != null) {
			params = almacen.getValues();
			/*nombre varchar(255),
		    descripcion varchar(255),
		    telefono1 varchar(20),
		    telefono2 varchar(20),
		    idDireccion int,*/
			
			params.put("nombre", almacen.getNombre());
		    params.put("descripcion", almacen.getDescripcion());
		    params.put("telefono1", almacen.getTelefono1());
		    params.put("telefono2", almacen.getTelefono2());
		    
		    if (almacen.getDireccion() != null) {
		    	params.put("idDireccion", almacen.getDireccion().getId());
			}
		    
		}
		return params;
	}


	public List<Almacen> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
