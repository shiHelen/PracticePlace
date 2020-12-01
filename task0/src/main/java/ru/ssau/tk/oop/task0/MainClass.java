package ru.ssau.tk.oop.task0;

public class MainClass {
    public static void main(String[] args) {
//        Point firstPoint = new Point(1, 1, 1);
//        Point secondPoint = new Point(2, 2, 2);
//        Point thirdPoint = new Point(3, 3, 3);
//        Point fourthPoint = new Point(4, 4, 4);
//
//        double scalar = Points.scalarProduct(thirdPoint, fourthPoint);
//        Point othPoint = Points.vectorProduct(secondPoint, firstPoint);
//        System.out.println(scalar);
//        System.out.println(othPoint.x);
//        System.out.println(othPoint.y);
//        System.out.println(othPoint.z);
        LaplaceEquation check = new LaplaceEquation();
        System.out.println("Результат численного метода");
        check.LaplaceWithMonteCarlo();
        System.out.println("Результат аналитического метода");
        check.analyticalMonteCarloMethod(1000000);
    }
}
