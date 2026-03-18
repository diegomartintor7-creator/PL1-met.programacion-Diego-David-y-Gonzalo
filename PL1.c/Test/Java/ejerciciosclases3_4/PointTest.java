package ejerciciosclases3_4;

public class PointTest {
    public static void main(String[] args) {
        Point p = new Point(2.5f, 3.5f);
        System.out.println(p);
        p.setX(4.0f);
        p.setY(5.0f);
        System.out.println(p);
        p.setXY(6.0f, 7.0f);
        System.out.println(p);

        Point.MovablePoint mp = new Point.MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println(mp);
        mp.setSpeed(1.0f, 1.5f);
        System.out.println(mp);
        mp.move();
        System.out.println(mp);
        mp.move();
        System.out.println(mp);
    }
}