package ru.ssau.tk.oop.task0;

public class ArrayTasks {
    static double[] getArithmeticProgression(int n, double a1, double d) {
        double[] array = new double[n];
        array[0] = a1;
        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] + d;
        }
        return array;
    }
}
