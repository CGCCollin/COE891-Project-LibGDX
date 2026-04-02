package com.badlogic.gdx.math;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.NumberUtils;

class Circle_contains_9_0_Test {

    @Test
    void testContains() throws Exception {
        // create a circle with center (0, 0) and radius 1
        Circle c = new Circle(0, 0, 1);
        // test cases where the point is inside the circle
        assertTrue(c.contains(0.5f, 0.5f));
        assertTrue(c.contains(-0.5f, -0.5f));
        assertTrue(c.contains(1f, 0f));
        assertTrue(c.contains(0f, 1f));
        // test cases where the point is outside the circle
        assertFalse(c.contains(2f, 2f));
        assertFalse(c.contains(-2f, -2f));
        assertFalse(c.contains(1f, 2f));
        assertFalse(c.contains(2f, 1f));
    }
}
