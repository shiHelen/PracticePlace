package ru.ssau.tk.oop.task0;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MatricesTest {

    @Test
    public void testSumMatrix() {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setAt(0, 0, 1);
        matrix1.setAt(0, 1, 2);
        matrix1.setAt(1, 0, 3);
        matrix1.setAt(1, 1, 4);

        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setAt(0, 0, -1);
        matrix2.setAt(0, 1, -2);
        matrix2.setAt(1, 0, -3);
        matrix2.setAt(1, 1, -4);

        Matrix sumMatrix = Matrices.sumMatrix(matrix1, matrix2);
        assertEquals(sumMatrix.getAt(0, 0), 0);
        assertEquals(sumMatrix.getAt(0, 1), 0);
        assertEquals(sumMatrix.getAt(1, 0), 0);
        assertEquals(sumMatrix.getAt(1, 1), 0);

        assertNull(Matrices.sumMatrix(matrix1, new Matrix(5, 5)));
    }

    @Test
    public void testMultiplyMatrix() {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setAt(0, 0, 1);
        matrix1.setAt(0, 1, 2);
        matrix1.setAt(1, 0, 3);
        matrix1.setAt(1, 1, 4);

        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setAt(0, 0, 1);
        matrix2.setAt(0, 1, 2);
        matrix2.setAt(1, 0, 3);
        matrix2.setAt(1, 1, 4);

        Matrix multMatrix = Matrices.multiplyMatrix(matrix1, matrix2);
        assertEquals(multMatrix.getAt(0, 0), 7);
        assertEquals(multMatrix.getAt(0, 1), 10);
        assertEquals(multMatrix.getAt(1, 0), 15);
        assertEquals(multMatrix.getAt(1, 1), 22);

        assertNull(Matrices.sumMatrix(matrix1, new Matrix(5, 5)));
    }

    @Test
    public void testMultiplyByConstMatrix() {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setAt(0, 0, 1);
        matrix1.setAt(0, 1, 2);
        matrix1.setAt(1, 0, 3);
        matrix1.setAt(1, 1, 4);

        Matrix resMatrix = Matrices.multiplyByConstMatrix(matrix1, 5);
        assertEquals(resMatrix.getAt(0, 0), 5);
        assertEquals(resMatrix.getAt(0, 1), 10);
        assertEquals(resMatrix.getAt(1, 0), 15);
        assertEquals(resMatrix.getAt(1, 1), 20);
        Matrix res2Matrix = Matrices.multiplyByConstMatrix(matrix1, -3);
        assertEquals(res2Matrix.getAt(0, 0), -3);
        assertEquals(res2Matrix.getAt(0, 1), -6);
        assertEquals(res2Matrix.getAt(1, 0), -9);
        assertEquals(res2Matrix.getAt(1, 1), -12);
    }
}