package ru.ssau.tk.oop.task0;

public class MainClass {
    public static void main(String[] args) {
        Point firstPoint = new Point(1, 1, 1);
        Point secondPoint = new Point(2, 2, 2);
        Point thirdPoint = new Point(3, 3, 3);
        Point fourthPoint = new Point(4, 4, 4);

        Point resPoint = Points.opposite(thirdPoint);
        Point othPoint = Points.inverse(secondPoint);
        System.out.println(resPoint.x);
        System.out.println(resPoint.y);
        System.out.println(resPoint.z);
        System.out.println(othPoint.x);
        System.out.println(othPoint.y);
        System.out.println(othPoint.z);
    }
}
