package org.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class LinkedListTest {

    Node<String> node=new Node("Data");
    Node<String> node2=new Node("Data2");
    LinkedList<String> linkedList=new LinkedList();

    @Test
    public void testNode(){
        // Testing Single Node
        assertEquals("Data",node.getData());
        assertNull(node.getNext());

        // Testing Two Nodes
        node.setNext(node2);
        assertEquals("Data2",node.getNext().getData());
    }

    @Test
    public void testAdd(){
        // Testing Linked List Size
        assertEquals(0,linkedList.getSize());
        linkedList.add("Data");
        assertEquals(1,linkedList.getSize());
        linkedList.add("Data2");
        assertEquals(2,linkedList.getSize());
    }

    @Test
    public void TestAddAtHead(){
        linkedList.addAtHead("Data");
        assertEquals(1,linkedList.getSize());
        linkedList.add("Data2");
        assertEquals(2,linkedList.getSize());
        linkedList.addAtHead("Data3");
        assertEquals(3,linkedList.getSize());
    }

    @Test
    public void TestDeleteAtHead(){
        linkedList.addAtHead("Data");
        assertEquals(1,linkedList.getSize());
        linkedList.deleteHead();
        assertEquals(0,linkedList.getSize());
    }
    @Test
    public void TestDelete(){
        linkedList.add("Data1");
        linkedList.add("Data2");
        linkedList.add("Data3");
        linkedList.add("Data4");
        linkedList.add("Data5");
        linkedList.add("Data6");
        linkedList.add("Data7");

        assertEquals(7,linkedList.getSize());
        linkedList.delete("Data1");
        assertEquals(6,linkedList.getSize());
        linkedList.delete("Data6");
        assertEquals(5,linkedList.getSize());
    }
}
