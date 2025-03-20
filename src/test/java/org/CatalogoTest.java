package org;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CatalogoTest {

    @Test
    public void catalogo_siempre_comienza_con_fecha_de_vigencia_y_lista_de_precios_001() {
        HashMap<Product, Integer> listaDePrecios = new HashMap<>();

        assertThrows(IllegalArgumentException.class, () -> new Catalogo(listaDePrecios, new Date()));
    }

    @Test
    public void catalogo_conoce_precio_de_producto_002() {
    }

    @Test
    public void catalogo_no_conoce_precio_de_producto_002() {
    }
}
