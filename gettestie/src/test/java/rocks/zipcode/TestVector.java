package rocks.zipcode;

import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.assertEquals;

public class TestVector {

    @Test
    public void testVector() {
        Vector<Person> vector = new Vector<>();

        //Test add and size
        Person person1 = new Person("Jonny T", 1996);
        Person person2 = new Person("Hillary Swank", 1992);
        vector.add(person1);
        vector.add(person2);
        assertEquals(2, vector.size());

        //Test remove
        vector.remove(person1);
        assertEquals(1, vector.size());

        //Test element at
        assertEquals(person2, vector.elementAt(0));
    }
}
