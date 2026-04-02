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

class Rectangle_toString_31_0_Test {

    private Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(1, 2, 3, 4);
    }

    @AfterEach
    void tearDown() {
        rectangle = null;
    }

    @Test
    void testToString() {
        assertEquals("[1.0,2.0,3.0,4.0]", rectangle.toString());
    }

    @Test
    void testGetX() {
        assertEquals(1.0f, rectangle.getX());
    }

    @Test
    void testSetX() {
        rectangle.setX(5.0f);
        assertEquals(5.0f, rectangle.getX());
    }

    @Test
    void testGetY() {
        assertEquals(2.0f, rectangle.getY());
    }

    @Test
    void testSetY() {
        rectangle.setY(6.0f);
        assertEquals(6.0f, rectangle.getY());
    }

    @Test
    void testGetWidth() {
        assertEquals(3.0f, rectangle.getWidth());
    }

    @Test
    void testSetWidth() {
        rectangle.setWidth(7.0f);
        assertEquals(7.0f, rectangle.getWidth());
    }

    @Test
    void testGetHeight() {
        assertEquals(4.0f, rectangle.getHeight());
    }

    @Test
    void testSetHeight() {
        rectangle.setHeight(8.0f);
        assertEquals(8.0f, rectangle.getHeight());
    }

    @Test
    void testContainsPoint() {
        assertTrue(rectangle.contains(2.5f, 3.5f));
        assertFalse(rectangle.contains(4.0f, 5.0f));
    }

    @Test
    void testContainsCircle() {
        // Not implemented yet
    }

    @Test
    void testOverlaps() {
        Rectangle other = new Rectangle(2, 3, 1, 1);
        assertTrue(rectangle.overlaps(other));
        other = new Rectangle(5, 6, 1, 1);
        assertFalse(rectangle.overlaps(other));
    }

    @Test
    void testMerge() {
        Rectangle other = new Rectangle(2, 3, 1, 1);
        rectangle.merge(other);
        assertEquals(2.0f, rectangle.getX());
        assertEquals(3.0f, rectangle.getY());
        assertEquals(4.0f, rectangle.getWidth());
        assertEquals(5.0f, rectangle.getHeight());
        rectangle = new Rectangle(1, 2, 3, 4);
        other = new Rectangle(5, 6, 7, 8);
        rectangle.merge(5.0f, 6.0f);
        assertEquals(5.0f, rectangle.getX());
        assertEquals(6.0f, rectangle.getY());
        assertEquals(10.0f, rectangle.getWidth());
        assertEquals(12.0f, rectangle.getHeight());
        rectangle = new Rectangle(1, 2, 3, 4);
        other = new Rectangle(5, 6, 7, 8);
        rectangle.merge(new Vector2(5, 6));
        assertEquals(5.0f, rectangle.getX());
        assertEquals(6.0f, rectangle.getY());
        assertEquals(10.0f, rectangle.getWidth());
        assertEquals(12.0f, rectangle.getHeight());
    }
}
