package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import entity.Order;

public class OrderTest {

    @Test
    public void testOrderConstructorAndGetters() {
        Order order = new Order(201, 1, "2025-04-11", 500.0, "Delhi");

        assertEquals(201, order.getOrderId());
        assertEquals(1, order.getCustomerId());
        assertEquals("2025-04-11", order.getOrderDate());
        assertEquals(500.0, order.getTotalPrice());
        assertEquals("Delhi", order.getShippingAddress());
    }
}