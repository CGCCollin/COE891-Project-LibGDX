package coe891Project1.logicTesting;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.badlogic.gdx.math.Vector3;

public class Vector3TestLogic {

    @Test
    void testHasOppositeDirection_True() {
        Vector3 v1 = new Vector3(1, 0, 0);
        Vector3 v2 = new Vector3(-1, 0, 0);

        assertTrue(v1.hasOppositeDirection(v2));
    }

    @Test
    void testHasOppositeDirection_False_WhenOrthogonal() {
        Vector3 v1 = new Vector3(1, 0, 0);
        Vector3 v2 = new Vector3(0, 1, 0);

        assertFalse(v1.hasOppositeDirection(v2));
    }

    @Test
    void testHasOppositeDirection_False_WhenSameDirection() {
        Vector3 v1 = new Vector3(1, 0, 0);
        Vector3 v2 = new Vector3(2, 0, 0);

        assertFalse(v1.hasOppositeDirection(v2));
    }

    @Test
    void testEpsilonEquals_False_WhenOtherIsNull() {
        Vector3 v = new Vector3(1f, 1f, 1f);

        assertFalse(v.epsilonEquals(null, 0.1f));
    }

    @Test
    void testEpsilonEquals_True_WhenAllDifferencesWithinEpsilon() {
        Vector3 v1 = new Vector3(1f, 2f, 3f);
        Vector3 v2 = new Vector3(1.05f, 2.05f, 3.05f);

        assertTrue(v1.epsilonEquals(v2, 0.1f));
    }

    @Test
    void testEpsilonEquals_True_WhenDifferencesEqualToEpsilon() {
        Vector3 v1 = new Vector3(1f, 2f, 3f);
        Vector3 v2 = new Vector3(1.1f, 2.1f, 3.1f);

        assertTrue(v1.epsilonEquals(v2, 0.1f));
    }

    @Test
    void testEpsilonEquals_False_WhenXDifferenceExceedsEpsilon() {
        Vector3 v1 = new Vector3(1f, 2f, 3f);
        Vector3 v2 = new Vector3(1.2f, 2f, 3f);

        assertFalse(v1.epsilonEquals(v2, 0.1f));
    }

    @Test
    void testEpsilonEquals_False_WhenYDifferenceExceedsEpsilon() {
        Vector3 v1 = new Vector3(1f, 2f, 3f);
        Vector3 v2 = new Vector3(1f, 2.2f, 3f);

        assertFalse(v1.epsilonEquals(v2, 0.1f));
    }

    @Test
    void testEpsilonEquals_False_WhenZDifferenceExceedsEpsilon() {
        Vector3 v1 = new Vector3(1f, 2f, 3f);
        Vector3 v2 = new Vector3(1f, 2f, 3.2f);

        assertFalse(v1.epsilonEquals(v2, 0.1f));
    }

    @Test
    void testIsCollinearOpposite_True() {
        Vector3 v1 = new Vector3(1, 0, 0);
        Vector3 v2 = new Vector3(-2, 0, 0);

        assertTrue(v1.isCollinearOpposite(v2));
    }

    @Test
    void testIsCollinearOpposite_False_WhenCollinearButSameDirection() {
        Vector3 v1 = new Vector3(1, 0, 0);
        Vector3 v2 = new Vector3(2, 0, 0);

        assertFalse(v1.isCollinearOpposite(v2));
    }

    @Test
    void testIsCollinearOpposite_False_WhenNotCollinearButOppositeGeneralDirection() {
        Vector3 v1 = new Vector3(1, 0, 0);
        Vector3 v2 = new Vector3(-1, 1, 0);

        assertFalse(v1.isCollinearOpposite(v2));
    }

    @Test
    void testIsCollinearOpposite_False_WhenNotCollinearAndNotOpposite() {
        Vector3 v1 = new Vector3(1, 0, 0);
        Vector3 v2 = new Vector3(1, 1, 0);

        assertFalse(v1.isCollinearOpposite(v2));
    }
}