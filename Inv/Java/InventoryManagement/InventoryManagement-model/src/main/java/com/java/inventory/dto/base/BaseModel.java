package com.java.inventory.dto.base;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class BaseModel {

	private Integer id;
	private Boolean activo;
	private Date fechaCreacion;
	private Date fechaActualizacion;
	
	private Integer idUsuarioCreacion;
	private Integer idUsuarioActualizacion;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	public Integer getIdUsuarioCreacion() {
		return idUsuarioCreacion;
	}
	public void setIdUsuarioCreacion(Integer idUsuarioCreacion) {
		this.idUsuarioCreacion = idUsuarioCreacion;
	}
	public Integer getIdUsuarioActualizacion() {
		return idUsuarioActualizacion;
	}
	public void setIdUsuarioActualizacion(Integer idUsuarioActualizacion) {
		this.idUsuarioActualizacion = idUsuarioActualizacion;
	}
	
	public Map<String, Object> getValues () {
		Map<String, Object> params = null;
		if (id != null || idUsuarioActualizacion!= null || idUsuarioCreacion != null) {
			params = new HashMap<String, Object>();
			if (id != null) {
				params.put("id", id);
			}
			if (idUsuarioCreacion != null) {
				params.put("idUsuarioAlta", idUsuarioCreacion);
			}
			
			if (idUsuarioActualizacion != null) {
				params.put("idUsuarioActualiza", idUsuarioActualizacion);
			}
			
			if (fechaCreacion != null) {
				params.put("fechaCreacion", fechaCreacion);
			}
			if (fechaActualizacion != null) {
				params.put("fechaActualiza", fechaActualizacion);
			}
			if (activo != null) {
				params.put("activo", activo);
			}
		}
		
		return params;
	}
}
