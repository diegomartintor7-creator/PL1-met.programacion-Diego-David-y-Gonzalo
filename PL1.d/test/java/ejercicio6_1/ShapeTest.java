package ejercicio6_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    // ─────────────────────────────────────────────
    // Shape (a través de Circle, que es concreta)
    // ─────────────────────────────────────────────

    @Test
    void shapeDefaultConstructor() {
        Circle c = new Circle();           // usa Shape()
        assertEquals("red", c.getColor());
        assertTrue(c.isFilled());
    }

    @Test
    void shapeSetColor() {
        Circle c = new Circle();
        c.setColor("blue");
        assertEquals("blue", c.getColor());
    }

    @Test
    void shapeSetFilled() {
        Circle c = new Circle();
        c.setFilled(false);
        assertFalse(c.isFilled());
    }

    @Test
    void shapeToString() {
        Circle c = new Circle(1.0, "red", true);
        assertTrue(c.toString().contains("Shape[color=red,filled=true]"));
    }

    // ─────────────────────────────────────────────
    // Circle
    // ─────────────────────────────────────────────

    @Test
    void circleDefaultConstructor() {
        Circle c = new Circle();
        assertEquals(1.0, c.getRadius());
    }

    @Test
    void circleRadiusConstructor() {
        Circle c = new Circle(5.5);
        assertEquals(5.5, c.getRadius());
    }

    @Test
    void circleFullConstructor() {
        Circle c = new Circle(5.5, "red", false);
        assertEquals(5.5, c.getRadius());
        assertEquals("red", c.getColor());
        assertFalse(c.isFilled());
    }

    @Test
    void circleSetRadius() {
        Circle c = new Circle();
        c.setRadius(3.0);
        assertEquals(3.0, c.getRadius());
    }

    @Test
    void circleGetArea() {
        Circle c = new Circle(5.5, "red", false);
        assertEquals(Math.PI * 5.5 * 5.5, c.getArea(), 1e-9);
    }

    @Test
    void circleGetPerimeter() {
        Circle c = new Circle(5.5, "red", false);
        assertEquals(2 * Math.PI * 5.5, c.getPerimeter(), 1e-9);
    }

    @Test
    void circleToString() {
        Circle c = new Circle(5.5, "red", false);
        assertEquals("Circle[Shape[color=red,filled=false],radius=5.5]", c.toString());
    }

    @Test
    void circlePolymorphism() {
        Shape s = new Circle(5.5, "red", false);
        assertEquals(Math.PI * 5.5 * 5.5, s.getArea(), 1e-9);
        assertEquals(2 * Math.PI * 5.5, s.getPerimeter(), 1e-9);
        assertEquals("red", s.getColor());
        assertFalse(s.isFilled());

        Circle c = (Circle) s;
        assertEquals(5.5, c.getRadius());
    }

    // ─────────────────────────────────────────────
    // Rectangle
    // ─────────────────────────────────────────────

    @Test
    void rectangleDefaultConstructor() {
        Rectangle r = new Rectangle();
        assertEquals(1.0, r.getWidth());
        assertEquals(1.0, r.getLength());
    }

    @Test
    void rectangleTwoArgConstructor() {
        Rectangle r = new Rectangle(1.0, 2.0);
        assertEquals(1.0, r.getWidth());
        assertEquals(2.0, r.getLength());
    }

    @Test
    void rectangleFullConstructor() {
        Rectangle r = new Rectangle(1.0, 2.0, "red", false);
        assertEquals(1.0, r.getWidth());
        assertEquals(2.0, r.getLength());
        assertEquals("red", r.getColor());
        assertFalse(r.isFilled());
    }

    @Test
    void rectangleSetWidth() {
        Rectangle r = new Rectangle();
        r.setWidth(4.0);
        assertEquals(4.0, r.getWidth());
    }

    @Test
    void rectangleSetLength() {
        Rectangle r = new Rectangle();
        r.setLength(7.0);
        assertEquals(7.0, r.getLength());
    }

    @Test
    void rectangleGetArea() {
        Rectangle r = new Rectangle(1.0, 2.0, "red", false);
        assertEquals(2.0, r.getArea(), 1e-9);
    }

    @Test
    void rectangleGetPerimeter() {
        Rectangle r = new Rectangle(1.0, 2.0, "red", false);
        assertEquals(6.0, r.getPerimeter(), 1e-9);
    }

    @Test
    void rectangleToString() {
        Rectangle r = new Rectangle(1.0, 2.0, "red", false);
        assertEquals("Rectangle[Shape[color=red,filled=false],width=1.0,length=2.0]", r.toString());
    }

    @Test
    void rectanglePolymorphism() {
        Shape s = new Rectangle(1.0, 2.0, "red", false);
        assertEquals(2.0, s.getArea(), 1e-9);
        assertEquals("red", s.getColor());

        Rectangle r = (Rectangle) s;
        assertEquals(2.0, r.getLength());
    }

    // ─────────────────────────────────────────────
    // Square
    // ─────────────────────────────────────────────

    @Test
    void squareDefaultConstructor() {
        Square sq = new Square();
        assertEquals(1.0, sq.getSide());
        assertEquals(1.0, sq.getWidth());
        assertEquals(1.0, sq.getLength());
    }

    @Test
    void squareSideConstructor() {
        Square sq = new Square(6.6);
        assertEquals(6.6, sq.getSide());
    }

    @Test
    void squareFullConstructor() {
        Square sq = new Square(6.6, "green", true);
        assertEquals(6.6, sq.getSide());
        assertEquals("green", sq.getColor());
        assertTrue(sq.isFilled());
    }

    @Test
    void squareSetSideKeepsBothDimensions() {
        Square sq = new Square(3.0);
        sq.setSide(5.0);
        assertEquals(5.0, sq.getSide());
        assertEquals(5.0, sq.getWidth());
        assertEquals(5.0, sq.getLength());
    }

    @Test
    void squareSetWidthKeepsBothDimensions() {
        Square sq = new Square(3.0);
        sq.setWidth(8.0);
        assertEquals(8.0, sq.getWidth());
        assertEquals(8.0, sq.getLength());
    }

    @Test
    void squareSetLengthKeepsBothDimensions() {
        Square sq = new Square(3.0);
        sq.setLength(9.0);
        assertEquals(9.0, sq.getWidth());
        assertEquals(9.0, sq.getLength());
    }

    @Test
    void squareGetArea() {
        Square sq = new Square(6.6);
        assertEquals(6.6 * 6.6, sq.getArea(), 1e-9);
    }

    @Test
    void squareGetPerimeter() {
        Square sq = new Square(6.6);
        assertEquals(4 * 6.6, sq.getPerimeter(), 1e-9);
    }

    @Test
    void squareToString() {
        Square sq = new Square(6.6);
        // Square hereda color "red" y filled true del constructor Shape por defecto
        assertEquals(
                "Square[Rectangle[Shape[color=red,filled=true],width=6.6,length=6.6]]",
                sq.toString()
        );
    }

    @Test
    void squarePolymorphismAsShape() {
        Shape s = new Square(6.6);
        assertEquals(6.6 * 6.6, s.getArea(), 1e-9);
        assertEquals("red", s.getColor());
    }

    @Test
    void squarePolymorphismAsRectangle() {
        Rectangle r = (Rectangle) new Square(6.6);
        assertEquals(6.6 * 6.6, r.getArea(), 1e-9);
        assertEquals(6.6, r.getLength());
    }

    @Test
    void squareDowncastFromRectangle() {
        Rectangle r = new Square(6.6);
        Square sq = (Square) r;
        assertEquals(6.6, sq.getSide());
        assertEquals(6.6, sq.getLength());
    }
}