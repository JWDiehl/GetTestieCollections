package rocks.zipcode;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.*;

public class TestLinkedList {

    @Test
    public void testLinkedList() {
        Queue<Address> queue = new LinkedList<>();

        //Test offer and poll
        //Test add and get
        Address address1 = new Address("88 Harold Court", "Montreux", "8883");
        Address address2 = new Address("22 Kineso Lane", "Montreal", "24-13");
        queue.offer(address1);
        queue.offer(address2);
        assertEquals(address1, queue.poll());

        //Test Peek
        assertEquals(address2, queue.peek());

        //Test isEmpty
        assertFalse(queue.isEmpty());
        }

    //Testing the remove() method
    @Test
    public void testLinkedList1() {
        Queue<Address> queue = new LinkedList<>();

        //Test offer and poll
        Address address1 = new Address("88 Harold Court", "Montreux", "8883");
        Address address2 = new Address("22 Kineso Lane", "Montreal", "24-13");
        queue.offer(address1);
        queue.offer(address2);
        assertEquals(address1, queue.poll()); // poll removes and returns the head of the queue

        //Test peek
        assertEquals(address2, queue.peek());

        //Test is Empty
        assertFalse(queue.isEmpty());

        //Test remove (further test for poll)
        assertEquals(address2, queue.remove()); // remove removes and returns head of the queue

        //Test peek when queue is empty
        assertNull(queue.peek());

        //Test poll when queue is empty
        assertNull(queue.poll());

    }

}


