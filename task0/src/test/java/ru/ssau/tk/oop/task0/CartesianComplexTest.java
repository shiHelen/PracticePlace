package ru.ssau.tk.oop.task0;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CartesianComplexTest {

    @Test
    public void testRe() {
        Complex complex = new CartesianComplex(0,0);
        assertEquals(complex.re(),0);
        assertNotEquals(complex.re(), 1);
    }
}