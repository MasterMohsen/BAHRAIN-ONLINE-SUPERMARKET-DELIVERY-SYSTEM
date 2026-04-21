package example.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class AddressTest {

    // Helper: create a sample address
    private Address getSampleAddress() {
        return new Address("John Doe", "123 Main St", "Manama", "Bahrain", "+973 33333333");
    }

    // Test 1: getFullName should return correct name
    @Test
    public void testGetFullName() {
        Address a = getSampleAddress();
        assertEquals("John Doe", a.getFullName());
    }

    // Test 2: getStreet should return correct street
    @Test
    public void testGetStreet() {
        Address a = getSampleAddress();
        assertEquals("123 Main St", a.getStreet());
    }

    // Test 3: getCity should return correct city
    @Test
    public void testGetCity() {
        Address a = getSampleAddress();
        assertEquals("Manama", a.getCity());
    }

    // Test 4: getCountry should return correct country
    @Test
    public void testGetCountry() {
        Address a = getSampleAddress();
        assertEquals("Bahrain", a.getCountry());
    }

    // Test 5: getPhone should return correct phone
    @Test
    public void testGetPhone() {
        Address a = getSampleAddress();
        assertEquals("+973 33333333", a.getPhone());
    }

    // Test 6: toString should contain all fields
    @Test
    public void testToString() {
        Address a = getSampleAddress();
        String result = a.toString();
        assertTrue(result.contains("John Doe"));
        assertTrue(result.contains("123 Main St"));
        assertTrue(result.contains("Manama"));
        assertTrue(result.contains("Bahrain"));
        assertTrue(result.contains("+973 33333333"));
    }
}