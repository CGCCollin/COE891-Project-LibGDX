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

class Vector3_rotateRad_48_0_Test {

    @Test
    void rotateRad() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 0, 0);
        Vector3 axis = new Vector3(0, 1, 0);
        // 90 degrees
        float radians = (float) Math.PI / 2;
        // Act
        vector.rotateRad(axis, radians);
        // Assert
        assertEquals(0, vector.y, 0.000001);
        assertEquals(-1, vector.x, 0.000001);
        assertEquals(0, vector.z, 0.000001);
    }

    @Test
    void rotateRad_90() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 0, 0);
        Vector3 axis = new Vector3(0, 1, 0);
        // 90 degrees
        float radians = (float) Math.PI / 2;
        // Act
        vector.rotateRad(axis, radians);
        // Assert
        assertEquals(0, vector.y, 0.000001);
        assertEquals(-1, vector.x, 0.000001);
        assertEquals(0, vector.z, 0.000001);
    }

    @Test
    void rotateRad_180() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 0, 0);
        Vector3 axis = new Vector3(0, 1, 0);
        // 180 degrees
        float radians = (float) Math.PI;
        // Act
        vector.rotateRad(axis, radians);
        // Assert
        assertEquals(-1, vector.x, 0.000001);
        assertEquals(0, vector.y, 0.000001);
        assertEquals(0, vector.z, 0.000001);
    }

    @Test
    void rotateRad_360() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 0, 0);
        Vector3 axis = new Vector3(0, 1, 0);
        // 360 degrees
        float radians = (float) Math.PI * 2;
        // Act
        vector.rotateRad(axis, radians);
        // Assert
        assertEquals(1, vector.x, 0.000001);
        assertEquals(0, vector.y, 0.000001);
        assertEquals(0, vector.z, 0.000001);
    }
}
