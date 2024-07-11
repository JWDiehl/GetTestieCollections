package rocks.zipcode;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class TestTreeSet {

    @Test
    public void testTreeSet() {
        Set<Integer> treeSet = new TreeSet<>();

        //Test add and contains
        treeSet.add(88);
        treeSet.add(12);
        assertTrue(treeSet.contains(12));

        //Test remove
        treeSet.remove(12);
        assertFalse(treeSet.contains(12));

        //Test size
        assertEquals(1, treeSet.size());

    }
}
