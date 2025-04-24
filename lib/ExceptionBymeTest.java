package lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

public class ExceptionBymeTest {

    @Test
    void testDivide() {
        ExceptionByme ee = new ExceptionByme();
        assertThrows(IllegalArgumentException.class, () -> {
            ee.divide(10, 0);
        });

    }

    @Test
    void testDivide2() {
        ExceptionByme ee = new ExceptionByme();
        try {
            ee.divide(10, 0);
            fail("Failed because expected exception is not throwing");
        } catch (Exception e) {
            System.out.println("Hurray!!!!!!Expection is Generated");
        }
    }
}
