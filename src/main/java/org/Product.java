package org;

import java.util.Objects;

public class Product {
    private static int idCounter = 0;
    private final int id;
    private final String name;
    private final int quantity;
    private final double price;

    public Product(String name, double price, int quantity) {
        this.id = generateUniqueId();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {
        this.id = generateUniqueId();
        this.name = "";
        this.price = 0.0;
        this.quantity = 0;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    private int generateUniqueId() {
        return idCounter++;
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
        return "Product {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

}
