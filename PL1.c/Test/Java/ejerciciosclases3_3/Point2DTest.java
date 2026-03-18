package ejerciciosclases3_3;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D p2d = new Point2D(1.5f, 2.5f);
        System.out.println(p2d);
        p2d.setX(3.0f);
        p2d.setY(4.0f);
        System.out.println(p2d);
        p2d.setXY(5.0f, 6.0f);
        System.out.println(p2d);

        Point2D.Point3D p3d = new Point2D.Point3D(7.0f, 8.0f, 9.0f);
        System.out.println(p3d);
        p3d.setZ(10.0f);
        System.out.println(p3d);
        p3d.setXYZ(11.0f, 12.0f, 13.0f);
        System.out.println(p3d);
    }
}