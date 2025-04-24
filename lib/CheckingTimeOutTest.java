package lib;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class CheckingTimeOutTest {
    @Test
    void testGetResponse() {
        CheckingTimeOut ct = new CheckingTimeOut();
        assertTimeout(Duration.ofMillis(200), () -> {
            ct.getResponse();
        });
    }

}
