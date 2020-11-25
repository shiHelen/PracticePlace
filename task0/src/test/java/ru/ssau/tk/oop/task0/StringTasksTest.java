package ru.ssau.tk.oop.task0;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class StringTasksTest {
    public static StringTasks check = new StringTasks();

    @Test
    public void testIsPalindrome() {                                    //3.4 является ли палиндромом
        assertTrue(check.isPalindrome("111"));
        assertTrue(check.isPalindrome("000"));
        assertTrue(check.isPalindrome("aba"));
        assertFalse(check.isPalindrome("abc"));
        assertFalse(check.isPalindrome("AbC"));
        assertFalse(check.isPalindrome("Aaa"));
    }

    @Test
    public void testIsSameRegister() {                                  //3.5 сравнение регистров
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
    public void testFindSubstringInString() {                                                           //3.7 поиск подстроки в строке (индекс начала подстроки)
        assertEquals(StringTasks.findSubstringInString("abcabcabc", "ca"), 2);
        assertEquals(StringTasks.findSubstringInString("akakakaka", "ka"), 1);
        assertEquals(StringTasks.findSubstringInString("kitten", "n"), 5);
        assertEquals(StringTasks.findSubstringInString("trouble", ""), 0);
        assertEquals(StringTasks.findSubstringInString("darkness", "b"), -1);
    }

    @Test
    public void testFindSubstringInSecondHalfString() {                                                 //3.8 поиск подстроки во второй половине первой строки
        assertEquals(StringTasks.findSubstringInSecondHalfString("alone", "one"), 2);
        assertEquals(StringTasks.findSubstringInSecondHalfString("cosmos", "mos"), 3);
        assertEquals(StringTasks.findSubstringInSecondHalfString("equipment", "ment"), 5);
        assertEquals(StringTasks.findSubstringInSecondHalfString("realized", "bbb"), -1);
        assertEquals(StringTasks.findSubstringInSecondHalfString("", "a"), -1);
    }

    @Test
    public void testLastInFirstLineOfFirstLine() {                                                      //3.9 возвращающий индекс последнего вхождения второй строки в первую половину первой строки
        assertEquals(StringTasks.lastInFirstLineOfFirstLine("abcabcabcabc", "ab"), 6);
        assertEquals(StringTasks.lastInFirstLineOfFirstLine("clock", ""), 2);
        assertEquals(StringTasks.lastInFirstLineOfFirstLine("boolean", "a"), -1);
        assertEquals(StringTasks.lastInFirstLineOfFirstLine("zooland", "o"), 2);
    }

    @Test
    public void testCountStrings() {                                                                    //3.10 количество строк начинающихся со строки-префикса и заканчивающихся строкой-постфиксом
        assertEquals(StringTasks.countStrings(new String[]{"river", "dog", "dry long", "respect bigger", "among"}, "d", "g"), 2);
        assertEquals(StringTasks.countStrings(new String[]{"river", "dog", "dry long", "respect bigger", "among"}, "r", "r"), 2);
        assertEquals(StringTasks.countStrings(new String[]{"river", "dog", "dry long", "respect bigger", "among"}, "l", "l"), 0);
    }

    @Test
    public void testNewCountOfStrings() {                                                               //3.11 количество строк, содержащихся в массиве и начинающихся со строки-префикса и заканчивающихся строкой-постфиксом, игнорируя все пробельные символы в начале и в конце строки
        assertEquals(StringTasks.newCountOfStrings(new String[]{" river", "dog ", " dry long", "respect bigger ", "among"}, "d", "g"), 2);
        assertEquals(StringTasks.newCountOfStrings(new String[]{"river  ", "dog    ", "dry long", "respect bigger", "among"}, "r", "r"), 2);
        assertEquals(StringTasks.newCountOfStrings(new String[]{"    river", "    dog", "    dry long", "respect bigger  ", "among"}, "l", "l"), 0);
    }

    @Test
    public void testNewString() {                                                                    //3.12 новую строку, полученную путём замены в первой строки каждое вхождение второй строки на третью строку
        assertEquals(StringTasks.newString("opopopopo", "opo", "po"), "popppo");
        assertEquals(StringTasks.newString("экология", "оло", "ол"), "эколгия");
        assertEquals(StringTasks.newString("распространение", "стра", "ар"), "распроарнение");
    }

    @Test
    public void testGetSubstringInString() {                                                         //3.13 вернуть подстроку из исходной строки от и до заданных индексов
        assertEquals(StringTasks.getSubstringInString("Variable is effectively-final", 1, 1), "");
        assertEquals(StringTasks.getSubstringInString("Variable is effectively-final", 5, 7), "bl");
        assertEquals(StringTasks.getSubstringInString("Variable is effectively-final", -10, 3), "Var");
        assertEquals(StringTasks.getSubstringInString("Variable is effectively-final", 0, 1), "V");
        assertEquals(StringTasks.getSubstringInString("Variable is effectively-final", 20, 50), "ely-final");
    }

    @Test
    public void testConcatenateStrings() {                                                               //3.20 на вход массив строк и объединяющий её в одну строку с перечислением через запятую и пробел
        assertEquals(StringTasks.concatenateStrings(new String[]{"h a v e", "a", "good", "DAY"}), "h a v e, a, good, DAY");
        assertEquals(StringTasks.concatenateStrings(new String[]{"1A2b3c", "yEp", "Sad"}), "1A2b3c, yEp, Sad");
        assertEquals(StringTasks.concatenateStrings(new String[]{"сессия", "близкоо", ":("}), "сессия, близкоо, :(");
        assertEquals(StringTasks.concatenateStrings(new String[]{"ДеД", "мОрОз", "мёртв"}), "ДеД, мОрОз, мёртв");
        assertEquals(StringTasks.concatenateStrings(new String[]{"!№;%", "asd", "789"}), "!№;%, asd, 789");
    }

    @Test
    public void testGetStringOfNumbers() {                                                              //3.22 строку, состоящую из перечисления через пробел всех чисел от 0 (включительно) до входного (исключительно).
        assertEquals(StringTasks.getStringOfNumbers(1), "0");
        assertEquals(StringTasks.getStringOfNumbers(10), "0123456789");
        assertEquals(StringTasks.getStringOfNumbers(-5), "");
    }

    @Test
    public void testGetNewString() {                                                                    //3.21 в исходной строке заменить каждый чётный символ на номер этого символа, затем перевернуть строку
        assertEquals(StringTasks.getNewString("01234"), "43210");
        assertEquals(StringTasks.getNewString("3A1b5C7"), "6C4b2A0");
        assertEquals(StringTasks.getNewString("AbCdeFgH"), "H6F4d2b0");
    }

//    @Test
//    public void testTabulatedArrayOfWords() {
//        //assertEquals(StringTasks.tabulatedArrayOfWords("Hello, it is me."), new String[]{"Hello,", "It", "Is", "Me."});
//        //assertEquals(StringTasks.tabulatedArrayOfWords("We got the power"), new String[]{"We", "Got", "The", "Power"});
//        //assertEquals(StringTasks.tabulatedArrayOfWords("The lost chord"), new String[]{"The", "Lost", "Chord"});
//        System.out.println(Arrays.toString(StringTasks.tabulatedArrayOfWords("h  p")));
//    }
}
