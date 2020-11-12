package ru.ssau.tk.oop.task0;

public class Matrix {
    private final double[][] myMatrix;
    private final int n;
    private final int m;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        myMatrix = new double[n][m];
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public double getAt(int n, int m) {
        return myMatrix[n][m];
    }

    public void setAt(int n, int m, double values) {
        myMatrix[n][m] = values;
    }
}
