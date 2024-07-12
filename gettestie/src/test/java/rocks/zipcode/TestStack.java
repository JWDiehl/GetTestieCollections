package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    private Stack<Object> stack;

    @org.junit.Before
    public void setUp() throws Exception {

        stack = new Stack<>();
        stack.push("I have entered the building");
        stack.push("I am in the building");
        stack.push("I am chilling in the building");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        stack.clear();
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void testStackPush() {
        stack.push("I have entered the building");
        assertEquals("I have entered the building", stack.peek());
        assertEquals(4, stack.size());
    }

    @Test
    public void testStackPop() {
        assertEquals("I am chilling in the building", stack.pop());
        assertEquals("I am in the building", stack.pop());
        assertEquals(1, stack.size());
    }

    @Test
    public void testStackPeek() {
        assertEquals("I am chilling in the building", stack.peek());
        assertEquals(3, stack.size());
    }

    @Test
    public void testStackIsEmpty() {
        assertFalse(stack.isEmpty());
        stack.clear();
        assertTrue(stack.isEmpty());
    }

}
