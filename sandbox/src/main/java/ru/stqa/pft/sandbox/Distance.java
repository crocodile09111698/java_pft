package ru.stqa.pft.sandbox;

public class Distance {
    public static void main(String[] args) {
       Point A= new Point(3,5);
       Point B= new Point(6,5);
        System.out.println("Расстояние между точками A и B = " + distance(A,B));

    }

    public  static double distance(Point A,Point B) {
        return Math.sqrt((B.X - A.X) * (B.X - A.X) + (B.Y - A.Y) * (B.Y - A.Y) );
    }
}