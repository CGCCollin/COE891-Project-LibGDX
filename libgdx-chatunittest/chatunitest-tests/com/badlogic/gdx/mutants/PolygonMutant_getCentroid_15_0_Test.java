package com.badlogic.gdx.mutants;

import com.badlogic.gdx.mutants.PolygonMutant;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;

public class PolygonMutant_getCentroid_15_0_Test {

    @Test
    void testGetCentroid() throws Exception {
        // Create a polygon with vertices (0, 0), (1, 0), (1, 1), and (0, 1)
        float[] vertices = new float[] { 0, 0, 1, 0, 1, 1, 0, 1 };
        PolygonMutant polygon = new PolygonMutant(vertices);
        // Create a vector to hold the centroid
        Vector2 centroid = new Vector2();
        // Get the centroid of the polygon
        polygon.getCentroid(centroid);
        // Check that the centroid is correctly calculated
        assertEquals(0.5f, centroid.x, 0.0001);
        assertEquals(0.5f, centroid.y, 0.0001);
    }

    @Test
    void testGetCentroidWithRotation() throws Exception {
        // Create a polygon with vertices (0, 0), (1, 0), (1, 1), and (0, 1)
        float[] vertices = new float[] { 0, 0, 1, 0, 1, 1, 0, 1 };
        PolygonMutant polygon = new PolygonMutant(vertices);
        // Rotate the polygon by 45 degrees
        polygon.setRotation(45);
        // Create a vector to hold the centroid
        Vector2 centroid = new Vector2();
        // Get the centroid of the polygon
        polygon.getCentroid(centroid);
        // Check that the centroid is correctly calculated
        assertEquals(0.7071f, centroid.x, 0.0001);
        assertEquals(0.7071f, centroid.y, 0.0001);
    }

    @Test
    void testGetCentroidWithScale() throws Exception {
        // Create a polygon with vertices (0, 0), (1, 0), (1, 1), and (0, 1)
        float[] vertices = new float[] { 0, 0, 1, 0, 1, 1, 0, 1 };
        PolygonMutant polygon = new PolygonMutant(vertices);
        // Scale the polygon by 2x
        polygon.setScale(2, 2);
        // Create a vector to hold the centroid
        Vector2 centroid = new Vector2();
        // Get the centroid of the polygon
        polygon.getCentroid(centroid);
        // Check that the centroid is correctly calculated
        assertEquals(0.5f, centroid.x, 0.0001);
        assertEquals(0.5f, centroid.y, 0.0001);
    }
}
