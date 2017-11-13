package com.java.intentory.repository.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.java.inventory.dto.Usuario;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UsuarioRowMapper  implements RowMapper<Usuario> {

	@Override
	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		log.info("RowMapper Almacen sin implementar");
		return null;
	}

}
