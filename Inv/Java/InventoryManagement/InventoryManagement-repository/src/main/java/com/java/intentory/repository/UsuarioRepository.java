package com.java.intentory.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.java.intentory.repository.common.AbstractBaseMysqlRepository;
import com.java.inventory.dto.Usuario;

@Repository("usuarioRepository")
public class UsuarioRepository extends AbstractBaseMysqlRepository<Usuario> implements IOperaciones<Usuario> {

	/**
	 * Serial Version UD.
	 */
	private static final long serialVersionUID = -457237572890628366L;

	private String tableName = "Usuario";
	


	@Override
	public void guardar(Usuario usuario) {
		if (usuario != null) {
			super.save(tableName, getValues(usuario));
		}
		
	}

	@Override
	public void borradoLogico(Usuario objAcceso) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Map<String, Object> getValues(Usuario usuario){
		Map<String, Object> params = null;
		if (usuario != null) {
			params = usuario.getValues();
			/* nombres varchar(255),
			    paterno varchar(255),
			    materno varchar(255),
			    usuario varchar(255),
			    pass varchar(255),
			    idTipoRol int,
			 * */
			
			
		    params.put("nombres", usuario.getNombres());
		    params.put("paterno", usuario.getPaterno());
		    params.put("materno", usuario.getMaterno());
		    params.put("usuario", usuario.getUsuario());
		    params.put("pass", usuario.getPassword());
		    if ( usuario.getRol() != null) {
		    	params.put("idTipoRol", usuario.getRol().getId());
			}
		    
		}
		return params;
	}
}
