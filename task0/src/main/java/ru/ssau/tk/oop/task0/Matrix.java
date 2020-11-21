package ru.ssau.tk.oop.task0;

import java.util.StringJoiner;

public class Matrix {
    private final double[][] myMatrix;
    private final int n;
    private final int m;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        myMatrix = new double[n][m];
    }

    @Override
    public String toString() {
        StringJoiner columnMatrix = new StringJoiner(";\n");
        StringJoiner lineMatrix = new StringJoiner(",");
        for (double[] lineArray : myMatrix) {
            for (double element : lineArray) {
                lineMatrix.add(element + "");
            }
            columnMatrix.add(lineMatrix.toString());
            lineMatrix = new StringJoiner(",");
        }
        return columnMatrix.toString() + ";";
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
