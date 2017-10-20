package com.java.intentory.repository;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.java.intentory.repository.common.AbstractBaseMysqlRepository;
import com.java.inventory.dto.TipoRol;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository("tipoRolRepository")
public class TipoRolRepository extends AbstractBaseMysqlRepository<TipoRol> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -961021752813285413L;
	
	private String  tbTipoRol = "TipoRol";
	
	public void guardar (TipoRol tipoRol) {
		if (tipoRol != null) {
			int result = super.save(tbTipoRol, getValues(tipoRol));
			log.info("Resultado insercion: " + result);
		}
		
	}
	
	
	private Map<String, Object> getValues(TipoRol tipoRol){
		Map<String, Object> params = null;
		if (tipoRol != null) {
			params = tipoRol.getValues();
			/*rol varchar(255),
		    descripcion varchar(255),
		    fechaCreacion TIMESTAMP,*/
			
			params.put("rol", tipoRol.getRol());
		    params.put("descripcion", tipoRol.getDesription());
		}
		return params;
	}

}
