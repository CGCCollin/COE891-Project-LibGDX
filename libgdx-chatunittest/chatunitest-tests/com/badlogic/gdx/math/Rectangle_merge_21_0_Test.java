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

public class Rectangle_merge_21_0_Test {

    @Test
    void testMerge() {
        Rectangle rect1 = new Rectangle(0, 0, 10, 10);
        Rectangle rect2 = new Rectangle(5, 5, 6, 6);
        rect1.merge(rect2);
        assertEquals(0, rect1.getX());
        assertEquals(0, rect1.getY());
        assertEquals(11, rect1.getWidth());
        assertEquals(11, rect1.getHeight());
    }

    @Test
    void testMergeWithNegativeCoordinates() {
        Rectangle rect1 = new Rectangle(-10, -10, 10, 10);
        Rectangle rect2 = new Rectangle(5, 5, 6, 6);
        rect1.merge(rect2);
        assertEquals(-10, rect1.getX());
        assertEquals(-10, rect1.getY());
        assertEquals(11, rect1.getWidth());
        assertEquals(11, rect1.getHeight());
    }

    @Test
    void testMergeWithOverlappingRectangles() {
        Rectangle rect1 = new Rectangle(0, 0, 10, 10);
        Rectangle rect2 = new Rectangle(5, 5, 6, 6);
        rect1.merge(rect2);
        assertEquals(0, rect1.getX());
        assertEquals(0, rect1.getY());
        assertEquals(11, rect1.getWidth());
        assertEquals(11, rect1.getHeight());
    }

    @Test
    void testMergeWithIdenticalRectangles() {
        Rectangle rect1 = new Rectangle(0, 0, 10, 10);
        Rectangle rect2 = new Rectangle(0, 0, 10, 10);
        rect1.merge(rect2);
        assertEquals(0, rect1.getX());
        assertEquals(0, rect1.getY());
        assertEquals(10, rect1.getWidth());
        assertEquals(10, rect1.getHeight());
    }

    @Test
    void testMergeWithZeroSizeRectangles() {
        Rectangle rect1 = new Rectangle(0, 0, 0, 0);
        Rectangle rect2 = new Rectangle(5, 5, 6, 6);
        rect1.merge(rect2);
        assertEquals(0, rect1.getX());
        assertEquals(0, rect1.getY());
        assertEquals(11, rect1.getWidth());
        assertEquals(11, rect1.getHeight());
    }
}
