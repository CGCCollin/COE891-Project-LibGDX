package com.badlogic.gdx.mutants;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;
import com.badlogic.gdx.utils.NumberUtils;

public class CircleMutant_contains_9_0_Test {

    @Test
    public void testContains() throws Exception {
        CircleMutant circle = new CircleMutant(0, 0, 5);
        // point inside the circle
        assertTrue(circle.contains(3, 4));
        // point outside the circle
        assertFalse(circle.contains(-1, -2));
    }

    @Test
    public void testContainsVector() throws Exception {
        CircleMutant circle = new CircleMutant(0, 0, 5);
        // vector inside the circle
        assertTrue(circle.contains(new Vector2(3, 4)));
        // vector outside the circle
        assertFalse(circle.contains(new Vector2(-1, -2)));
    }

    @Test
    public void testContainsCircle() throws Exception {
        CircleMutant circle = new CircleMutant(0, 0, 5);
        CircleMutant otherCircle = new CircleMutant(3, 4, 2);
        // circle inside the circle
        assertTrue(circle.contains(otherCircle));
    }

    @Test
    public void testContainsOverlap() throws Exception {
        CircleMutant circle = new CircleMutant(0, 0, 5);
        CircleMutant otherCircle = new CircleMutant(3, 4, 6);
        // circles don't overlap
        assertFalse(circle.contains(otherCircle));
    }
}
