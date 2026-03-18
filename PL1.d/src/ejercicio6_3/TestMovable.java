package ejercicio6_3;

public class TestMovable {

    public static void main(String[] args) {

        MovablePoint p1 = new MovablePoint(5, 5, 2, 3);

        System.out.println(p1);

        p1.moveUp();
        System.out.println(p1);

        p1.moveDown();
        System.out.println(p1);

        p1.moveLeft();
        System.out.println(p1);

        p1.moveRight();
        System.out.println(p1);
    }
}