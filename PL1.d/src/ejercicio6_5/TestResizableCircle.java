package ejercicio6_5;

public class TestResizableCircle {
    public static void main(String[] args) {

        ResizableCircle rc = new ResizableCircle(10.0);
        System.out.println(rc);

        rc.resize(50); // reduce al 50%
        System.out.println("After resize: " + rc);
    }
}