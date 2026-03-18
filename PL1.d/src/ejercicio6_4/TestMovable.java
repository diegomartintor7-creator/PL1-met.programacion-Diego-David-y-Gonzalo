package ejercicio6_4;

public class TestMovable {
    public static void main(String[] args) {

        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        System.out.println(p);

        p.moveUp();
        p.moveRight();
        System.out.println(p);

        MovableCircle c = new MovableCircle(5, 5, 1, 1, 10);
        System.out.println(c);

        c.moveLeft();
        c.moveDown();
        System.out.println(c);
    }
}