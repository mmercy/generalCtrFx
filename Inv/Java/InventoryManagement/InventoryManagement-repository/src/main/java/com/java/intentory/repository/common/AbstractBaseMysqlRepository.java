package com.java.intentory.repository.common;

import java.io.Serializable;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

/**
 * The Class AbstractBaseOracleBioRepository.
 * @param <T> the generic type
 */
public abstract class AbstractBaseMysqlRepository<T extends Serializable> implements Serializable {

	/**
	 * Serial Version UID.
	 */
	private static final long serialVersionUID = -7102076256712453084L;

	/**
	 * Jdbc template generico.
	 */
	@Autowired
	@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplateBase;

	/**
	 * Constructor por defecto.
	 */
	public AbstractBaseMysqlRepository() {
		super();
	}

	/**
	 * Obtiene el jdbcTemplateBase.
	 * @return regresa el jdbcTemplateBase.
	 */
	public final JdbcTemplate getJdbcTemplateBase() {
		return jdbcTemplateBase;
	}
	
	
	/**
	 * Metodo encargado de guardar un registro en la base de datos. Guarda el
	 * registro sin generar el identificador, este debe ser mandado en el mapa
	 * de parametros.
	 *
	 * @param tableName
	 *            Nombre de la tabla donde se guardara el registro.
	 * @param params
	 *            Mapa con las relaciones columna - valor.
	 * @return Regresa el numero de registros insertados.
	 */
	protected final int save(final String tableName,
			final Map<String, Object> params) {
		SimpleJdbcInsert jdbcInsertNyV = new SimpleJdbcInsert(
				this.jdbcTemplateBase.getDataSource());

		return jdbcInsertNyV.withTableName(tableName).execute(params);
	}
}
