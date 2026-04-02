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

class Vector3_unrotate_43_0_Test {

    @Test
    void unrotate() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 0, 0);
        Matrix4 matrix = new Matrix4();
        // Rotate 90 degrees around the Z axis
        matrix.setToRotation(90f, 0f, 0f, 1f);
        // Act
        vector.unrotate(matrix);
        // Assert
        assertEquals(0, vector.x, 0.0001);
        assertEquals(-1, vector.y, 0.0001);
        assertEquals(0, vector.z, 0.0001);
    }
}
