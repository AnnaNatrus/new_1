package com.testunit;

import com.test.LinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {
    private LinkedList list = new LinkedList();

    @Test
    public void testSize() {
        list.addFirst(4);
        int rez = list.size();
        assertEquals(1, rez);
        list.removeFirst();
    }

    @Test
    public void testGetFirst() {
        list.addFirst(3);
        list.addFirst(4);
        assertEquals(4, list.getFirst());
        list.removeFirst();
        list.removeFirst();
    }

    @Test(expected = NullPointerException.class)
    public void testGetFirstEmpty() {
        assertEquals(7, list.getFirst());

    }

    @Test
    public void testGetLast() {
        list.addLast(4);
        list.addLast(3);
        assertEquals(3, list.getLast());
        list.removeLast();
        list.removeLast();

    }

    @Test(expected = NullPointerException.class)
    public void testGetLastEmpty() {
        assertEquals(7, list.getLast());

    }

    @Test
    public void testGetAt() {
        list.addFirst(1);
        list.addLast(3);
        list.addAt(2, 1);
        assertEquals(2, list.getAt(1));
        list.removeFirst();
        list.removeLast();
        list.removeLast();
    }

    @Test(expected = NullPointerException.class)
    public void testGetAtEmpty() {
        assertEquals(7, list.getAt(1));
    }

    @Test(expected = NullPointerException.class)
    public void testGetAtInvalid() {
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        assertEquals(1, list.getAt(8));
        list.removeLast();
        list.removeLast();
        list.removeLast();
    }

    @Test
    public void testAddFirst() {
        list.addFirst(6);
        assertEquals(6, list.getFirst());
        list.removeLast();
    }

    @Test
    public void testRemoveAt() {
        list.addAt(1, 0);
        list.addAt(2, 1);
        list.addAt(3, 1);
        list.removeAt(1);
        assertEquals(2, list.getAt(1));
        list.removeAt(1);
        list.removeAt(0);

    }

}


