package rocks.zipcode;

import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestTreeMap {

    @Test
    public void testTreeMap() {
        Map<String, Address> treeMap = new TreeMap<>();

        //Test put and get
        Address address1 = new Address("88 Harold Court", "Montreux", "8883");
        Address address2 = new Address("22 Kineso Lane", "Montreal", "24-13");
        treeMap.put("address1", address1);
        treeMap.put("address2", address2);
        assertEquals(address1, treeMap.get("address1"));


        //Test remove
        treeMap.remove("address1");
        assertNull(treeMap.get("address1"));

        //Test size
        assertEquals(1, treeMap.size());
    }
}
