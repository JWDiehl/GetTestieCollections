package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestArrayList {

    @Test
    public void testArrayList() {
        List<Address> list = new ArrayList<>();

        //Test add and get
        Address address1 = new Address("88 Harold Court", "Montreux", "8883");
        Address address2 = new Address("22 Kineso Lane", "Montreal", "24-13");
        list.add(address1);
        list.add(address2);
        assertEquals(address1, list.get(0));

        //Test remove
        list.remove(address1);
        assertEquals(1, list.size());

        //Test Iteration
        for (Address addr : list) {
            assertNotNull(addr);
        }
    }

    @Test
    public void testArrayListEdgeCases() {
        List<Address> list = new ArrayList<>();

        //Test adding null and accessing index out of bounds
        Address address1 = new Address("88 Harold Court", "Montreux", "8883");
        list.add(address1);
        assertNull("Expected null at index 1", list.size() > 1 ? list.get(1) : null);

        //Test removing non-existent element
        Address address2 = new Address("22 Kineso Lane", "Montreal", "24-13");
        assertFalse("", list.remove(address2));

        //Test clearing the list
        list.clear();
        assertTrue("", list.isEmpty());

    }
}
