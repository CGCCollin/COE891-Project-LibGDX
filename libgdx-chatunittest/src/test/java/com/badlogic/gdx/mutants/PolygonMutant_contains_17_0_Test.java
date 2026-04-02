package com.badlogic.gdx.mutants;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;

class PolygonMutant_contains_17_0_Test {

    @Test
    void testContains() throws Exception {
        // Arrange
        float[] vertices = { 0, 0, 5, 0, 5, 5, 0, 5 };
        PolygonMutant polygon = new PolygonMutant(vertices);
        // Act
        // Inside the polygon
        boolean result1 = polygon.contains(2, 3);
        // Outside the polygon
        boolean result2 = polygon.contains(10, 15);
        // Assert
        assertTrue(result1, "The point (2, 3) should be inside the polygon");
        assertFalse(result2, "The point (10, 15) should not be inside the polygon");
    }

    @Test
    void testContainsWithRotation() throws Exception {
        // Arrange
        float[] vertices = { 0, 0, 5, 0, 5, 5, 0, 5 };
        PolygonMutant polygon = new PolygonMutant(vertices);
        // Rotate the polygon by 45 degrees
        polygon.setRotation(45);
        // Act
        // Inside the rotated polygon
        boolean result1 = polygon.contains(2, -3);
        // Outside the rotated polygon
        boolean result2 = polygon.contains(10, 15);
        // Assert
        assertTrue(result1, "The point (2, -3) should be inside the rotated polygon");
        assertFalse(result2, "The point (10, 15) should not be inside the rotated polygon");
    }

    @Test
    void testContainsWithScale() throws Exception {
        // Arrange
        float[] vertices = { 0, 0, 5, 0, 5, 5, 0, 5 };
        PolygonMutant polygon = new PolygonMutant(vertices);
        // Scale the polygon by a factor of 2 in X and 3 in Y
        polygon.setScale(2, 3);
        // Act
        // Inside the scaled polygon
        boolean result1 = polygon.contains(4, 12);
        // Outside the scaled polygon
        boolean result2 = polygon.contains(10, 15);
        // Assert
        assertTrue(result1, "The point (4, 12) should be inside the scaled polygon");
        assertFalse(result2, "The point (10, 15) should not be inside the scaled polygon");
    }
}
