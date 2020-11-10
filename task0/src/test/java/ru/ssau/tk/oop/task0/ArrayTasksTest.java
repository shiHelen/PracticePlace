package ru.ssau.tk.oop.task0;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTasksTest {

    @Test
    public void testArrayLength() {
        ArrayTasks check = new ArrayTasks();
        int[] newArray = check.arrayLength(3);
        assertEquals(newArray.length, 3);
        int[] othArray = check.arrayLength(5);
        assertEquals(othArray.length, 5);
        assertNotEquals(othArray.length, 4);
    }

    @Test
    public void testGetArithmeticProgression() {
        assertEquals(ArrayTasks.getArithmeticProgression(2, 5, -2), new double[]{5, 3});
        assertEquals(ArrayTasks.getArithmeticProgression(5, -1, 2), new double[]{-1, 1, 3, 5, 7});
        assertEquals(ArrayTasks.getArithmeticProgression(3, 0, 4), new double[]{0, 4, 8});
    }

    @Test
    public void testGenerateOnesArray() {
        ArrayTasks check = new ArrayTasks();
        int[] newArray = check.generateOnesArray(5);
        assertEquals(newArray[0], 2);
        assertEquals(newArray[1], 1);
        assertEquals(newArray[2], 1);
        assertEquals(newArray[3], 1);
        assertEquals(newArray[4], 2);
    }

    @Test
    public void testGenerateArray() {
        ArrayTasks check = new ArrayTasks();
        int[] newArray = check.generateArray(5);
        assertEquals(newArray[0], 1);
        assertEquals(newArray[1], 3);
        assertEquals(newArray[2], 5);
        assertEquals(newArray[3], 7);
        assertEquals(newArray[4], 9);
    }

    @Test
    public void testGenerateArrayDecreasingEven() {
        ArrayTasks check = new ArrayTasks();
        int[] newArray = check.generateArrayDecreasingEven(5);
        assertEquals(newArray[0], 10);
        assertEquals(newArray[1], 8);
        assertEquals(newArray[2], 6);
        assertEquals(newArray[3], 4);
        assertEquals(newArray[4], 2);
    }

    @Test
    public void testGenerateArrayFibonacciNumbers() {
        ArrayTasks check = new ArrayTasks();
        int[] newArray = check.generateArrayFibonacciNumbers(6);
        assertEquals(newArray[0], 1);
        assertEquals(newArray[1], 1);
        assertEquals(newArray[2], 2);
        assertEquals(newArray[3], 3);
        assertEquals(newArray[4], 5);
        assertEquals(newArray[5], 8);
    }

    @Test
    public void testGenerateArraySqrIndex() {
        ArrayTasks check = new ArrayTasks();
        int[] newArray = check.generateArraySqrIndex(6);
        assertEquals(newArray[0], 0);
        assertEquals(newArray[1], 1);
        assertEquals(newArray[2], 4);
        assertEquals(newArray[3], 9);
        assertEquals(newArray[4], 16);
        assertEquals(newArray[5], 25);
    }

    @Test
    public void testQuadraticSolution() {
        ArrayTasks checkSolution = new ArrayTasks();
        assertEquals(checkSolution.quadraticSolution(2, 4, -16), new double[]{-4, 2}, 0.001);
        assertEquals(checkSolution.quadraticSolution(0, 4, -2), new double[]{0.5}, 0.001);
        assertEquals(checkSolution.quadraticSolution(1, 4, 4), new double[]{-2}, 0.001);
    }

    @Test
    public void testArrayNumbersWithoutDivisorsThree() {
        ArrayTasks checkArray = new ArrayTasks();
        checkArray.arrayNumbersWithoutDivisorsThree(4);
        assertEquals(checkArray.arrayNumbersWithoutDivisorsThree(4), new int[]{1, 2, 4, 5});
        assertEquals(checkArray.arrayNumbersWithoutDivisorsThree(5), new int[]{1, 2, 4, 5, 7});
        assertEquals(checkArray.arrayNumbersWithoutDivisorsThree(10), new int[]{1, 2, 4, 5, 7, 8, 10, 11, 13, 14});
    }

    @Test
    public void testGeometricProgression() {
        ArrayTasks checkProgression = new ArrayTasks();
        assertEquals(checkProgression.geometricProgression(4, 3, 1), new double[]{1, 3, 9, 27}, 0.0001);
        assertEquals(checkProgression.geometricProgression(5, 0.4, -2), new double[]{-2, -0.8, -0.32, -0.128, -0.0512}, 0.0001);
        assertEquals(checkProgression.geometricProgression(3, -2, -0.1), new double[]{-0.1, 0.2, -0.4}, 0.0001);
    }

    @Test
    public void testFindNumberInArray() {
        int[] array = {2, 6, 8, 10, 4};
        assertFalse(ArrayTasks.findNumberInArray(array, 5));
        assertTrue(ArrayTasks.findNumberInArray(array, 4));
        assertFalse(ArrayTasks.findNumberInArray(array, 7));
    }
}
