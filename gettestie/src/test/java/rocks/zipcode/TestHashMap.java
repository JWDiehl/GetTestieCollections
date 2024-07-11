package rocks.zipcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TestHashMap {

    @Test
    public void testHashMap() {
        Map<String, Integer> map = new HashMap<>();

        //HashMap == methods such as "put" "get" "containsKey" "remove" "size"

        //Testing Put and Get
        map.put("one", 1);
        assertEquals(Integer.valueOf(1), map.get("one"));

        //Testing ContainsKey
        assertTrue(map.containsKey("one"));

        //Testing remove
        map.remove("one");
        assertFalse(map.containsKey("one"));

        //Test size
        assertEquals(0, map.size());
    }

    @Test
    public void testHashMap2() {
        Map<String, Integer> map = new HashMap<>();

        //HashMap == methods such as "put" "get" "containsKey" "remove" "size"

        //Testing Put and Get
        map.put("eighty-eight", 88);
        assertEquals(Integer.valueOf(88), map.get("eighty-eight"));

        //Testing ContainsKey
        assertTrue(map.containsKey("eighty-eight"));

        //Testing remove
        map.remove("eighty-eight");
        assertFalse(map.containsKey("eighty-eight"));

        //Test size
        assertEquals(0, map.size());
    }

}
