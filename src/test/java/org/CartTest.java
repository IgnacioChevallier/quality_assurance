package org;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest {

    @Test
    public void cart_exists_when_created_001() {
        Cart aCart = new Cart();

        assertNotNull(aCart);
    }

    @Test
    public void cart_is_empty_when_created_002() {
        Cart aCart = new Cart();

        assertTrue(aCart.isEmpty());
    }

    @Test
    public void cart_is_not_empty_when_items_added_003() {
        Cart aCart = new Cart();
        Product aProduct = new Product();
        aCart.add(aProduct);

        assertFalse(aCart.isEmpty());
    }

    @Test
    public void cart_is_empty_when_items_added_and_removed_004() {
        Cart aCart = new Cart();
        Product aProduct = new Product();

        aCart.add(aProduct);
        aCart.remove(aProduct);

        assertTrue(aCart.isEmpty());
    }

    @Test
    public void cart_can_store_multiple_items_005() {
        Cart aCart = new Cart();
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        aCart.add(product1);
        aCart.add(product2);
        aCart.add(product3);

        assertEquals(3, aCart.size());
    }

    @Test
    public void cart_can_remove_multiple_items_006() {
        Cart aCart = new Cart();
        Product product1 = new Product();
        Product product2 = new Product();

        aCart.add(product1);
        aCart.add(product2);

        aCart.remove(product1);
        aCart.remove(product2);

        assertTrue(aCart.isEmpty());
    }

    @Test
    public void cart_can_return_full_price_007() {
        Cart aCart = new Cart();
        Product product1 = getProductExample();
        HashMap<Product, Double> listaDePrecios = new HashMap<>();
        listaDePrecios.put(product1, 20.0);
        Catalogo catalogo = new Catalogo(listaDePrecios, new Date());

        aCart.add(product1);
        aCart.add(product1);

        assertEquals(40.0, aCart.totalPrice(catalogo));
    }

    private static Product getProductExample() {
        return new Product("Item1");
    }

    @Test
    public void cart_can_return_empty_price_008() {
        Cart aCart = new Cart();
        Product product1 = getProductExample();
        HashMap<Product, Double> listaDePrecios = new HashMap<>();
        listaDePrecios.put(product1, 10.0);
        Catalogo catalogo = new Catalogo(listaDePrecios, new Date());


        assertEquals(0.0, aCart.totalPrice(catalogo));
    }

    @Test
    public void cart_can_return_price_of_single_item_009() {
        Cart aCart = new Cart();
        Product product1 = getProductExample();
        HashMap<Product, Double> listaDePrecios = new HashMap<>();
        listaDePrecios.put(product1, 10.0);
        Catalogo catalogo = new Catalogo(listaDePrecios, new Date());

        aCart.add(product1);

        assertEquals(10.0, aCart.totalPrice(catalogo));
    }

    @Test
    public void cart_can_clear_items_010() {
        Cart aCart = new Cart();
        Product product1 = getProductExample();
        Product product2 = getProductExample();

        aCart.add(product1);
        aCart.add(product2);

        assertEquals(2, aCart.size());
        aCart.clear();

        assertTrue(aCart.isEmpty());
    }

    @Test
    public void cart_can_return_items_011() {
        Cart aCart = new Cart();
        Product product1 = getProductExample();
        Product product2 = getProductExample();
        aCart.add(product1);
        aCart.add(product2);

        List<Product> products = aCart.getItems();

        assertTrue(products.contains(product1) && products.contains(product2));
    }
}
