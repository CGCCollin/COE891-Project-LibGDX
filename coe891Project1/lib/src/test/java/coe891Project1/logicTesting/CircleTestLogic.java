package coe891Project1.logicTesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.badlogic.gdx.math.Circle;

public class CircleTestLogic {
    private static final Object Object = null;

	@Test
    public void testContains_True_WhenPointInside() {
        Circle c = new Circle(0f, 0f, 5f);

        assertTrue(c.contains(1f, 1f));
    }

    @Test
    public void testContains_True_WhenPointOnBoundary() {
        Circle c = new Circle(0f, 0f, 5f);

        // 3^2 + 4^2 = 25 = 5^2
        assertTrue(c.contains(3f, 4f));
    }

    @Test
    public void testContains_False_WhenPointOutside() {
        Circle c = new Circle(0f, 0f, 5f);

        assertFalse(c.contains(6f, 0f));
    }

    // -----------------------------
    // equals(Object o)
    // Paths:
    // 1) o == this -> true
    // 2) o == null -> false
    // 3) wrong class -> false
    // 4) same x,y,radius -> true
    // 5) one differing field -> false
    // -----------------------------

    @Test
    public void testEquals_True_WhenSameReference() {
        Circle c = new Circle(1f, 2f, 3f);

        assertTrue(c.equals(c));
    }

    @Test
    public void testEquals_False_WhenNull() {
        Circle c = new Circle(1f, 2f, 3f);

        assertFalse(c.equals(null));
    }

    @Test
    public void testEquals_False_WhenDifferentClass() {
        Circle c = new Circle(1f, 2f, 3f);

        assertFalse(c.equals("string"));
    }

    @Test
    public void testEquals_True_WhenSameValues() {
        Circle c1 = new Circle(1f, 2f, 3f);
        Circle c2 = new Circle(1f, 2f, 3f);

        assertTrue(c1.equals(c2));
    }

    @Test
    public void testEquals_False_WhenDifferentX() {
        Circle c1 = new Circle(1f, 2f, 3f);
        Circle c2 = new Circle(9f, 2f, 3f);

        assertFalse(c1.equals(c2));
    }

    @Test
    public void testEquals_False_WhenDifferentY() {
        Circle c1 = new Circle(1f, 2f, 3f);
        Circle c2 = new Circle(1f, 9f, 3f);

        assertFalse(c1.equals(c2));
    }

    @Test
    public void testEquals_False_WhenDifferentRadius() {
        Circle c1 = new Circle(1f, 2f, 3f);
        Circle c2 = new Circle(1f, 2f, 9f);

        assertFalse(c1.equals(c2));
    }
}
