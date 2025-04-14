package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import entity.Cart;

public class CartTest {

    @Test
    public void testCartConstructorAndGetters() {
        Cart cart = new Cart(101, 1, 5, 2);

        assertEquals(101, cart.getCartId());
        assertEquals(1, cart.getCustomerId());
        assertEquals(5, cart.getProductId());
        assertEquals(2, cart.getQuantity());
    }
}
