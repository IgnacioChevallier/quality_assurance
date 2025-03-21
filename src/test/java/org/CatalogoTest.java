package org;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class CatalogoTest {

    @Test
    public void catalogo_siempre_comienza_con_fecha_de_vigencia_y_lista_de_precios_001() {
        HashMap<Product, Double> listaDePrecios = new HashMap<>();

        assertThrows(IllegalArgumentException.class, () -> new Catalogo(listaDePrecios, new Date()));
    }

    @Test
    public void catalogo_conoce_precio_de_producto_002() {
        HashMap<Product, Double> listaDePrecios = new HashMap<>();
        listaDePrecios.put(getProductArroz(), 10.0);
        listaDePrecios.put(getProductFideo(), 20.0);
        Catalogo catalogo = new Catalogo(listaDePrecios, new Date());

        assertEquals(10.0, catalogo.getPrice(getProductArroz()));
        assertEquals(20.0, catalogo.getPrice(getProductFideo()));
    }

    @Test
    public void catalogo_no_conoce_precio_de_producto_002() {
        HashMap<Product, Double> listaDePrecios = new HashMap<>();
        listaDePrecios.put(getProductArroz(), 10.0);
        listaDePrecios.put(getProductFideo(), 20.0);
        Catalogo catalogo = new Catalogo(listaDePrecios, new Date());

        assertNull(catalogo.getPrice(getProductManzana()));
    }

    @Test
    public void catalogo_conoce_fecha_de_vigencia_003() {
        Date fechaDeVigencia = new Date();
        HashMap<Product, Double> listaDePrecios = new HashMap<>();
        listaDePrecios.put(getProductArroz(), 10.0);
        Catalogo catalogo = new Catalogo(listaDePrecios, fechaDeVigencia);
        assertInstanceOf(Date.class, catalogo.getDate());
    }

    private static Product getProductManzana() {
        return new Product("Manzana");
    }

    private static Product getProductFideo() {
        return new Product("Fideos");
    }

    private static Product getProductArroz() {
        return new Product("Arroz");
    }
}
