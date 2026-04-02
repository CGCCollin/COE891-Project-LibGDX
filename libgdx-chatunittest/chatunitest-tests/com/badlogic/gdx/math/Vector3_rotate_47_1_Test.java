package com.badlogic.gdx.math;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class Vector3_rotate_47_1_Test {

    @Test
    void testRotate() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 0, 0);
        float degrees = 90f;
        Matrix4 tmpMat = new Matrix4();
        tmpMat.setToRotation(vector, degrees);
        // Act
        Vector3 result = vector.rotate(vector, degrees);
        // Assert
        assertEquals(0, result.x, 0.0001f);
        assertEquals(-1, result.y, 0.0001f);
        assertEquals(0, result.z, 0.0001f);
    }
}
