package ru.ssau.tk.oop.task0;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringTasks {
    public void outputSeparately(String sentence) {     //3.1 вывод строки в консоль отдельно по одному символу в строке
        for (int i = 0; i < sentence.length(); i++) {
            System.out.println(sentence.charAt(i));
        }
    }

    public void getArrayOfBytes(String str) {        //3.2 получить массив байтов из строки и вывести его
        byte[] bytesValue = str.getBytes();
        for (int bytes : bytesValue) {
            System.out.println(bytes);
        }
    }

    public void sameStrings() {                        //3.3 сравнение работы "==" и equals()
        String s1 = "A";
        String s2 = new String(s1);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    public boolean isPalindrome(String str) {           //3.4 является ли палиндромом
        String palindrome = new StringBuilder(str).reverse().toString();
        return str.equals(palindrome);
    }

    public boolean isSameRegister(String strFirst, String strSecond) {          //3.5 сравнение регистров
        return strFirst.equalsIgnoreCase(strSecond) && !strFirst.equals(strSecond);
    }

    public static void learningCharacterEscaping() {                        //3.6 изучение экранирования символов
        int i = 0;
        System.out.println("Символ\t№" + ++i);   //символ табуляции
        System.out.println("Символ\b№" + ++i);   //символ удаления последнего символа в строке
        System.out.println("Символ\n№" + ++i);   //символ перехода на новую строку
        System.out.println("Символ\r№" + ++i);   //не выводить элементы в строке до символа
        System.out.println("Символ\'№" + ++i);   //вывести ', а не считать ее частью кода
        System.out.println("Символ\"№" + ++i);   //вывести "
        System.out.println("Символ\\№" + ++i);   //вывести \, а не считать ее частью кода

    }

    public static int findSubstringInString(String str, String subStr) {        //3.7 поиск подстроки в строке (индекс начала подстроки)
        return str.indexOf(subStr);
    }

    public static int findSubstringInSecondHalfString(String str, String substring) {       //3.8 поиск подстроки во второй половине первой строки
        return str.indexOf(substring, str.length() / 2);
    }

    public static int lastInFirstLineOfFirstLine(String str, String subStr) {               //3.9 возвращающий индекс последнего вхождения второй строки в первую половину первой строки
        return str.lastIndexOf(subStr, str.length() / 2);
    }

    public static int countStrings(String[] array, String prefix, String postfix) {                //3.10 количество строк начинающихся со строки-префикса и заканчивающихся строкой-постфиксом
        int count = 0;
        for (String str : array) {
            if (str.startsWith(prefix) && str.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }

    public static int newCountOfStrings(String[] array, String prefix, String postfix) {               //3.11 количество строк, содержащихся в массиве и начинающихся со строки-префикса и заканчивающихся строкой-постфиксом, игнорируя все пробельные символы в начале и в конце строки
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
        }
        for (String str : array) {
            if (str.startsWith(prefix) && str.endsWith(postfix)) {
                number++;
            }
        }
        return number;
    }

    public static String newString(String strFirst, String strSecond, String strThird) {                //3.12 новую строку, полученную путём замены в первой строки каждое вхождение второй строки на третью строку
        for (int i = 0; i < 100 && strFirst.contains(strSecond); i++) {
            strFirst = strFirst.replaceAll(strSecond, strThird);
        }
        return strFirst;
    }

    public static String getSubstringInString(String str, int from, int to) {                          //3.13 вернуть подстроку из исходной строки от и до заданных индексов
        if (from < 0) {
            from = 0;
        }
        if (to > str.length()) {
            to = str.length();
        }
        if (from == to) {
            return "";
        }
        return str.substring(from, to);
    }

//    public static String[] tabulatedArrayOfWords(String str) {          //3.19 надо доделать в слуае двух пробелов
//        String[] arrayWords = str.split(" ");
//        for (int i = 0; i < arrayWords.length; i++) {
//            if (arrayWords[i].charAt(0) == ' ') {
//                i++;
//            } else {
//                arrayWords[i] = arrayWords[i].substring(0, 1).toUpperCase() + arrayWords[i].substring(1);
//            }
//        }
//        return arrayWords;
//    }

    public static String concatenateStrings(String[] arrayStr) {                                        //3.20 на вход массив строк и объединяющий её в одну строку с перечислением через запятую и пробел
        return String.join(", ", arrayStr);
    }

    public static String getNewString(String str) {                                                     //3.21 в исходной строке заменить каждый чётный символ на номер этого символа, затем перевернуть строку
        StringBuilder strBuilder = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                strBuilder.replace(i, i + 1, i + "");
            }
        }
        strBuilder.reverse();
        return strBuilder.toString();
    }

    public static String getStringOfNumbers(int number) {                                               //3.22 строку, состоящую из перечисления через пробел всех чисел от 0 (включительно) до входного (исключительно).
        StringBuilder stringNumbers = new StringBuilder();
        for (int i = 0; i < number; i++) {
            stringNumbers.append(i);
        }
        return stringNumbers.toString();
    }

    public static String changeCharsetToString(String str, Charset charsetFirst, Charset charsetSecond) {       //3.24 смена кодировки для входной строки
        return new String(str.getBytes(charsetFirst), charsetSecond);
    }


    public static StringTasks check = new StringTasks();

    public static void main(String[] args) {
        /*  вызов метода 3.1 все работает, но уже не актуально, поэтому в комментарии
        check.outputSeparately("abstract");
        System.out.println("");
        check.outputSeparately("not bad");
        System.out.println("");
        check.outputSeparately("it works yeees!");
        */
        /* вызов метода 3.2 все работает, но уже не актуально, поэтому в комментарии
        check.getArrayOfBytes("проверка");
        System.out.println("");
        check.getArrayOfBytes("something");
        */
        // check.sameStrings();  вызов 3.3
        // System.out.println(check.isPalindrome("121")); вызов 3.4
        // System.out.println(check.isSameRegister("aaa", "Aaa"));  вызов 3.5
        // learningCharacterEscaping();                         вызов 3.6
        // Charset charset = Charset.defaultCharset();           //вызов 3.23
        // System.out.println(charset);
        // System.out.println(getStringOfNumbers(10000));    вызов 3.22
        System.out.println(changeCharsetToString("Самый пророческий роман Достоевского", StandardCharsets.UTF_8, StandardCharsets.UTF_16));         //вызов 3.24
        System.out.println(changeCharsetToString("Самый пророческий роман Достоевского", StandardCharsets.UTF_8, StandardCharsets.US_ASCII));
        System.out.println(changeCharsetToString("Самый пророческий роман Достоевского", StandardCharsets.UTF_8, StandardCharsets.UTF_16LE));
        System.out.println(changeCharsetToString("Самый пророческий роман Достоевского", StandardCharsets.UTF_8, StandardCharsets.ISO_8859_1));
        System.out.println(changeCharsetToString("Самый пророческий роман Достоевского", StandardCharsets.UTF_8, StandardCharsets.UTF_16BE));
        System.out.println(changeCharsetToString("Самый пророческий роман Достоевского", StandardCharsets.UTF_8, StandardCharsets.UTF_8));
    }
}
