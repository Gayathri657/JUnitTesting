package lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    ShoppingCart s;

    @BeforeEach
    void setup() {
        System.out.println("Setting up the cart......");
        s = new ShoppingCart();
        s.addItem("Bag", 100.0);
        s.addItem("Apple", 20.0);
    }

    @AfterEach
    void destroy() {
        s.clearCart();
        System.out.println("Cleared the cart.....");
    }

    @Test
    void testAddItem() {
        s.addItem("Apple", 20.0);
        s.addItem("lays", 10.0);
        System.out.println(s);
        assertEquals(150.0, s.getTotalPrice(), 0.01);
    }

    @Test
    void testClearCart() {
        s.clearCart();
        assertEquals(0.0, s.getTotalPrice(), 0.01);
    }

    @Test
    void testGetTotalPrice() {
        assertEquals(120.0, s.getTotalPrice(), 0.01);
    }

    @Test
    void testRemoveItem() {
        assertThrows(NullPointerException.class, () -> {
            s.removeItem("Grapes");
        });
        s.removeItem("Apple");
        System.out.println(s);
        assertEquals(100.0, s.getTotalPrice(), 0.01);

    }
}
