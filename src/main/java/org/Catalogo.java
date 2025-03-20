package org;

import java.util.Date;
import java.util.HashMap;

public class Catalogo {
    public HashMap<Product, Integer> listaDePrecios;
    public Date fechaDeVigencia;

    public Catalogo(HashMap<Product, Integer> map, Date date) {
        this.listaDePrecios = map;
        this.fechaDeVigencia = date;
    }

    public Catalogo() {
        this.listaDePrecios = new HashMap<>();
        this.fechaDeVigencia = new Date();
    }
}
