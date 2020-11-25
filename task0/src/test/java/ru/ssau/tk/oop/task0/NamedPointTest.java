package ru.ssau.tk.oop.task0;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {
    NamedPoint test = new NamedPoint();

    @Test
    public void testSetName() {
        test.setName("1");
        assertEquals(test.getName(), "1");
        test.setName("B");
        assertEquals(test.getName(), "B");
        test.setName("c");
        assertEquals(test.getName(), "c");
    }

    @Test
    public void testGetName() {
        NamedPoint testTo = new NamedPoint(1, 2, 3, "myPoint");
        assertEquals(test.getName(), "Origin");
        assertEquals(testTo.getName(), "myPoint");
    }
}
