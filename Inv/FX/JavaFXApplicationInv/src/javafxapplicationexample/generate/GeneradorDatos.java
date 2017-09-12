/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationexample.generate;

import com.java.inventory.dto.Articulo;
import com.java.inventory.dto.TipoArticulo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alutiiq-it
 */
public class GeneradorDatos {

    public List<TipoArticulo> getTiposArticulos() {
        List<TipoArticulo> tiposArticulo = new ArrayList<>();
        TipoArticulo tipoArticulo;

        for (int i = 0; i < 5; i++) {
            tipoArticulo = new TipoArticulo();
            tipoArticulo.setId(i);
            tipoArticulo.setTipoArticulo("Herramientas"+i);
            tipoArticulo.setDescripcion("Herramientas para...");
            tiposArticulo.add(tipoArticulo);
        }
        return tiposArticulo;
    }

    public List<Articulo> getArticulos() {
        List<Articulo> articulosRecuperados = new ArrayList<>();
        Articulo articulo;

        for (int i = 0; i < 10; i++) {
            articulo = new Articulo();
            articulo.setId(1);
            articulo.setNombre("Articulo");
            articulo.setDescripcion("Articulo sirve para XYZ");
            articulo.setCodigoBarra("LPDAE" + i);
            articulo.setUsuarioAlta("Admin");
            articulosRecuperados.add(articulo);
        }
        return articulosRecuperados;
    }

}
