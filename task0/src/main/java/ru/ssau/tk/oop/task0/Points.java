package ru.ssau.tk.oop.task0;

public class Points {
    private Points() {
    }

    public static Point sum(Point t1, Point t2) {
        return new Point(t1.x + t2.x, t1.y + t2.y, t1.z + t2.z);
    }

    public static Point subtract(Point t1, Point t2) {
        return new Point(t1.x - t2.x, t1.y - t2.y, t1.z - t2.z);
    }

    public static Point multiply(Point t1, Point t2) {
        return new Point(t1.x * t2.x, t1.y * t2.y, t1.z * t2.z);
    }

    public static Point divide(Point t1, Point t2) {
        return new Point(t1.x / t2.x, t1.y / t2.y, t1.z / t2.z);
    }

    public static Point enlarge(Point p, double k) {
        return new Point(p.x * k, p.y * k, p.z * k);
    }

    public static double length(Point p) {
        return p.length(p);
    }

    public static Point opposite(Point p) {
        return new Point(-1 * p.x, -1 * p.y, -1 * p.z);
    }

    public static Point inverse(Point p) {
        return new Point(1 / p.x, 1 / p.y, 1 / p.z);
    }

    public static double scalarProduct(Point p1, Point p2) {
        return p1.x * p2.x + p1.y * p2.y + p1.z * p2.z;
    }

    public static Point vectorProduct(Point p1, Point p2) {
        double newX = p1.y * p2.z - p2.y * p1.z;
        double newY = p1.x * p2.z - p2.x * p1.z;
        double newZ = p1.x * p2.y - p2.x * p1.y;
        return new Point(1 * newX, -1 * newY, 1 * newZ);
    }
}
