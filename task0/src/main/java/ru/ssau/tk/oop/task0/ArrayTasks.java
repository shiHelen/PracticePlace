package ru.ssau.tk.oop.task0;

import static java.lang.Math.max;
import static java.lang.Math.sqrt;

public class ArrayTasks {
    static double[] getArithmeticProgression(int n, double a1, double d) {
        double[] array = new double[n];
        array[0] = a1;
        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] + d;
        }
        return array;
    }

    public int[] arrayLength(int l) {
        return new int[l];
    }

    public int[] generateOnesArray(int l) {
        int[] ones = new int[l];
        for (int i = 0; i < l; i++) {
            ones[i] = 1;
        }
        ones[0] = 2;
        ones[l - 1] = 2;
        return ones;
    }

    public int[] generateArray(int l) {
        int[] myArray = new int[l];
        int k = 1;
        for (int i = 0; i < l; i++) {
            myArray[i] = k;
            k = k + 2;
        }
        return myArray;
    }

    public int[] generateArrayDecreasingEven(int l) {
        int[] myArray = new int[l];
        int k = 2 * l;
        for (int i = 0; i < l; i++) {
            myArray[i] = k;
            k = k - 2;
        }
        return myArray;
    }

    public int[] generateArrayFibonacciNumbers(int l) {
        if (l == 1) {
            return new int[]{1};
        }
        if (l == 2) {
            return new int[]{1, 1};
        }
        int[] fibArray = new int[l];
        fibArray[0] = 1;
        fibArray[1] = 1;
        for (int i = 2; i < l; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        return fibArray;
    }

    public int[] generateArraySqrIndex(int l) {
        int[] taskArray = new int[l];
        for (int i = 0; i < l; i++) {
            taskArray[i] = i * i;
        }
        return taskArray;
    }

    public double[] quadraticSolution(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if ((D == 0) & (a > 0)) {
            double[] result = new double[1];
            result[0] = -b / (2 * a);
            return result;
        }
        if ((D > 0) & (a > 0)) {
            double[] result = new double[2];
            result[0] = (-b - sqrt(D)) / (2 * a);
            result[1] = (-b + sqrt(D)) / (2 * a);
            return result;
        }
        if (a == 0) {
            double[] result = new double[1];
            result[0] = -c / b;
            return result;
        }
        return new double[0];
    }

    public int[] arrayNumbersWithoutDivisorsThree(int l) {
        int[] numbersArray = new int[l];
        int k = 1;
        for (int i = 0; i < l; i++) {
            numbersArray[i] = k;
            k++;
            if (k % 3 == 0) {
                k++;
            }
        }
        return numbersArray;
    }

    public double[] geometricProgression(int l, double q, double b1) {
        double[] bProgression = new double[l];
        bProgression[0] = b1;
        for (int i = 1; i < l; i++) {
            bProgression[i] = bProgression[i - 1] * q;
        }
        return bProgression;
    }

    public double[] getArrayDivisors(int c, int l) {
        double[] divisors = new double[]{};
        int i = 1;
        divisors[0] = c;
        while (divisors[i] < sqrt(c)) {
            divisors[i] += c;
            i++;
        }
        return divisors;
    }

    static boolean findNumberInArray(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }

    static void changeSign(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -1 * array[i];
        }
    }

    static boolean checkNull(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                return true;
            }
        }
        return false;
    }

    public int countEvenNumbers(int[] numbers) {
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                k++;
            }
        }
        return k;
    }

    public Integer findMax(int[] arrayValues) {
        if (arrayValues.length > 0) {
            int maxValue = arrayValues[0];
            for (int i = 1; i < arrayValues.length; i++) {
                if (arrayValues[i] > maxValue) {
                    maxValue = arrayValues[i];
                }
            }
            return maxValue;
        }
        return null;
    }

    public int[] symmetricArray(int l) {
        int[] symmetric = new int[l];
        if (l % 2 != 0) {
            for (int i = 0; i <= (l / 2); i++) {
                symmetric[i] = i + 1;
            }
            int k = (l / 2) + 1;
            for (int j = l / 2 + 1; j < l; j++) {
                symmetric[j] = k - 1;
                k--;
            }
            return symmetric;
        }
        {
            for (int i = 0; i < (l / 2); i++) {
                symmetric[i] = i + 1;
            }
            int k = (l / 2);
            for (int j = l / 2; j < l; j++) {
                symmetric[j] = k;
                k--;
            }
            return symmetric;
        }
    }

    public int sumOfEvenIndex(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (i % 2 == 0) {
                sum += values[i];
            }
        }
        return sum;
    }

    static void bitwiseNOT(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ~array[i];
        }
    }

    static void exchangedMaxAndMin(int[] array) {
        int min = array[0];
        int indexMin = 0;
        int max = array[0];
        int indexMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }
        array[indexMax] = min;
        array[indexMin] = max;
    }

    static int findIndexOfNumber(int[] values, int c) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == c) {
                return i;
            }
        }
        return 0;
    }

    public int[] arrayBitwiseNot(int[] yesArray) {
        int[] notArray = new int[yesArray.length];
        for (int i = 0; i < yesArray.length; i++) {
            notArray[i] = ~yesArray[i];
        }
        return notArray;
    }

    static boolean findMoreDivisors(int[] values) {
        int k1 = 0;
        int k2 = 0;
        for (int value : values) {
            if (values[0] % value == 0) {
                k1++;
            }
            if (values[values.length - 1] % value == 0) {
                k2++;
            }
        }
        return k1 > k2;
    }
}
