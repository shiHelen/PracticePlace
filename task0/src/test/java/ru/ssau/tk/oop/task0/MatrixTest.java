package ru.ssau.tk.oop.task0;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MatrixTest {
    Matrix myMatrix1 = new Matrix(3, 2);
    Matrix myMatrix2 = new Matrix(5, 1);
    Matrix myMatrix3 = new Matrix(7, 4);

    @Test
    public void testGetN() {
        assertEquals(myMatrix1.getN(), 3);
        assertEquals(myMatrix2.getN(), 5);
        assertEquals(myMatrix3.getN(), 7);
    }

    @Test
    public void testGetM() {
        assertEquals(myMatrix1.getM(), 2);
        assertEquals(myMatrix2.getM(), 1);
        assertEquals(myMatrix3.getM(), 4);
    }

    @Test
    public void testSetAtAndGetAt() {
        myMatrix1.setAt(0, 0, 10);
        myMatrix1.setAt(2, 1, -3);
        assertEquals(myMatrix1.getAt(0, 0), 10);
        assertEquals(myMatrix1.getAt(2, 1), -3);

        myMatrix2.setAt(3, 0, 54);
        myMatrix2.setAt(2, 0, -27);
        assertEquals(myMatrix2.getAt(3, 0), 54);
        assertEquals(myMatrix2.getAt(2, 0), -27);

        myMatrix3.setAt(1, 2, -11);
        myMatrix3.setAt(3, 1, 0);
        assertEquals(myMatrix3.getAt(1, 2), -11);
        assertEquals(myMatrix3.getAt(3, 1), 0);
    }
}
