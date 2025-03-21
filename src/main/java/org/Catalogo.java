package org;

import java.util.Date;
import java.util.HashMap;

public class Catalogo {
    public HashMap<Product, Double> listaDePrecios;
    public Date fechaDeVigencia;

    public Catalogo(HashMap<Product, Double> map, Date date) {
        if (map == null || date == null || map.isEmpty()) { throw new IllegalArgumentException(); }
        this.listaDePrecios = map;
        this.fechaDeVigencia = date;
    }

    public Double getPrice(Product product) {
        if (!this.listaDePrecios.containsKey(product)) { return null; }
        return this.listaDePrecios.get(product);
    }

    public Date getDate() {
        return this.fechaDeVigencia;
    }
}
