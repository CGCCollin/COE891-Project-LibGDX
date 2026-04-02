package com.badlogic.gdx.mutants;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;

public class PolygonMutant_rotate_8_0_Test {

    @Test
    void testRotate() throws Exception {
        PolygonMutant poly = new PolygonMutant(new float[] { 0, 0, 1, 0, 1, 1, 0, 1 });
        poly.rotate(90);
        float[] vertices = poly.getTransformedVertices();
        assertEquals(vertices[0], -1);
        assertEquals(vertices[1], 0);
        assertEquals(vertices[2], 0);
        assertEquals(vertices[3], 1);
        assertEquals(vertices[4], 1);
        assertEquals(vertices[5], 0);
        assertEquals(vertices[6], -1);
        assertEquals(vertices[7], 1);
    }

    @Test
    void testRotateNegative() throws Exception {
        PolygonMutant poly = new PolygonMutant(new float[] { 0, 0, 1, 0, 1, 1, 0, 1 });
        poly.rotate(-90);
        float[] vertices = poly.getTransformedVertices();
        assertEquals(vertices[0], 1);
        assertEquals(vertices[1], -1);
        assertEquals(vertices[2], 0);
        assertEquals(vertices[3], 0);
        assertEquals(vertices[4], 1);
        assertEquals(vertices[5], 1);
        assertEquals(vertices[6], -1);
        assertEquals(vertices[7], 0);
    }

    @Test
    void testRotateZero() throws Exception {
        PolygonMutant poly = new PolygonMutant(new float[] { 0, 0, 1, 0, 1, 1, 0, 1 });
        poly.rotate(0);
        float[] vertices = poly.getTransformedVertices();
        assertEquals(vertices[0], 0);
        assertEquals(vertices[1], 0);
        assertEquals(vertices[2], 1);
        assertEquals(vertices[3], 0);
        assertEquals(vertices[4], 1);
        assertEquals(vertices[5], 1);
        assertEquals(vertices[6], 0);
        assertEquals(vertices[7], 1);
    }

    @Test
    void testRotateOrigin() throws Exception {
        PolygonMutant poly = new PolygonMutant(new float[] { 0, 0, 2, 0, 2, 2, 0, 2 });
        poly.setOrigin(1, 1);
        poly.rotate(90);
        float[] vertices = poly.getTransformedVertices();
        assertEquals(vertices[0], -1);
        assertEquals(vertices[1], -1);
        assertEquals(vertices[2], 1);
        assertEquals(vertices[3], -1);
        assertEquals(vertices[4], 1);
        assertEquals(vertices[5], 1);
        assertEquals(vertices[6], -1);
        assertEquals(vertices[7], 1);
    }

    @Test
    void testRotatePosition() throws Exception {
        PolygonMutant poly = new PolygonMutant(new float[] { 0, 0, 2, 0, 2, 2, 0, 2 });
        poly.setPosition(1, 1);
        poly.rotate(90);
        float[] vertices = poly.getTransformedVertices();
        assertEquals(vertices[0], -1);
        assertEquals(vertices[1], -1);
        assertEquals(vertices[2], 3);
        assertEquals(vertices[3], -1);
        assertEquals(vertices[4], 3);
        assertEquals(vertices[5], 1);
        assertEquals(vertices[6], -1);
        assertEquals(vertices[7], 1);
    }
}
