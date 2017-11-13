package com.java.inventory.business.def;

import java.util.List;

import com.java.inventory.dto.base.BaseModel;

public interface IOperaciones <T extends BaseModel> {

	void guardar (T objAcceso);
	void borradoLogico (T objAcceso);
	List<T> listar();
}
