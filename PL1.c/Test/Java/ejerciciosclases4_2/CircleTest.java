package ejerciciosclases4_2;

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle(2.5, "blue");
        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        c.setRadius(3.0);
        c.setColor("green");
        System.out.println(c);

        Circle.Cylinder cyl = new Circle.Cylinder(2.0, "red", 5.0);
        System.out.println(cyl);
        System.out.println("Volume: " + cyl.getVolume());
        cyl.setRadius(2.5);
        cyl.setHeight(6.0);
        cyl.setColor("yellow");
        System.out.println(cyl);
        System.out.println("Radius: " + cyl.getRadius());
        System.out.println("Color: " + cyl.getColor());
    }
}