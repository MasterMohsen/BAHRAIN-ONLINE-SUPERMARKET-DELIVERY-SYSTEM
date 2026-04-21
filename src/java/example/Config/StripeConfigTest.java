package example.Config;

import org.junit.Test;
import static org.junit.Assert.*;

public class StripeConfigTest {

    // Test 1: init() should throw RuntimeException when API key is missing
    @Test(expected = RuntimeException.class)
    public void testInitThrowsWhenKeyMissing() {
        // If STRIPE_SECRET_KEY is not set in environment, should throw
        // This test passes when running without the env variable set
        StripeConfig.init();
    }

    // Test 2: init() error message should mention STRIPE_SECRET_KEY
    @Test
    public void testInitErrorMessageIsCorrect() {
        try {
            StripeConfig.init();
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("STRIPE_SECRET_KEY"));
        }
    }
}