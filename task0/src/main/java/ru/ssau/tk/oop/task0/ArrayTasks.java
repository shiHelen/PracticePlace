package ru.ssau.tk.oop.task0;

public class ArrayTasks {
    public int[] generateArraySqrIndex(int l) {
        int[] taskArray = new int[l];
        for (int i = 0; i < l; i++) {
            taskArray[i] = i * i;
        }
        return taskArray;
    }
}
