package ru.ssau.tk.oop.task0;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class ArrayTasksTest {

    ArrayTasks check = new ArrayTasks();
    private final static double DELTA = 0.0001;

    @Test
    public void testArrayLength() {                                          //2.1 новый массив заданной размерности
        assertEquals(check.arrayLength(3).length, 3);
        assertEquals(check.arrayLength(5).length, 5);
        assertNotEquals(check.arrayLength(5).length, 4);
    }

    @Test
    public void testGenerateOnesArray() {                                    //2.2 единицы кроме первого и последнего
        assertEquals(check.generateOnesArray(5), new int[]{2, 1, 1, 1, 2});
        assertEquals(check.generateOnesArray(1), new int[]{2});
        assertEquals(check.generateOnesArray(2), new int[]{2, 2});
        assertEquals(check.generateOnesArray(10), new int[]{2, 1, 1, 1, 1, 1, 1, 1, 1, 2});
    }

    @Test
    public void testGenerateArray() {                                        //2.3 возрастающие нечетные числа
        assertEquals(check.generateArray(5), new int[]{1, 3, 5, 7, 9});
        assertEquals(check.generateArray(1), new int[]{1});
        assertEquals(check.generateArray(10), new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19});
    }

    @Test
    public void testGenerateArrayDecreasingEven() {                           //2.4 убывающие нечетные числа
        assertEquals(check.generateArrayDecreasingEven(5), new int[]{10, 8, 6, 4, 2});
        assertEquals(check.generateArrayDecreasingEven(1), new int[]{2});
        assertEquals(check.generateArrayDecreasingEven(8), new int[]{16, 14, 12, 10, 8, 6, 4, 2});
    }

    @Test
    public void testGenerateArrayFibonacciNumbers() {                         //2.5 н первых чисел Фибоначчи
        assertEquals(check.generateArrayFibonacciNumbers(6), new int[]{1, 1, 2, 3, 5, 8});
        assertEquals(check.generateArrayFibonacciNumbers(1), new int[]{1});
        assertEquals(check.generateArrayFibonacciNumbers(4), new int[]{1, 1, 2, 3});
    }

    @Test
    public void testGenerateArraySqrIndex() {                                 //2.6 новый массив квадраты индексов старого
        assertEquals(check.generateArraySqrIndex(6), new int[]{0, 1, 4, 9, 16, 25});
        assertEquals(check.generateArraySqrIndex(1), new int[]{0});
        assertEquals(check.generateArraySqrIndex(4), new int[]{0, 1, 4, 9});
    }

    @Test
    public void testQuadraticSolution() {                                    //2.7 решение квадратного уравнения
        assertEquals(check.quadraticSolution(2, 4, -16), new double[]{-4, 2}, DELTA);
        assertEquals(check.quadraticSolution(0, 4, -2), new double[]{0.5}, DELTA);
        assertEquals(check.quadraticSolution(1, 4, 4), new double[]{-2}, DELTA);
    }

    @Test
    public void testArrayNumbersWithoutDivisorsThree() {                    //2.8 все числа кроме делителей 3
        assertEquals(check.arrayNumbersWithoutDivisorsThree(4), new int[]{1, 2, 4, 5});
        assertEquals(check.arrayNumbersWithoutDivisorsThree(5), new int[]{1, 2, 4, 5, 7});
        assertEquals(check.arrayNumbersWithoutDivisorsThree(10), new int[]{1, 2, 4, 5, 7, 8, 10, 11, 13, 14});
    }

    @Test
    public void testGetArithmeticProgression() {                            //2.9 арифметическая прогрессия
        assertEquals(ArrayTasks.getArithmeticProgression(2, 5, -2), new double[]{5, 3});
        assertEquals(ArrayTasks.getArithmeticProgression(5, -1, 2), new double[]{-1, 1, 3, 5, 7});
        assertEquals(ArrayTasks.getArithmeticProgression(3, 0, 4), new double[]{0, 4, 8});
    }

    @Test
    public void testGeometricProgression() {                               //2.10 геометрическая прогрессия
        assertEquals(check.geometricProgression(4, 3, 1), new double[]{1, 3, 9, 27}, DELTA);
        assertEquals(check.geometricProgression(5, 0.4, -2), new double[]{-2, -0.8, -0.32, -0.128, -0.0512}, DELTA);
        assertEquals(check.geometricProgression(3, -2, -0.1), new double[]{-0.1, 0.2, -0.4}, DELTA);
    }

        /*
    @Test
    public void testArraySimpleNumbers() {           //2.12 не доделано
        ArrayTasks test = new ArrayTasks();
        int[] nn = new int[]{2, 3, 5, 7, 9};
        assertEquals(test.arraySimpleNumbers(10), new ArrayList<>());
    }
    */

    @Test
    public void testSymmetricArray() {                                     //2.13 получить симметричный массив
        assertEquals(check.symmetricArray(7), new int[]{1, 2, 3, 4, 3, 2, 1});
        assertEquals(check.symmetricArray(6), new int[]{1, 2, 3, 3, 2, 1});
        assertEquals(check.symmetricArray(5), new int[]{1, 2, 3, 2, 1});
    }

    @Test
    public void testChangeSign() {                                         //2.14 поменять знаки у входного массива
        int[] array = {2, -6, 8};
        ArrayTasks.changeSign(array);
        assertEquals(array, new int[]{-2, 6, -8});
        int[] arrayTwo = {1, 0, 7};
        ArrayTasks.changeSign(arrayTwo);
        assertEquals(arrayTwo, new int[]{-1, 0, -7});
        int[] arrayThree = {-1, -12, -78};
        ArrayTasks.changeSign(arrayThree);
        assertEquals(arrayThree, new int[]{1, 12, 78});
    }

    @Test
    public void testFindNumberInArray() {                                 //2.15 найти число в массиве
        assertFalse(ArrayTasks.findNumberInArray(new int[]{2, 6, 8, 10, 4}, 5));
        assertTrue(ArrayTasks.findNumberInArray(new int[]{2, 6, 8, 10, 4}, 4));
        assertFalse(ArrayTasks.findNumberInArray(new int[]{2, 6, 8, 10, 4}, 7));
    }

    @Test
    public void testCheckNull() {                                           //2.16 есть ли null в исходном
        assertTrue(ArrayTasks.checkNull(new Integer[]{2, 5, 6, null}));
        assertFalse(ArrayTasks.checkNull(new Integer[]{3, 2, 1}));
        assertTrue(ArrayTasks.checkNull(new Integer[]{null, 0, 1, null}));
    }

    @Test
    public void testCountEvenNumbers() {                                   //2.17 число четных в массиве
        assertEquals(check.countEvenNumbers(new int[]{1, 2, 3, 4, 5, 6, 10}), 4);
        assertEquals(check.countEvenNumbers(new int[]{2, 4, 6, 8, 12, 22, 24, 86, 100}), 9);
        assertEquals(check.countEvenNumbers(new int[]{1, 3, 5, 7, 9, 11, 13, 15, 21, 89, 91}), 0);
    }

    @Test
    public void testFindMax() {                                            //2.18 максимальный элемент
        assertEquals(check.findMax(new int[]{7, 6, 8, 5, 3, 2, 4, 1}), new Integer(8));
        assertEquals(check.findMax(new int[]{-7, 6, 87, -5, -3, 2, -4, 1}), new Integer(87));
        assertNull(check.findMax(new int[]{}));
    }

    @Test
    public void testSumOfEvenIndex() {                                    //2.19 сумма всех с четными индексами
        assertEquals(check.sumOfEvenIndex(new int[]{1, 2, 3, 4, 5, 6, 10}), 19);
        assertEquals(check.sumOfEvenIndex(new int[]{11, 32, 43, -4, 58, -76, 870}), 982);
        assertEquals(check.sumOfEvenIndex(new int[]{-1, 2, -3, 4, -5, 6, -10}), -19);
    }

    @Test
    public void testFindMoreDivisors() {                                  //2.20 у первого или последнего больше делителей
        assertFalse(ArrayTasks.findMoreDivisors(new int[]{27, 3, 9, 8, 2, 4, 6, 12, 24}));
        assertTrue(ArrayTasks.findMoreDivisors(new int[]{12, 4, 3, 2, 6, 1, 17, 18, 25}));
        assertFalse(ArrayTasks.findMoreDivisors(new int[]{27, 3, 9, 8, 6, 12, 24}));
    }

    @Test
    public void testFindMostCommonElement() {                              //2.21 что чаще всего встречается
        assertEquals(check.findMostCommonElement(new int[]{1, 1, 1, 2, 3, 3, 3, 4, 7, 6, 5}), 1);
        assertEquals(check.findMostCommonElement(new int[]{1, 2, 3, 4, 5, 11, 47, 89, 5, 32, 5, 4}), 4);
        assertEquals(check.findMostCommonElement(new int[]{0, -2, 3, 0, -5, 0, -4, 6, 0, 6}), 0);
    }

    @Test
    public void testFindIndexOfNumber() {                                  //2.22 первое вхождение числа в массив
        assertEquals(ArrayTasks.findIndexOfNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 20, 22, 11, 12, 89, 100}, 5), 4);
        assertEquals(ArrayTasks.findIndexOfNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 20, 22, 11, 12, 89, 100}, 11), 10);
        assertEquals(ArrayTasks.findIndexOfNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 20, 22, 11, 12, 89, 100}, 89), 18);
    }

    @Test
    public void testExchangedMaxAndMin() {                                  //2.23 поменять местами максимальный и минимальный
        int[] arrayFirst = {1, 2, 3, 5, 6};
        ArrayTasks.exchangedMaxAndMin(arrayFirst);
        assertEquals(arrayFirst, new int[]{6, 2, 3, 5, 1});
        int[] arraySecond = {5};
        ArrayTasks.exchangedMaxAndMin(arraySecond);
        assertEquals(arraySecond, new int[]{5});
        int[] arrayThird = {0, 0, 2, 0, 7};
        ArrayTasks.exchangedMaxAndMin(arrayThird);
        assertEquals(arrayThird, new int[]{7, 0, 2, 0, 0});
    }

    @Test
    public void testBitwiseNOT() {                                          //2.24 побитовое отрицание с изменением исходного
        int[] array = {12, 15, 56};
        ArrayTasks.bitwiseNOT(array);
        assertEquals(array, new int[]{-13, -16, -57});
        ArrayTasks.bitwiseNOT(array);
        assertEquals(array, new int[]{12, 15, 56});
        int[] newArray = {-2, 5, -6};
        ArrayTasks.bitwiseNOT(newArray);
        assertEquals(newArray, new int[]{1, -6, 5});
    }

    @Test
    public void testArrayBitwiseNot() {                                     //2.25 побитовое отрицание исходного без изменения исходного
        int[] yesArray = {7, 16, -9};
        ArrayTasks check = new ArrayTasks();
        assertEquals(check.arrayBitwiseNot(yesArray), new int[]{-8, -17, 8});
        assertEquals(check.arrayBitwiseNot(check.arrayBitwiseNot(yesArray)), new int[]{7, 16, -9});
        int[] yesArrayTwo = {17, -1, 2, 4};
        assertEquals(check.arrayBitwiseNot(yesArrayTwo), new int[]{-18, 0, -3, -5});
    }

    @Test
    public void testFindEvenNumbers() {                                     //2.27 true-четный, false-нечетный
        assertEquals(ArrayTasks.findEvenNumbers(new int[]{1, 2, 3, 4, 5}), new boolean[]{false, true, false, true, false});
        assertEquals(ArrayTasks.findEvenNumbers(new int[]{2, 4, 6, 8, 10}), new boolean[]{true, true, true, true, true});
        assertEquals(ArrayTasks.findEvenNumbers(new int[]{1, 3, 5, 7, 9}), new boolean[]{false, false, false, false, false});
        assertEquals(ArrayTasks.findEvenNumbers(new int[]{-1, 3, -5, 4, 0}), new boolean[]{false, false, false, true, true});
    }

    @Test
    public void testCreateTwoDimensionalArray() {                           //2.30 массив из массивов натуральных чисел поменьше
        assertEquals(ArrayTasks.createTwoDimensionalArray(3), new int[][]{{1, 2, 3}, {4, 5}, {6}});
        assertEquals(ArrayTasks.createTwoDimensionalArray(2), new int[][]{{1, 2}, {3}});
        assertEquals(ArrayTasks.createTwoDimensionalArray(1), new int[][]{{1}});
        assertEquals(ArrayTasks.createTwoDimensionalArray(5), new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {10, 11, 12}, {13, 14}, {15}});
    }

    @Test
    public void testSortWithoutNaN() {                                    //2.32 проверка на NaN:если есть-ничего не происходит, иначе - сортировка массива
        double[] array = {5.5, 1, 0, 6};
        ArrayTasks.sortWithoutNaN(array);
        assertEquals(array, new double[]{0, 1, 5.5, 6});

        double[] arrayOne = new double[2];
        arrayOne[0] = 1;
        arrayOne[1] = Double.NaN;
        ArrayTasks.sortWithoutNaN(arrayOne);
        assertEquals(arrayOne[0], 1);

        double[] arrayTwo = {1.4, 2.3, 4.5, Double.NaN, 7.9, Double.NaN, 11, Double.NaN, -8};
        ArrayTasks.sortWithoutNaN(arrayTwo);
        assertEquals(arrayTwo, new double[]{1.4, 2.3, 4.5, Double.NaN, 7.9, Double.NaN, 11, Double.NaN, -8});
    }
}
