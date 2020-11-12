package ru.ssau.tk.oop.task0;

public class Matrices {
    static Matrix sumMatrix(Matrix matrix1, Matrix matrix2) {
        if ((matrix1.getM() != matrix2.getM()) | (matrix1.getN() != matrix2.getN())) {
            return null;
        }
        Matrix sumMatrix = new Matrix(matrix1.getN(), matrix1.getM());
        for (int i = 0; i < sumMatrix.getN(); i++) {
            for (int j = 0; j < sumMatrix.getM(); j++) {
                double sum = matrix1.getAt(i, j) + matrix2.getAt(i, j);
                sumMatrix.setAt(i, j, sum);
            }
        }
        return sumMatrix;
    }

    static Matrix multiplyMatrix(Matrix matrix1, Matrix matrix2) {
        if (matrix1.getM() != matrix2.getN()) {
            return null;
        }
        Matrix multiplyMatrix = new Matrix(matrix1.getN(), matrix2.getM());
        for (int i = 0; i < multiplyMatrix.getN(); ++i) {
            for (int j = 0; j < multiplyMatrix.getM(); ++j) {
                double mult = 0;
                for (int k = 0; k < matrix1.getM(); ++k) {
                    mult += matrix1.getAt(i, k) * matrix2.getAt(k, j);
                    multiplyMatrix.setAt(i, j, mult);
                }
            }
        }
        return multiplyMatrix;
    }

    static Matrix multiplyByConstMatrix(Matrix matrix, double k) {
        Matrix multiplyConstMatrix = new Matrix(matrix.getN(), matrix.getM());
        for (int i = 0; i < multiplyConstMatrix.getN(); i++) {
            for (int j = 0; j < multiplyConstMatrix.getM(); j++) {
                double multConst = matrix.getAt(i, j) * k;
                multiplyConstMatrix.setAt(i, j, multConst);
            }
        }
        return multiplyConstMatrix;
    }
}
