package coe891Project1.logicTesting;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;

public class CircleTestLogic {

	@Test
    public void testContains_True_WhenPointInside() {
        Circle c = new Circle(0, 0, 5);

        assertTrue(c.contains(1, 1));
    }

    @Test
    public void testContains_False_WhenPointOutside() {
        Circle c = new Circle(0, 0, 5);

        assertFalse(c.contains(6, 0));
    }

    @Test
    public void testEquals_True_WhenSameReference() {
        Circle c = new Circle(1, 2, 3);

        assertTrue(c.equals(c));
    }

    @Test
    public void testEquals_False_WhenNull() {
        Circle c = new Circle(1, 2, 3);

        assertFalse(c.equals(null));
    }

    @SuppressWarnings("unlikely-arg-type")
	@Test
    public void testEquals_False_WhenDifferentClass() {
        Circle c = new Circle(1, 2, 3);

        assertFalse(c.equals(new Rectangle(1, 2, 3, 4)));
    }

    @Test
    public void testEquals_True_WhenSameValues() {
        Circle c1 = new Circle(1, 2, 3);
        Circle c2 = new Circle(1, 2, 3);

        assertTrue(c1.equals(c2));
    }

    @Test
    public void testEquals_False_WhenDifferentX() {
        Circle c1 = new Circle(1, 2, 3);
        Circle c2 = new Circle(9, 2, 3);

        assertFalse(c1.equals(c2));
    }

    @Test
    public void testEquals_False_WhenDifferentY() {
        Circle c1 = new Circle(1, 2, 3);
        Circle c2 = new Circle(1, 9, 3);

        assertFalse(c1.equals(c2));
    }

    @Test
    public void testEquals_False_WhenDifferentRadius() {
        Circle c1 = new Circle(1, 2, 3);
        Circle c2 = new Circle(1, 2, 9);

        assertFalse(c1.equals(c2));
    }
}
