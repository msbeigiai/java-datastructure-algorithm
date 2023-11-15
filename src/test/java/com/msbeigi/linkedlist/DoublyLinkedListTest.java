package com.msbeigi.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    void testDLL_WhenCreated_ShouldReturnASingleNode() {
        DoublyLinkedList dll = new DoublyLinkedList(11);
        DoublyLinkedList.Node head = dll.getHead();
        DoublyLinkedList.Node tail = dll.getTail();
        int length = dll.getLength();

        assertEquals(1, length);
        assertEquals(head.value, 11);
        assertEquals(tail.value, 11);
        assertNull(head.next);
        assertNull(tail.next);
    }

    @Test
    void testAppend_WhenAddANodeAtTheEnd_ShouldReturnANodeAddedToTheEnd() {
        DoublyLinkedList dll = new DoublyLinkedList(11);
        dll.append(101);

        DoublyLinkedList.Node head = dll.getHead();
        DoublyLinkedList.Node tail = dll.getTail();

        int length = dll.getLength();

        assertEquals(2, length);
        assertEquals(head.value, 11);
        assertEquals(tail.value, 101);
        assertNotNull(head.next);
        assertNull(tail.next);
    }

    @Test
    void testRemoveLast_WhenRemoveLastNode_ShouldReturnANodeRemovedFromLast() {
        DoublyLinkedList dll = new DoublyLinkedList(11);
        dll.append(101);

        dll.removeLast();

        DoublyLinkedList.Node head = dll.getHead();
        DoublyLinkedList.Node tail = dll.getTail();

        int length = dll.getLength();

        assertEquals(1, length);
        assertEquals(head.value, 11);
        assertEquals(tail.value, 11);
        assertNull(head.next);
        assertNull(tail.next);
    }
}