package ru.stqa.pft.sandbox;

public class Point {
    public double X;
    public double Y;

    public Point(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public static double distance(Point A, Point B) {
        return Math.sqrt((B.X - A.X) * (B.X - A.X) + (B.Y - A.Y) * (B.Y - A.Y));

    }
}


