package ru.ssau.tk.oop.task0;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTasksTest {

    @Test
    public void testGenerateArray() {
        ArrayTasks check = new ArrayTasks();
        int[] newArray = check.generateArraySqrIndex(6);
        assertEquals(newArray[0], 0);
        assertEquals(newArray[1], 1);
        assertEquals(newArray[2], 4);
        assertEquals(newArray[3], 9);
        assertEquals(newArray[4], 16);
        assertEquals(newArray[5], 25);
    }
}
