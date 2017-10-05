package com.java.intentory.repository.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.java.intentory.repository.TipoRolRepository;
import com.java.inventory.dto.TipoRol;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestRepositoryConfig.class)
public class SpringbootJdbcBioApplicationTests {
	
	@Autowired
	private TipoRolRepository tipoRolRepository;
	
	@Test
	public void tipoRolTest(){
		TipoRol tipoRol = new TipoRol();
		tipoRol.setRol("Test");
		tipoRol.setDesription("Pruebaas");
		tipoRol.setFechaCreacion(new Date());
		tipoRolRepository.guardar(tipoRol);
	}

}
