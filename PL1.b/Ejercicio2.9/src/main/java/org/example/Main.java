package org.example;
public class Main {
    public static void main(String[] args) {

        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        MyTriangle t2 = new MyTriangle(
                new MyPoint(0,0),
                new MyPoint(2,0),
                new MyPoint(1,Math.sqrt(3))
        );

        System.out.println("Triángulo 1: " + t1);
        System.out.println("Perímetro: " + t1.getPerimeter());
        System.out.println("Tipo: " + t1.getType());

        System.out.println();

        System.out.println("Triángulo 2: " + t2);
        System.out.println("Perímetro: " + t2.getPerimeter());
        System.out.println("Tipo: " + t2.getType());

        System.out.println(t2.toString());
    }
}

