package ejercicio6_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovableTest {

    // ─────────────────────────────────────────────
    // MovablePoint
    // ─────────────────────────────────────────────

    @Test
    void pointConstructorAndToString() {
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        assertEquals("(0,0),speed=(2,3)", p.toString());
    }

    @Test
    void pointMoveUp() {
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        p.moveUp();
        assertEquals("(0,3),speed=(2,3)", p.toString());
    }

    @Test
    void pointMoveDown() {
        MovablePoint p = new MovablePoint(0, 3, 2, 3);
        p.moveDown();
        assertEquals("(0,0),speed=(2,3)", p.toString());
    }

    @Test
    void pointMoveLeft() {
        MovablePoint p = new MovablePoint(2, 0, 2, 3);
        p.moveLeft();
        assertEquals("(0,0),speed=(2,3)", p.toString());
    }

    @Test
    void pointMoveRight() {
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        p.moveRight();
        assertEquals("(2,0),speed=(2,3)", p.toString());
    }

    @Test
    void pointMoveUpAndRight() {
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        p.moveUp();
        p.moveRight();
        assertEquals("(2,3),speed=(2,3)", p.toString());
    }

    @Test
    void pointPolymorphism() {
        Movable m = new MovablePoint(0, 0, 2, 3);
        m.moveUp();
        m.moveRight();
        m.moveDown();
        m.moveLeft();
        assertEquals("(0,0),speed=(2,3)", m.toString());
    }

    // ─────────────────────────────────────────────
    // MovableCircle
    // ─────────────────────────────────────────────

    @Test
    void circleConstructorAndToString() {
        MovableCircle c = new MovableCircle(5, 5, 1, 1, 10);
        assertEquals("(5,5),speed=(1,1),radius=10", c.toString());
    }

    @Test
    void circleMoveUp() {
        MovableCircle c = new MovableCircle(5, 5, 1, 1, 10);
        c.moveUp();
        assertEquals("(5,6),speed=(1,1),radius=10", c.toString());
    }

    @Test
    void circleMoveDown() {
        MovableCircle c = new MovableCircle(5, 5, 1, 1, 10);
        c.moveDown();
        assertEquals("(5,4),speed=(1,1),radius=10", c.toString());
    }

    @Test
    void circleMoveLeft() {
        MovableCircle c = new MovableCircle(5, 5, 1, 1, 10);
        c.moveLeft();
        assertEquals("(4,5),speed=(1,1),radius=10", c.toString());
    }

    @Test
    void circleMoveRight() {
        MovableCircle c = new MovableCircle(5, 5, 1, 1, 10);
        c.moveRight();
        assertEquals("(6,5),speed=(1,1),radius=10", c.toString());
    }

    @Test
    void circleMoveLeftAndDown() {
        MovableCircle c = new MovableCircle(5, 5, 1, 1, 10);
        c.moveLeft();
        c.moveDown();
        assertEquals("(4,4),speed=(1,1),radius=10", c.toString());
    }

    @Test
    void circlePolymorphism() {
        Movable m = new MovableCircle(5, 5, 1, 1, 10);
        m.moveLeft();
        m.moveDown();
        m.moveRight();
        m.moveUp();
        assertEquals("(5,5),speed=(1,1),radius=10", m.toString());
    }
}