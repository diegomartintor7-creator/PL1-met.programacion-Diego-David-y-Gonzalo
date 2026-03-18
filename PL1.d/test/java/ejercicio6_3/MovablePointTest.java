package ejercicio6_3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void constructorAndToString() {
        MovablePoint p = new MovablePoint(5, 5, 2, 3);
        assertEquals("(5,5) speed=(2,3)", p.toString());
    }

    @Test
    void moveUp() {
        MovablePoint p = new MovablePoint(5, 5, 2, 3);
        p.moveUp();
        assertEquals("(5,2) speed=(2,3)", p.toString());
    }

    @Test
    void moveDown() {
        MovablePoint p = new MovablePoint(5, 2, 2, 3);
        p.moveDown();
        assertEquals("(5,5) speed=(2,3)", p.toString());
    }

    @Test
    void moveLeft() {
        MovablePoint p = new MovablePoint(5, 5, 2, 3);
        p.moveLeft();
        assertEquals("(3,5) speed=(2,3)", p.toString());
    }

    @Test
    void moveRight() {
        MovablePoint p = new MovablePoint(3, 5, 2, 3);
        p.moveRight();
        assertEquals("(5,5) speed=(2,3)", p.toString());
    }

    @Test
    void polymorphismViaMovable() {
        Movable m = new MovablePoint(5, 5, 2, 3);
        m.moveUp();
        m.moveDown();
        m.moveLeft();
        m.moveRight();
        assertEquals("(5,5) speed=(2,3)", m.toString());
    }
}