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
}
