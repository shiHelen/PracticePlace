package ru.ssau.tk.oop.task0;

public class MainClass {
    public static void main(String[] args) {
        Point firstPoint = new Point(1, 1, 1);
        Point secondPoint = new Point(2, 2, 2);
        Point thirdPoint = new Point(3, 3, 3);
        Point fourthPoint = new Point(4, 4, 4);

        double resPoint = Points.length(thirdPoint);
        System.out.println(resPoint);
    }
}
