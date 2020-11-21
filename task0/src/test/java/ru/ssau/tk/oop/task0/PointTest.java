package ru.ssau.tk.oop.task0;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointTest {

    @Test
    public void testTestToString() {
        assertEquals(new Point(1, 2, 3).toString(), "[1.0, 2.0, 3.0]");
        assertEquals(new Point(1.1, 1.2, 1.3).toString(), "[1.1, 1.2, 1.3]");
        assertEquals(new Point(-1.1, 1.2, -1.3).toString(), "[-1.1, 1.2, -1.3]");
        assertEquals(new Point(2, 0, -20).toString(), "[2.0, 0.0, -20.0]");
    }
}