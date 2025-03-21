package org;

import java.util.LinkedList;
import java.util.List;

public class Cart {
    private final List<Product> products = new LinkedList<>();

    public boolean isEmpty() {
        return products.isEmpty();
    }

    public void add(Product aProduct) {
        products.add(aProduct);
    }

    public void remove(Product aProduct) {
        products.remove(aProduct);
    }

    public int size() {
        return products.size();
    }

    public double totalPrice(Catalogo catalogo) {
        double totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += catalogo.getPrice(product);
        }
        return totalPrice;
    }

    public void clear() {
        products.clear();
    }

    public List<Product> getItems() {
        return products;
    }
}
