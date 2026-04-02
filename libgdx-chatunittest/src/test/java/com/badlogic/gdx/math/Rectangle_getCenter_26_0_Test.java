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

class Rectangle_getCenter_26_0_Test {

    @Test
    void testGetCenter() throws Exception {
        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        Vector2 center = new Vector2();
        rectangle.getCenter(center);
        assertEquals(5, center.x);
        assertEquals(5, center.y);
    }

    @Test
    void testGetCenterWithNonZeroPosition() throws Exception {
        Rectangle rectangle = new Rectangle(3, 4, 10, 10);
        Vector2 center = new Vector2();
        rectangle.getCenter(center);
        assertEquals(7, center.x);
        assertEquals(9, center.y);
    }

    @Test
    void testGetCenterWithNullArgument() throws Exception {
        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        assertThrows(IllegalArgumentException.class, () -> rectangle.getCenter(null));
    }

    @Test
    void testGetCenterWithZeroDimensions() throws Exception {
        Rectangle rectangle = new Rectangle(3, 4, 0, 0);
        Vector2 center = new Vector2();
        rectangle.getCenter(center);
        assertEquals(3, center.x);
        assertEquals(4, center.y);
    }

    @Test
    void testGetCenterWithNegativeDimensions() throws Exception {
        Rectangle rectangle = new Rectangle(3, 4, -10, -10);
        Vector2 center = new Vector2();
        rectangle.getCenter(center);
        assertEquals(7, center.x);
        assertEquals(9, center.y);
    }
}
