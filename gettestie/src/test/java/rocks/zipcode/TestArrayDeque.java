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
        deque.offerFirst(person1); // adding person 1 first
        deque.offerFirst(person2); //adding person 2 last
        assertEquals(person2, deque.peekFirst()); // person 1 should be at front

        //Test pollFirst
        assertEquals(person2, deque.pollFirst());

        //Test isEmpty
        assertFalse(deque.isEmpty());
    }

    @Test
    public void testArrayDeque2() {
        Deque<Person> deque = new ArrayDeque<>();

        //Test offerFirst and offerLast
        Person person1 = new Person("Jonny T", 1996);
        Person person2 = new Person("Hillary Swank", 1992);
        deque.offerFirst(person1); // adding person1 to the front
        deque.offerFirst(person2); //adding person 2 last

        //Test peekFirst and peekLast
        assertEquals(person2, deque.peekFirst()); // Person1 should be at the front
        assertEquals(person1, deque.peekLast()); // Person2 should be at the back

        //Test pollFirst and pollLast
        assertEquals(person2, deque.pollFirst()); // Remove and return person1 front
        assertEquals(person1, deque.pollLast()); // Remove and return person2 back

        //Test isEmpty
        assertTrue(deque.isEmpty()); // deque should be empty after removing all elements
    }
}
