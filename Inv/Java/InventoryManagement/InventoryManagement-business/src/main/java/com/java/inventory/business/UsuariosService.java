package com.java.inventory.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.inventory.business.def.IOperaciones;
import com.java.inventory.dto.Usuario;

@Service("usuariosService")
public class UsuariosService implements IOperaciones<Usuario>{

	public void guardar(Usuario objAcceso) {
		// TODO Auto-generated method stub
		
	}

	public void borradoLogico(Usuario objAcceso) {
		// TODO Auto-generated method stub
		
	}

	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
