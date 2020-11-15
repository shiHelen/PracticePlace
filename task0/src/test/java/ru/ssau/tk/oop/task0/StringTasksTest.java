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

    @Test
    public void testIsSameRegister() {
        assertFalse(check.isSameRegister("111", "111"));
        assertTrue(check.isSameRegister("AAA", "aaa"));
        assertTrue(check.isSameRegister("AaA", "aaA"));
        assertTrue(check.isSameRegister("Aaa", "aaa"));
        assertTrue(check.isSameRegister("bbb", "BBB"));
        assertFalse(check.isSameRegister("AAA", "aa"));
        assertFalse(check.isSameRegister("", "aaa"));
        assertFalse(check.isSameRegister("", ""));
    }
}
