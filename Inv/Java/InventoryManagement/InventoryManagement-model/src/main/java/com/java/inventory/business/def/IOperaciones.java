package com.java.inventory.business.def;

import java.util.List;

import com.java.inventory.dto.ObjetoAcceso;

public interface IOperaciones <T extends ObjetoAcceso> {

	void guardar (T objAcceso);
	void borradoLogico (T objAcceso);
	List<T> listar();
}
