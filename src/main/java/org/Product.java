package org;

import java.util.Objects;

public class Product {
    private final String name;

    public Product(String name) {
        this.name = name;
    }

    public Product() {
        this.name = "";
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return this.name.equalsIgnoreCase(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name.toLowerCase());
    }

    @Override
    public String toString() {
        return "Product { name='" + name + '}';
    }

}
