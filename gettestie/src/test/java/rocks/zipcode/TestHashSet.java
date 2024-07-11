package rocks.zipcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class TestHashSet {

    @Test
    public void testHashSet() {
        Set<Person> set = new HashSet<>();

        //Hash set == methods "add" "contains" "remove" "isEmpty"

        //Test add and contains
        Person person1 = new Person("Jonny", 1996);
        Person person2 = new Person("Sarah", 1992);
        set.add(person1);
        set.add(person2);
        assertTrue(set.contains(person1));

        //Test remove
        set.remove(person1);
        assertFalse(set.contains(person1));

        //Test isEmpty
        assertEquals(1, set.size());
    }

    @Test
    public void testHashSet2() {
        Set<String> set = new HashSet<>();

        //Hash set == methods "add" "contains" "remove" "isEmpty"

        //Test add and contains
        set.add("peanut butter");
        assertTrue(set.contains("peanut butter"));

        //Test remove
        set.remove("peanut butter");
        assertFalse(set.contains("peanut butter"));

        //Test isEmpty
        assertTrue(set.isEmpty());
    }
}
