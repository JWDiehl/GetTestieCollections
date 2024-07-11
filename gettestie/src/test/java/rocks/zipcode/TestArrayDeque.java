package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.Assert.*;

public class TestArrayDeque {

    @Test
    public void testArrayDeque() {
        Deque<Person> deque = new ArrayDeque<>();

        //Test offerFirst and offerLast
        Person person1 = new Person("Jonny T", 1996);
        Person person2 = new Person("Hillary Swank", 1992);
        deque.offerFirst(person1);
        deque.offerFirst(person2);
        assertEquals(person1, deque.peekFirst());

        //Test pollFirst
        assertEquals(person1, deque.pollFirst());

        //Test isEmpty
        assertFalse(deque.isEmpty());
    }
}
