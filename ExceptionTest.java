package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import exception.CustomerNotFoundException;
import exception.ProductNotFoundException;
import exception.OrderNotFoundException;

public class ExceptionTest {

    @Test
    public void testCustomerNotFoundException() {
        Exception exception = assertThrows(CustomerNotFoundException.class, () -> {
            throw new CustomerNotFoundException("Customer not found");
        });
        assertEquals("Customer not found", exception.getMessage());
    }

    @Test
    public void testProductNotFoundException() {
        Exception exception = assertThrows(ProductNotFoundException.class, () -> {
            throw new ProductNotFoundException("Product not found");
        });
        assertEquals("Product not found", exception.getMessage());
    }

    @Test
    public void testOrderNotFoundException() {
        Exception exception = assertThrows(OrderNotFoundException.class, () -> {
            throw new OrderNotFoundException("Order not found");
        });
        assertEquals("Order not found", exception.getMessage());
    }
}
