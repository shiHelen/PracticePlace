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

    @Test
    public void testFindSubstringInString() {
        assertEquals(StringTasks.findSubstringInString("abcabcabc", "ca"), 2);
        assertEquals(StringTasks.findSubstringInString("akakakaka", "ka"), 1);
        assertEquals(StringTasks.findSubstringInString("kitten", "n"), 5);
        assertEquals(StringTasks.findSubstringInString("trouble", ""), 0);
        assertEquals(StringTasks.findSubstringInString("darkness", "b"), -1);
    }

    @Test
    public void testFindSubstringInSecondHalfString() {
        assertEquals(StringTasks.findSubstringInSecondHalfString("alone", "one"), 2);
        assertEquals(StringTasks.findSubstringInSecondHalfString("cosmos", "mos"), 3);
        assertEquals(StringTasks.findSubstringInSecondHalfString("equipment", "ment"), 5);
        assertEquals(StringTasks.findSubstringInSecondHalfString("realized", "bbb"), -1);
        assertEquals(StringTasks.findSubstringInSecondHalfString("", "a"), -1);
    }

    @Test
    public void testLastInFirstLineOfFirstLine() {
        assertEquals(StringTasks.lastInFirstLineOfFirstLine("abcabcabcabc", "ab"), 6);
        assertEquals(StringTasks.lastInFirstLineOfFirstLine("clock", ""), 2);
        assertEquals(StringTasks.lastInFirstLineOfFirstLine("boolean", "a"), -1);
        assertEquals(StringTasks.lastInFirstLineOfFirstLine("zooland", "o"), 2);
    }
}
