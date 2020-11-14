package ru.ssau.tk.oop.task0;

public class StringTasks {
    public void outputSeparately(String sentence) {
        for (int i = 0; i < sentence.length(); i++) {
            System.out.println(sentence.charAt(i));
        }
    }

    public static void main(String[] args) {
        StringTasks check = new StringTasks();
        check.outputSeparately("abstract");
        System.out.println("");
        check.outputSeparately("not bad");
        System.out.println("");
        check.outputSeparately("it's work yeees!");
    }
}
