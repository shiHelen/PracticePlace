package ru.ssau.tk.oop.task0;

public class ArrayTasks {
    public int[] generateArrayDecreasingEven(int l) {
        int[] myArray = new int[l];
        int k = 2 * l;
        for (int i = 0; i < l; i++) {
            myArray[i] = k;
            k = k - 2;
        }
        return myArray;
    }
}
