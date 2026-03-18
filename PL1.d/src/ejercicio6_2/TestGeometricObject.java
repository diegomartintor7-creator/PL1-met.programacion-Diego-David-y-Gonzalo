package ejercicio6_2;

public class TestGeometricObject {
    public static void main(String[] args) {

        GeometricObject g1 = new Circle(5.0); // polimorfismo: interfaz -> Circle
        GeometricObject g2 = new Rectangle(2.0, 4.0); // polimorfismo: interfaz -> Rectangle

        System.out.println(g1); // Circle.toString()
        System.out.println(g1.getArea()); // Circle
        System.out.println(g1.getPerimeter()); // Circle

        System.out.println(g2); // Rectangle.toString()
        System.out.println(g2.getArea()); // Rectangle
        System.out.println(g2.getPerimeter()); // Rectangle

        // Las interfaces definen un contrato que obliga a implementar ciertos métodos
        // Permiten polimorfismo sin necesidad de herencia directa entre clases
    }
}