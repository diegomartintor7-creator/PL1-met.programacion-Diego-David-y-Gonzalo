package org.example;

public class Main{
    public static void main(String[] args) {

        // 🔹 Test constructor con coordenadas
        MyLine line1 = new MyLine(1, 2, 4, 6);
        System.out.println("Line1: " + line1);

        // 🔹 Test getters de puntos
        System.out.println("Begin: " + line1.getBegin());
        System.out.println("End: " + line1.getEnd());

        // 🔹 Test getters de coordenadas
        System.out.println("BeginX: " + line1.getBeginX());
        System.out.println("BeginY: " + line1.getBeginY());
        System.out.println("EndX: " + line1.getEndX());
        System.out.println("EndY: " + line1.getEndY());

        // 🔹 Test setters de coordenadas
        line1.setBeginX(10);
        line1.setBeginY(20);
        line1.setEndX(30);
        line1.setEndY(40);
        System.out.println("Después de cambiar coordenadas: " + line1);

        // 🔹 Test setBegin y setEnd con MyPoint
        MyPoint p1 = new MyPoint(5, 5);
        MyPoint p2 = new MyPoint(15, 15);
        line1.setBegin(p1);
        line1.setEnd(p2);
        System.out.println("Después de setBegin y setEnd: " + line1);

        // 🔹 Test getBeginXY y getEndXY
        int[] beginXY = line1.getBeginXY();
        int[] endXY = line1.getEndXY();
        System.out.println("BeginXY: (" + beginXY[0] + ", " + beginXY[1] + ")");
        System.out.println("EndXY: (" + endXY[0] + ", " + endXY[1] + ")");

        // 🔹 Test setBeginXY y setEndXY
        line1.setBeginXY(2, 3);
        line1.setEndXY(8, 9);
        System.out.println("Después de setBeginXY/setEndXY: " + line1);

        // 🔹 Test length (usa distance de MyPoint)
        System.out.println("Longitud de la línea: " + line1.getLength());

        // 🔹 Test gradient
        System.out.println("Gradiente (radianes): " + line1.getGradient());

        // 🔹 Test segundo constructor (con MyPoint)
        MyLine line2 = new MyLine(new MyPoint(0, 0), new MyPoint(3, 4));
        System.out.println("Line2: " + line2);
        System.out.println("Longitud Line2: " + line2.getLength()); // debería ser 5.0
    }
}