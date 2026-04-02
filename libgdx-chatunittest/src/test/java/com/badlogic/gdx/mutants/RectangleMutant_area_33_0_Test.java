package com.badlogic.gdx.mutants;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import com.badlogic.gdx.utils.Scaling;

public class RectangleMutant_area_33_0_Test {

    @Test
    public void testArea() throws Exception {
        RectangleMutant rectangle = new RectangleMutant(0, 0, 10, 5);
        assertEquals(50, rectangle.area());
    }

    @Test
    public void testSet() throws Exception {
        RectangleMutant rectangle = new RectangleMutant();
        rectangle.set(1, 2, 3, 4);
        assertEquals(1, rectangle.getX());
        assertEquals(2, rectangle.getY());
        assertEquals(3, rectangle.getWidth());
        assertEquals(4, rectangle.getHeight());
    }

    @Test
    public void testGetPosition() throws Exception {
        RectangleMutant rectangle = new RectangleMutant();
        rectangle.setX(1);
        rectangle.setY(2);
        Vector2 position = new Vector2();
        position = rectangle.getPosition(position);
        assertEquals(1, position.x);
        assertEquals(2, position.y);
    }

    @Test
    public void testSetPosition() throws Exception {
        RectangleMutant rectangle = new RectangleMutant();
        rectangle.setPosition(1, 2);
        assertEquals(1, rectangle.getX());
        assertEquals(2, rectangle.getY());
    }

    @Test
    public void testSetSize() throws Exception {
        RectangleMutant rectangle = new RectangleMutant();
        rectangle.setSize(3, 4);
        assertEquals(3, rectangle.getWidth());
        assertEquals(4, rectangle.getHeight());
    }

    @Test
    public void testGetSize() throws Exception {
        RectangleMutant rectangle = new RectangleMutant();
        rectangle.setSize(5);
        Vector2 size = new Vector2();
        size = rectangle.getSize(size);
        assertEquals(5, size.x);
        assertEquals(5, size.y);
    }

    @Test
    public void testContains() throws Exception {
        RectangleMutant rectangle = new RectangleMutant(0, 0, 10, 5);
        assertTrue(rectangle.contains(3, 2));
        assertFalse(rectangle.contains(-1, -1));
    }

    @Test
    public void testOverlaps() throws Exception {
        RectangleMutant rectangle = new RectangleMutant(0, 0, 10, 5);
        RectangleMutant other = new RectangleMutant(5, 2, 3, 4);
        assertTrue(rectangle.overlaps(other));
    }

    @Test
    public void testMerge() throws Exception {
        RectangleMutant rectangle = new RectangleMutant(0, 0, 10, 5);
        RectangleMutant other = new RectangleMutant(5, 2, 3, 4);
        rectangle.merge(other);
        assertEquals(15, rectangle.getWidth());
    }

    @Test
    public void testGetAspectRatio() throws Exception {
        RectangleMutant rectangle = new RectangleMutant(0, 0, 10, 5);
        assertEquals(2, rectangle.getAspectRatio(), 0.001);
    }

    @Test
    public void testGetCenter() throws Exception {
        RectangleMutant rectangle = new RectangleMutant(0, 0, 10, 5);
        Vector2 center = new Vector2();
        center = rectangle.getCenter(center);
        assertEquals(5, center.x);
        assertEquals(3, center.y);
    }

    @Test
    public void testSetCenter() throws Exception {
        RectangleMutant rectangle = new RectangleMutant();
        rectangle.setCenter(1, 2);
        assertEquals(1, rectangle.getX());
        assertEquals(2, rectangle.getY());
    }
}
