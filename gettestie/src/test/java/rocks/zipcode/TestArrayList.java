package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
}
