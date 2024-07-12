package rocks.zipcode;

import org.junit.Test;

import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestPriorityQueue {

    @Test
    public void testPriorityQueue() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(3);
        pq.offer(2);
        pq.offer(1);

        assertEquals(3, pq.size());
        assertEquals(1, pq.peek().intValue());
        assertEquals(1, pq.poll().intValue());
        assertEquals(2, pq.peek().intValue());
        assertEquals(2, pq.poll().intValue());
        assertEquals(3, pq.peek().intValue());
        assertEquals(3, pq.poll().intValue());
        assertTrue(pq.isEmpty());
    }
}
