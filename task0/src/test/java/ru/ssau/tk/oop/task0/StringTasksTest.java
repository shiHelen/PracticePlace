package ru.ssau.tk.oop.task0;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringTasksTest {
    public static StringTasks check = new StringTasks();

    @Test
    public void testIsPalindrome() {
        assertTrue(check.isPalindrome("111"));
        assertTrue(check.isPalindrome("000"));
        assertTrue(check.isPalindrome("aba"));
        assertFalse(check.isPalindrome("abc"));
        assertFalse(check.isPalindrome("AbC"));
        assertFalse(check.isPalindrome("Aaa"));
    }
}
