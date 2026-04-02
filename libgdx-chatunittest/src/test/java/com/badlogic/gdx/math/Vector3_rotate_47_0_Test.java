package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Matrix4;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;

public class Vector3_rotate_47_0_Test {

    @Test
    public void testRotate() throws Exception {
        // Arrange
        final Vector3 vector = new Vector3(1, 0, 0);
        final Matrix4 matrix = new Matrix4();
        matrix.setToRotation(vector, 90f);
        // Act
        final Vector3 result = vector.rotate(vector, 90f);
        // Assert
        assertEquals(result.x, Math.cos(Math.toRadians(90)), 0.0001);
        assertEquals(result.y, -Math.sin(Math.toRadians(90)), 0.0001);
        assertEquals(result.z, 0);
    }

    @Test
    public void testRotateWithMatrix() throws Exception {
        // Arrange
        final Vector3 vector = new Vector3(1, 0, 0);
        final Matrix4 matrix = new Matrix4();
        matrix.setToRotation(vector, 90f);
        // Act
        final Vector3 result = vector.mul(matrix);
        // Assert
        assertEquals(result.x, Math.cos(Math.toRadians(90)), 0.0001);
        assertEquals(result.y, -Math.sin(Math.toRadians(90)), 0.0001);
        assertEquals(result.z, 0);
    }
}
