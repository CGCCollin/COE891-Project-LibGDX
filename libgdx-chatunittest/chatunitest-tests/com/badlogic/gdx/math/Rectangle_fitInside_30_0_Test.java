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

public class Rectangle_fitInside_30_0_Test {

    @Test
    void testFitInside() throws Exception {
        Rectangle rect = new Rectangle(0, 0, 10, 5);
        rect.fitInside(new Rectangle(1, 2, 6, 4));
        assertEquals(3.333333f, rect.getWidth(), 0.0001);
        assertEquals(2.666667f, rect.getHeight(), 0.0001);
        assertEquals(-1.5f, rect.getX(), 0.0001);
        assertEquals(-1f, rect.getY(), 0.0001);
        rect = new Rectangle(0, 0, 10, 5);
        rect.fitInside(new Rectangle(1, 2, 3, 4));
        assertEquals(3f, rect.getWidth(), 0.0001);
        assertEquals(4f, rect.getHeight(), 0.0001);
        assertEquals(-1f, rect.getX(), 0.0001);
        assertEquals(-2f, rect.getY(), 0.0001);
    }

    @Test
    void testFitInsideWithZeroWidthOrHeight() throws Exception {
        Rectangle rect = new Rectangle(0, 0, 10, 5);
        rect.fitInside(new Rectangle(1, 2, 3, 0));
        assertEquals(3f, rect.getWidth(), 0.0001);
        assertEquals(0f, rect.getHeight(), 0.0001);
        assertEquals(-1f, rect.getX(), 0.0001);
        assertEquals(-2f, rect.getY(), 0.0001);
        rect = new Rectangle(0, 0, 10, 5);
        rect.fitInside(new Rectangle(1, 2, 0, 4));
        assertEquals(0f, rect.getWidth(), 0.0001);
        assertEquals(4f, rect.getHeight(), 0.0001);
        assertEquals(-1f, rect.getX(), 0.0001);
        assertEquals(-2f, rect.getY(), 0.0001);
    }

    @Test
    void testFitInsideWithNegativeValues() throws Exception {
        Rectangle rect = new Rectangle(0, 0, 10, 5);
        rect.fitInside(new Rectangle(-1, -2, 3, 4));
        assertEquals(3f, rect.getWidth(), 0.0001);
        assertEquals(4f, rect.getHeight(), 0.0001);
        assertEquals(-1f, rect.getX(), 0.0001);
        assertEquals(-2f, rect.getY(), 0.0001);
    }

    @Test
    void testFitInsideWithZeroValues() throws Exception {
        Rectangle rect = new Rectangle(0, 0, 10, 5);
        rect.fitInside(new Rectangle(0, 0, 3, 4));
        assertEquals(3f, rect.getWidth(), 0.0001);
        assertEquals(4f, rect.getHeight(), 0.0001);
        assertEquals(-1f, rect.getX(), 0.0001);
        assertEquals(-2f, rect.getY(), 0.0001);
    }

    @Test
    void testFitInsideWithSameSize() throws Exception {
        Rectangle rect = new Rectangle(0, 0, 10, 5);
        rect.fitInside(new Rectangle(1, 2, 10, 5));
        assertEquals(10f, rect.getWidth(), 0.0001);
        assertEquals(5f, rect.getHeight(), 0.0001);
        assertEquals(1f, rect.getX(), 0.0001);
        assertEquals(2f, rect.getY(), 0.0001);
    }
}
