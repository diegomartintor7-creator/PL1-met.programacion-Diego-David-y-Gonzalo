package ejerciciosclases3_5;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s = new Shape("blue", false);
        System.out.println(s);
        s.setColor("green");
        s.setFilled(true);
        System.out.println(s);

        Shape.Circle c = new Shape.Circle(2.5, "yellow", true);
        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());
        c.setRadius(3.0);
        c.setColor("orange");
        System.out.println(c);

        Shape.Rectangle r = new Shape.Rectangle(2.0, 4.0, "purple", false);
        System.out.println(r);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
        r.setWidth(3.0);
        r.setLength(5.0);
        r.setFilled(true);
        System.out.println(r);

        Shape.Square sq = new Shape.Square(3.0, "pink", true);
        System.out.println(sq);
        System.out.println("Side: " + sq.getSide());
        System.out.println("Area: " + sq.getArea());
        sq.setSide(4.0);
        System.out.println(sq);
        sq.setWidth(5.0);
        System.out.println(sq);
    }
}