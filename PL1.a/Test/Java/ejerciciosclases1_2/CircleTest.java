package ejerciciosclases1_2;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Circumference: " + c1.getCircumference());

        Circle c2 = new Circle(2.5);
        System.out.println(c2);
        System.out.println("Area: " + c2.getArea());
        System.out.println("Circumference: " + c2.getCircumference());

        c2.setRadius(3.0);
        System.out.println(c2);
        System.out.println("Area: " + c2.getArea());
    }
}