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

    public static StringTasks check = new StringTasks();

    public static void main(String[] args) {
        /*  вызов метода 3.1 все работает, но уже не актуально, поэтому в комментарии
        check.outputSeparately("abstract");
        System.out.println("");
        check.outputSeparately("not bad");
        System.out.println("");
        check.outputSeparately("it works yeees!");
        */
        check.getArrayOfBytes("проверка");
        System.out.println("");
        check.getArrayOfBytes("something");
    }
}
