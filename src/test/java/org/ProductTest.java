package org;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void product_can_be_created_001() {
        Product aProduct = new Product();
        assertNotNull(aProduct);
    }

    @Test
    public void products_are_distinct_002() {
        Product product1 = new Product("Item1");
        Product product2 = new Product("Item2");

        assertNotEquals(product1, product2);
    }
}
