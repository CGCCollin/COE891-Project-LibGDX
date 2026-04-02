package com.badlogic.gdx.math;

import java.lang.reflect.Method;
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

public class Rectangle_overlaps_19_0_Test {

    @Test
    void testOverlaps() throws Exception {
        // Create a new instance of the Rectangle class
        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        // Get the private 'overlaps' method using reflection
        Method overlapsMethod = Rectangle.class.getDeclaredMethod("overlaps", Rectangle.class);
        overlapsMethod.setAccessible(true);
        // Create a new instance of the Rectangle class to test overlap
        Rectangle testRectangle1 = new Rectangle(5, 5, 10, 10);
        Rectangle testRectangle2 = new Rectangle(15, 15, 10, 10);
        // Test that the rectangles overlap
        boolean result1 = (boolean) overlapsMethod.invoke(rectangle, testRectangle1);
        assertTrue(result1);
        // Test that the rectangles do not overlap
        boolean result2 = (boolean) overlapsMethod.invoke(rectangle, testRectangle2);
        assertFalse(result2);
    }
}
