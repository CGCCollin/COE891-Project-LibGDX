package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;

public class Vector3_rotateRad_46_0_Test {

    private final float EPSILON = 0.0001f;

    @Test
    void testRotateRad() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 0, 0);
        // Rotate 90 degrees around the X-axis
        float radians = (float) Math.PI / 2;
        float axisX = 1;
        float axisY = 0;
        float axisZ = 0;
        // Act
        vector.rotateRad(radians, axisX, axisY, axisZ);
        // Assert
        // Should be rotated 90 degrees around the X-axis
        assertEquals(0, vector.y, EPSILON);
        assertEquals(1, vector.z, EPSILON);
        assertEquals(0, vector.x, EPSILON);
    }

    @Test
    void testRotateRadWithZeroAxis() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 0, 0);
        // Rotate 90 degrees around the X-axis
        float radians = (float) Math.PI / 2;
        float axisX = 0;
        float axisY = 0;
        float axisZ = 0;
        // Act
        vector.rotateRad(radians, axisX, axisY, axisZ);
        // Assert
        // Should remain unchanged as the rotation axis is zero
        assertEquals(1, vector.x, EPSILON);
        assertEquals(0, vector.y, EPSILON);
        assertEquals(0, vector.z, EPSILON);
    }

    @Test
    void testRotateRadWithZeroVectors() throws Exception {
        // Arrange
        Vector3 vector = new Vector3();
        // Rotate 90 degrees around any axis
        float radians = (float) Math.PI / 2;
        float axisX = 1;
        float axisY = 0;
        float axisZ = 0;
        // Act
        vector.rotateRad(radians, axisX, axisY, axisZ);
        // Assert
        // Should be rotated 90 degrees around the X-axis
        assertEquals(0, vector.x, EPSILON);
        assertEquals(0, vector.y, EPSILON);
        assertEquals(0, vector.z, EPSILON);
    }

    @Test
    void testRotateRadWithNegativeAxis() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 0, 0);
        // Rotate 90 degrees around the X-axis
        float radians = (float) Math.PI / 2;
        float axisX = -1;
        float axisY = 0;
        float axisZ = 0;
        // Act
        vector.rotateRad(radians, axisX, axisY, axisZ);
        // Assert
        // Should be rotated -90 degrees around the X-axis
        assertEquals(0, vector.y, EPSILON);
        assertEquals(-1, vector.z, EPSILON);
        assertEquals(0, vector.x, EPSILON);
    }

    @Test
    void testRotateRadWithNonUnitAxis() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 0, 0);
        // Rotate 90 degrees around the X-axis
        float radians = (float) Math.PI / 2;
        float axisX = 2;
        float axisY = 0;
        float axisZ = 0;
        // Act
        vector.rotateRad(radians, axisX, axisY, axisZ);
        // Assert
        // Should be rotated 90 degrees around the scaled X-axis
        assertEquals(0, vector.y, EPSILON);
        assertEquals(2, vector.z, EPSILON);
        assertEquals(0, vector.x, EPSILON);
    }
}
