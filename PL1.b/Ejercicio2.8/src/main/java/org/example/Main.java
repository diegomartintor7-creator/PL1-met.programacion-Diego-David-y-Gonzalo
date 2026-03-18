package org.example;

public class Main {
    public static void main(String[] args) {

        // Crear círculos
        MyCircle c1 = new MyCircle(); // por defecto
        MyCircle c2 = new MyCircle(3, 4, 5);
        MyCircle c3 = new MyCircle(new MyPoint(1, 2), 3);

        // Mostrar círculos
        System.out.println("Círculo 1: " + c1);
        System.out.println("Círculo 2: " + c2);
        System.out.println("Círculo 3: " + c3);

        // Probar getters
        System.out.println("\nRadio c2: " + c2.getRadius());
        System.out.println("Centro X c2: " + c2.getCenterX());
        System.out.println("Centro Y c2: " + c2.getCenterY());

        // Probar getCenterXY
        int[] coords = c2.getCenterXY();
        System.out.println("Centro XY c2: (" + coords[0] + ", " + coords[1] + ")");

        // Probar setters
        c1.setRadius(10);
        c1.setCenterX(7);
        c1.setCenterY(8);
        System.out.println("\nCírculo 1 modificado: " + c1);

        // Probar setCenterXY
        c3.setCenterXY(9, 9);
        System.out.println("Círculo 3 modificado: " + c3);

        // Área y circunferencia
        System.out.println("\nÁrea c2: " + c2.getArea());
        System.out.println("Circunferencia c2: " + c2.getCircumference());

        // Distancia entre círculos
        System.out.println("\nDistancia entre c2 y c3: " + c2.distance(c3));
    }
}
