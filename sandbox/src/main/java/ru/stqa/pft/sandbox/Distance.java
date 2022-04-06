package ru.stqa.pft.sandbox;

public class Distance {
    public static void main(String[] args) {
       Point A= new Point(1,2);
       Point B= new Point(1,2);

        System.out.println("Расстояние между точками A и B = " + Point.distance(A,B));

    }

}