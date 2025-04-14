package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import entity.Product;

public class ProductTest {

    @Test
    public void testProductConstructorAndGetters() {
        Product product = new Product(1, "Laptop", 750.0, "High-end laptop", 10);

        assertEquals(1, product.getProductId());
        assertEquals("Laptop", product.getName());
        assertEquals(750.0, product.getPrice());
        assertEquals("High-end laptop", product.getDescription());
        assertEquals(10, product.getStock());
    }
}