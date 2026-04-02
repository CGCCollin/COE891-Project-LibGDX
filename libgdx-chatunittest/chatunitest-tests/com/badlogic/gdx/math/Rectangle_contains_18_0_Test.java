package com.badlogic.gdx.math;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import com.badlogic.gdx.utils.Scaling;

public class Rectangle_contains_18_0_Test {

    @Test
    void testContains() {
        // Create a rectangle with position (0, 0) and size 2x2
        Rectangle rect1 = new Rectangle(0, 0, 2, 2);
        // Create a smaller rectangle that is contained within the first one
        Rectangle rect2 = new Rectangle(1, 1, 1, 1);
        assertTrue(rect1.contains(rect2));
        // Create a rectangle that is not contained within the First one
        Rectangle rect3 = new Rectangle(-1, -1, 3, 3);
        assertFalse(rect1.contains(rect3));
        // Check for edge cases
        // Edge case: rectangle with zero width or height should return false
        Rectangle rect4 = new Rectangle(0, 0, 0, 2);
        assertFalse(rect1.contains(rect4));
    }
}
