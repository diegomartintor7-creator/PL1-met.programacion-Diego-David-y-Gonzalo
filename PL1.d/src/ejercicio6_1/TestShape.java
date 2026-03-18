package ejercicio6_1;

public class TestShape {
    public static void main(String[] args) {

        Shape s1 = new Circle(5.5, "red", false); // polimorfismo: referencia Shape, objeto Circle
        System.out.println(s1); // Circle.toString()
        System.out.println(s1.getArea()); // método de Circle
        System.out.println(s1.getPerimeter()); // método de Circle
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());

        Circle c1 = (Circle) s1; // downcasting válido porque el objeto real es Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        Shape s3 = new Rectangle(1.0, 2.0, "red", false); // polimorfismo
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());

        Rectangle r1 = (Rectangle) s3; // downcasting válido
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // polimorfismo: objeto real Square
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        Rectangle r2 = (Rectangle) s4; // downcasting a superclase intermedia válido
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getLength());

        Square sq1 = (Square) r2; // downcasting al tipo real
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

        // Las clases abstractas sirven para definir una base común y no pueden instanciarse directamente
        // Los métodos abstractos obligan a las subclases a implementar su comportamiento y permiten el polimorfismo
    }
}