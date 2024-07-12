package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestComparablePerson {

    @Test
    public void testComparable() {
        Person person1 = new Person("Jonathan", 1996);
        Person person2 = new Person("Anekka", 1995);
        Person person3 = new Person("Squiggs", 2024);

        //Testing compareTo method for age comparison
        assertTrue(person1.compareTo(person2) > 0);
        assertTrue(person2.compareTo(person3) < 0);
        assertEquals(0, person1.compareTo(person1));

    }
}
