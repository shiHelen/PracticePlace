package ru.ssau.tk.oop.task0;

import java.util.ArrayList;

public class LaplaceEquation {
    public double[] bordToLaplace(double x) {
        final double h = 0.05;
        double y = 0;
        while ((Math.pow(x, 2) + Math.pow(y, 2)) < 1) {
            int k = (int) (Math.random() * 10);
            if ((k == 0) || (k == 4)) {
                x += h;
            } else if ((k == 1) || (k == 5)) {
                y += h;
            } else if ((k == 2) || (k == 6)) {
                x -= h;
            } else if ((k == 3) || (k == 7)) {
                y -= h;
            } else if ((k == 8) || (k == 9)) {
                x = x;
                y = y;
            }
        }
        return new double[]{x, y};
    }

    public void LaplaceWithMonteCarlo() {
        ArrayList<Double> uValues = new ArrayList<>();
        ArrayList<Double> uMeanValues = new ArrayList<>();
        ArrayList<Double> uMeanSqrValues = new ArrayList<>();
        ArrayList<Double> uSqrValues = new ArrayList<>();
        ArrayList<Double> x0Values = new ArrayList<>();
        int n = 9000;
        for (int i = 1; i < 20; i++) {
            x0Values.add((double) ((int) Math.round(0.05 * i * 100)) / 100);
        }
        for (int j = 0; j < 19; j++) {
            for (int i = 0; i < n; i++) {
                double[] xy = bordToLaplace(x0Values.get(j));
                double x = xy[0];
                double y = xy[1];
                uValues.add(Math.abs(Math.sin(Math.atan2(y, x))));
                uSqrValues.add(Math.pow(Math.abs(Math.sin(Math.atan2(y, x))), 2));
            }
            double sum1 = 0;
            for (Double uValue : uValues) {
                sum1 += uValue;
            }
            uMeanValues.add(sum1 / uValues.size());
            uValues.clear();
            double sum2 = 0;
            for (Double uSqrValue : uSqrValues) {
                sum2 += uSqrValue;
            }
            uMeanSqrValues.add(sum2 / uSqrValues.size());
            uSqrValues.clear();
            System.out.println("U(" + x0Values.get(j) + ", 0) = (" + (double) ((int) Math.round(uMeanValues.get(j) * 1000000)) / 1000000 + "  ±  " + (double) ((int) Math.round(Math.sqrt(Math.pow(uMeanSqrValues.get(j) - uMeanValues.get(j), 2) / n) * 1000000)) / 1000000 + ")");
        }
    }

    public double f(double t, double x) {
        return (Math.abs(Math.sin(t)) * (1 - Math.pow(x, 2))) / (1 - 2 * x * Math.cos(t) + Math.pow(x, 2));
    }

    public double exchangeBord(double a, double b) {
        return a + (b - a) * Math.random();
    }

    public void analyticalMonteCarloMethod(int n) {
        double sumValuesFunction = 0;
        double sumValuesSqrFunction = 0;
        ArrayList<Double> xValues = new ArrayList<>();
        for (int i = 1; i < 20; i++) {
            xValues.add((double) ((int) Math.round(0.05 * i * 100)) / 100);
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < n; j++) {
                double t = exchangeBord(0, 2 * Math.PI);
                sumValuesFunction += f(t, xValues.get(i));
                sumValuesSqrFunction += Math.pow(f(t, xValues.get(i)), 2);
            }
            double cube = 2 * Math.PI;
            double integral = cube * sumValuesFunction / n;
            double mistake = 3 * cube * Math.pow(sumValuesSqrFunction / n - Math.pow(sumValuesFunction / n, 2) / n, 2);
            System.out.println("U(" + xValues.get(i) + ", 0) = (" + (double) ((int) Math.round(integral / (2 * Math.PI) * 1000000)) / 1000000 + "  ±  " + (double) ((int) Math.round(mistake * 1000000)) / 1000000 + ")");
            integral = 0;
            mistake = 0;
            sumValuesFunction = 0;
            sumValuesSqrFunction = 0;
        }
    }
}
