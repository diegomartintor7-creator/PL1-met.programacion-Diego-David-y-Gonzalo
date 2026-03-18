package ejercicio6_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GeometricObjectTest {

    // ─────────────────────────────────────────────
    // Circle
    // ─────────────────────────────────────────────

    @Test
    void circleGetArea() {
        Circle c = new Circle(5.0);
        assertEquals(Math.PI * 5.0 * 5.0, c.getArea(), 1e-9);
    }

    @Test
    void circleGetPerimeter() {
        Circle c = new Circle(5.0);
        assertEquals(2 * Math.PI * 5.0, c.getPerimeter(), 1e-9);
    }

    @Test
    void circleToString() {
        Circle c = new Circle(5.0);
        assertEquals("Circle[radius=5.0]", c.toString());
    }

    @Test
    void circlePolymorphism() {
        GeometricObject g = new Circle(5.0);
        assertEquals(Math.PI * 5.0 * 5.0, g.getArea(), 1e-9);
        assertEquals(2 * Math.PI * 5.0, g.getPerimeter(), 1e-9);
    }

    // ─────────────────────────────────────────────
    // Rectangle
    // ─────────────────────────────────────────────

    @Test
    void rectangleGetArea() {
        Rectangle r = new Rectangle(2.0, 4.0);
        assertEquals(8.0, r.getArea(), 1e-9);
    }

    @Test
    void rectangleGetPerimeter() {
        Rectangle r = new Rectangle(2.0, 4.0);
        assertEquals(12.0, r.getPerimeter(), 1e-9);
    }

    @Test
    void rectangleToString() {
        Rectangle r = new Rectangle(2.0, 4.0);
        assertEquals("Rectangle[width=2.0,length=4.0]", r.toString());
    }

    @Test
    void rectanglePolymorphism() {
        GeometricObject g = new Rectangle(2.0, 4.0);
        assertEquals(8.0, g.getArea(), 1e-9);
        assertEquals(12.0, g.getPerimeter(), 1e-9);
    }
}