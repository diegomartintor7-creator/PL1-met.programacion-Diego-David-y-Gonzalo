package org.example;

public class Main {
    public static void main(String[] args) {

        // Crear array de 10 puntos
        MyPoint[] puntos = new MyPoint[10];

        // Inicializar: (1,1), (2,2), ..., (10,10)
        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = new MyPoint(i + 1, i + 1);
        }

        // Mostrar matriz de distancias
        System.out.println("Matriz de distancias:");

        for (int i = 0; i < puntos.length; i++) {
            for (int j = 0; j < puntos.length; j++) {
                // Usamos distance(MyPoint another)
                double distancia = puntos[i].distance(puntos[j]);

                // Formateo para que quede tipo matriz
                System.out.printf("%8.2f", distancia);
            }
            System.out.println();
        }
    }
}