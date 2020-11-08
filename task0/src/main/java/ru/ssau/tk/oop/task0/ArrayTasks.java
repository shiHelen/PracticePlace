package ru.ssau.tk.oop.task0;

public class ArrayTasks {
    public int[] generateArray(int l) {
        int[] ones = new int[l];
        for (int i = 0; i < l; i++) {
            ones[i] = 1;
        }
        ones[0] = 2;
        ones[l - 1] = 2;
        return ones;
    }
}
