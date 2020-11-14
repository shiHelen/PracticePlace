package ru.ssau.tk.oop.task0;

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
        System.out.println(check.isPalindrome("121"));
    }
}
