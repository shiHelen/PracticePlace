package ru.ssau.tk.oop.task0;

public class MainClass {
    public static void main(String[] args) {
        Point firstPoint = new Point(1, 1, 1);
        Point secondPoint = new Point(2, 2, 2);
        Point thirdPoint = new Point(3, 3, 3);
        Point fourthPoint = new Point(4, 4, 4);

        Point sumPoints = Points.sum(firstPoint, secondPoint);
        Point subtractPoint = Points.subtract(thirdPoint, firstPoint);
        Point multiplyPoint = Points.multiply(fourthPoint, secondPoint);
        Point dividePoint = Points.divide(thirdPoint, firstPoint);
        System.out.println(sumPoints.x);
        System.out.println(sumPoints.y);
        System.out.println(sumPoints.z);
        System.out.println(" ");
        System.out.println(subtractPoint.x);
        System.out.println(subtractPoint.y);
        System.out.println(subtractPoint.z);
        System.out.println(" ");
        System.out.println(multiplyPoint.x);
        System.out.println(multiplyPoint.y);
        System.out.println(multiplyPoint.z);
        System.out.println(" ");
        System.out.println(dividePoint.x);
        System.out.println(dividePoint.y);
        System.out.println(dividePoint.z);
    }
}
