package ru.ssau.tk.oop.task0;

import java.util.Arrays;
import java.util.LinkedList;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class ArrayTasks {

    public int[] arrayLength(int l) {                       //2.1 новый массив заданной размерности
        return new int[l];
    }

    public int[] generateOnesArray(int l) {                 //2.2 единицы кроме первого и последнего
        int[] ones = new int[l];
        for (int i = 0; i < l; i++) {
            ones[i] = 1;
        }
        ones[0] = 2;
        ones[l - 1] = 2;
        return ones;
    }

    public int[] generateArray(int l) {                     //2.3 возрастающие нечетные числа
        int[] myArray = new int[l];
        int k = 1;
        for (int i = 0; i < l; i++) {
            myArray[i] = k;
            k = k + 2;
        }
        return myArray;
    }

    public int[] generateArrayDecreasingEven(int l) {      //2.4 убывающие нечетные числа
        int[] myArray = new int[l];
        int k = 2 * l;
        for (int i = 0; i < l; i++) {
            myArray[i] = k;
            k = k - 2;
        }
        return myArray;
    }

    public int[] generateArrayFibonacciNumbers(int l) {      //2.5 н первых чисел Фибоначчи
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

    public int[] generateArraySqrIndex(int l) {             //2.6 новый массив квадраты индексов старого
        int[] taskArray = new int[l];
        for (int i = 0; i < l; i++) {
            taskArray[i] = i * i;
        }
        return taskArray;
    }

    public double[] quadraticSolution(double a, double b, double c) {       //2.7 решение квадратного уравнения
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

    public int[] arrayNumbersWithoutDivisorsThree(int l) {              //2.8 все числа кроме делителей 3
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

    static double[] getArithmeticProgression(int n, double a1, double d) {              //2.9 арифметическая прогрессия
        double[] array = new double[n];
        array[0] = a1;
        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] + d;
        }
        return array;
    }

    public double[] geometricProgression(int l, double q, double b1) {                  //2.10 геометрическая прогрессия
        double[] bProgression = new double[l];
        bProgression[0] = b1;
        for (int i = 1; i < l; i++) {
            bProgression[i] = bProgression[i - 1] * q;
        }
        return bProgression;
    }

    public int[] getArrayDivisors(int c) {                                              //2.11 все делители целого числа с
        int count = 0;
        for (int i = 1; i <= (int) sqrt(abs(c)); i++) {
            if (abs(c) % i == 0) {
                count += 1;
            }
        }
        count = 2 * count - (sqrt(abs(c)) == (int) sqrt(abs(c)) ? 1 : 0);
        count *= 2;
        int[] arrayDivisors = new int[count];
        for (int j = 0, k = 0; j != (int) sqrt(abs(c)); j++) {
            if (abs(c) % (j + 1) == 0) {
                arrayDivisors[k] = j + 1;
                arrayDivisors[count - 1 - k] = abs(c) / (j + 1);
                k += 1;
            }
            if (abs(c) % (j + 1) == 0) {
                arrayDivisors[k] = -(j + 1);
                arrayDivisors[count - 1 - k] = -(abs(c) / (j + 1));
                k += 1;
            }
        }
        return arrayDivisors;
    }

    public LinkedList<Integer> arraySimpleNumbers(int c) {              //2.12 все положительные простые числа до входного включительно
        if (c < 2) return new LinkedList<Integer>();
        LinkedList<Integer> primes = new LinkedList<Integer>();
        LinkedList<Integer> nums = new LinkedList<Integer>();

        for (int i = 2; i <= c; i++) { //unoptimized
            nums.add(i);
        }

        while (nums.size() > 0) {
            int nextPrime = nums.remove();
            for (int i = nextPrime * nextPrime; i <= c; i += nextPrime) {
                nums.removeFirstOccurrence(i);
            }
            primes.add(nextPrime);
        }
        return primes;
    }

    public int[] symmetricArray(int l) {                //2.13 получить симметричный массив
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

    static void changeSign(int[] array) {               //2.14 поменять знаки у входного массива
        for (int i = 0; i < array.length; i++) {
            array[i] = -1 * array[i];
        }
    }

    static boolean findNumberInArray(int[] array, int n) {          //2.15 найти число в массиве
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }

    static boolean checkNull(Integer[] array) {                 //2.16 есть ли null в исходном
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                return true;
            }
        }
        return false;
    }

    public int countEvenNumbers(int[] numbers) {            //2.17 число четных в массиве
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                k++;
            }
        }
        return k;
    }

    public Integer findMax(int[] arrayValues) {             //2.18 максимальный элемент
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

    public int sumOfEvenIndex(int[] values) {               //2.19 сумма всех с четными индексами
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (i % 2 == 0) {
                sum += values[i];
            }
        }
        return sum;
    }

    static boolean findMoreDivisors(int[] values) {         //2.20 у первого или последнего больше делителей
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

    public int findMostCommonElement(int[] numbers) {           //2.21 что чаще всего встречается
        int num = numbers[0];
        int max_common = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            int common = 1;
            for (int k = i + 1; k < numbers.length; k++) {
                if (numbers[i] == numbers[k]) {
                    common += 1;
                }
                if (common > max_common) {
                    max_common = common;
                    num = numbers[i];
                    return numbers[i];
                }
            }
        }
        return 0;
    }

    static int findIndexOfNumber(int[] values, int c) {         //2.22 первое вхождение числа в массив
        for (int i = 0; i < values.length; i++) {
            if (values[i] == c) {
                return i;
            }
        }
        return 0;
    }

    static void exchangedMaxAndMin(int[] array) {               //2.23 поменять местами максимальный и минимальный
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

    static void bitwiseNOT(int[] array) {                   //2.24 побитовое отрицание с изменением исходного
        for (int i = 0; i < array.length; i++) {
            array[i] = ~array[i];
        }
    }

    public int[] arrayBitwiseNot(int[] yesArray) {             //2.25 побитовое отрицание исходного без изменения исходного
        int[] notArray = new int[yesArray.length];
        for (int i = 0; i < yesArray.length; i++) {
            notArray[i] = ~yesArray[i];
        }
        return notArray;
    }

    public static int[] sumNextElements(int[] array) {                  //2.26 сумма соседних элементов
        if (array.length % 2 == 0) {
            int[] resultArray = new int[array.length / 2];
            for (int i = 0, j = 0; j != array.length; i++, j += 2) {
                resultArray[i] = array[j] + array[j + 1];
            }
            return resultArray;
        }
        int[] resultArray = new int[array.length / 2 + 1];
        for (int i = 0, j = 0; j != array.length - 1; i++, j += 2) {
            resultArray[i] = array[j] + array[j + 1];
        }
        resultArray[resultArray.length - 1] = array[array.length - 1];
        return resultArray;
    }

    static boolean[] findEvenNumbers(int[] array) {             //2.27 true-четный, false-нечетный
        boolean[] bool = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                bool[i] = true;
            } else {
                bool[i] = false;
            }
        }
        return bool;
    }

    public static int[] convertLongToTwoInts(long number) {             //2.28 конвертация из long в int и обратно
        return new int[]{(int) (number >> 32), (int) number};
    }

    public static long convertTwoIntsToLong(int first, int last) {
        return ((long) last | (long) first << 32);
    }

    public static int[] getCycleOfNaturalNumbers(int size, int startingIndex) {         //2.29 цикл натуральных чисел по начальным параметрам
        if (startingIndex < 0 || startingIndex >= size) {
            throw new IllegalArgumentException("Invalid starting index!");
        }
        int[] array = new int[size];
        int diff = startingIndex - 1;
        for (int i = 0; i != size; i++, startingIndex++) {
            array[startingIndex % size] = startingIndex - diff;
        }
        return array;
    }

    static int[][] createTwoDimensionalArray(int n) {                       //2.30 массив из массивов натуральных чисел поменьше
        int[][] array = new int[n][];
        int m = n;
        int k = 1;
        for (int i = 0; i < n; i++) {
            array[i] = new int[m];
            for (int j = 0; j < m; j++) {
                array[i][j] = k;
                k++;
            }
            m--;
        }
        return array;
    }

    static void sortWithoutNaN(double[] array) {                    //2.32 проверка на NaN:если есть-ничего не происходит, иначе - сортировка массива
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (Double.isNaN(array[i])) {
                k++;
            }
        }
        if (k == 0) {
            java.util.Arrays.sort(array);
        }
    }

    static void printStrings(String[] strs) {                       //2.33 вывод в консоль массива строк
        for (String s : strs) {
            System.out.println(s);
        }
    }

    static double multiplyNormalNumbers(double[] array) {          //2.34 произведение всех ненулевых, ненечисел, небесконечностей.
        double multiply = 1;
        for (Double i : array
        ) {
            if (i != 0 & !i.isInfinite() & !i.isNaN()) {
                multiply *= i;
            }
        }
        return multiply;
    }

    static void printHexNumbers(int[] values) {                   //2.35 вывод в консоль массива целых чисел в шестнадцатеричной форме
        Arrays.stream(values).forEach(i -> System.out.println(Integer.toHexString(i)));
    }

    public static void main(String[] args) {
        String[] strs = {"dead inside", "already", "just stop"};        //вызов 2.33
        printStrings(strs);
        int[] numbers = {16, 17, 18, 15, 14, 13, 12, 11};               //вызов 2.35
        printHexNumbers(numbers);
    }
}
