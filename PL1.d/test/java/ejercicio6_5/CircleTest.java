package ejercicio6_5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    // ─────────────────────────────────────────────
    // Circle
    // ─────────────────────────────────────────────

    @Test
    void circleToString() {
        Circle c = new Circle(5.0);
        assertEquals("Circle[radius=5.0]", c.toString());
    }

    @Test
    void circleGetPerimeter() {
        Circle c = new Circle(5.0);
        assertEquals(2 * Math.PI * 5.0, c.getPerimeter(), 1e-9);
    }

    @Test
    void circleGetArea() {
        Circle c = new Circle(5.0);
        assertEquals(Math.PI * 5.0 * 5.0, c.getArea(), 1e-9);
    }

    @Test
    void circlePolymorphismAsGeometricObject() {
        GeometricObject g = new Circle(5.0);
        assertEquals(2 * Math.PI * 5.0, g.getPerimeter(), 1e-9);
        assertEquals(Math.PI * 5.0 * 5.0, g.getArea(), 1e-9);
    }

    // ─────────────────────────────────────────────
    // ResizableCircle
    // ─────────────────────────────────────────────

    @Test
    void resizableCircleToString() {
        ResizableCircle rc = new ResizableCircle(10.0);
        assertEquals("ResizableCircle[Circle[radius=10.0]]", rc.toString());
    }

    @Test
    void resizableCircleResize50() {
        ResizableCircle rc = new ResizableCircle(10.0);
        rc.resize(50);
        assertEquals("ResizableCircle[Circle[radius=5.0]]", rc.toString());
    }

    @Test
    void resizableCircleResize200() {
        ResizableCircle rc = new ResizableCircle(10.0);
        rc.resize(200);
        assertEquals(20.0, rc.radius, 1e-9);
    }

    @Test
    void resizableCircleGetAreaAfterResize() {
        ResizableCircle rc = new ResizableCircle(10.0);
        rc.resize(50);
        assertEquals(Math.PI * 5.0 * 5.0, rc.getArea(), 1e-9);
    }

    @Test
    void resizableCircleGetPerimeterAfterResize() {
        ResizableCircle rc = new ResizableCircle(10.0);
        rc.resize(50);
        assertEquals(2 * Math.PI * 5.0, rc.getPerimeter(), 1e-9);
    }

    @Test
    void resizableCirclePolymorphismAsGeometricObject() {
        GeometricObject g = new ResizableCircle(10.0);
        assertEquals(Math.PI * 10.0 * 10.0, g.getArea(), 1e-9);
        assertEquals(2 * Math.PI * 10.0, g.getPerimeter(), 1e-9);
    }

    @Test
    void resizableCirclePolymorphismAsResizable() {
        Resizable r = new ResizableCircle(10.0);
        r.resize(50);
        assertEquals("ResizableCircle[Circle[radius=5.0]]", r.toString());
    }
}