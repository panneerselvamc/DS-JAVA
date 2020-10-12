package org.stack.impl;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StackTest {

    @Test
    public void testElement(){
        Element<String> element=new Element<>("1",null);
        Element<String> element2=new Element<>("2",element);
        assertEquals("1",element.getData());
        assertNull(element2.getNext().getNext());
    }

    @Test
    public void testPush() throws Exception {
        Stack<String> stack=new Stack<>();
        stack.push("1");
        assertEquals("1",stack.peek());
        assertEquals(1,stack.getSize());
    }

    @Test
    public void testPop() throws Exception {
        Stack<String> stack=new Stack<>();
        stack.push("1");
        assertEquals("1",stack.pop());
        assertEquals(0,stack.getSize());
    }

    @Test
    public void testIsEmpty() throws Exception {
        Stack<String> stack=new Stack<>();
        stack.push("1");
        assertEquals(false,stack.isEmpty());
        stack.pop();
        assertEquals(true,stack.isEmpty());
    }
    @Test
    public void testIsFull() throws Exception {
        Stack<String> stack=new Stack<>();
        stack.push("1");
        assertEquals(false,stack.isFull());
    }
}
