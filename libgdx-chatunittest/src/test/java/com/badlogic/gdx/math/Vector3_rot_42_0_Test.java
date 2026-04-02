package com.badlogic.gdx.math;

import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;

public class Vector3_rot_42_0_Test {

    private final Matrix4 matrix = new Matrix4();

    private final Vector3 vector = new Vector3(1, 2, 3);

    @Test
    public void testRot() throws Exception {
        // Arrange
        matrix.setToOrtho2D(-10f, 10f, -20f, 20f);
        Vector3 expected = new Vector3(1, 2, 3).rot(matrix);
        // Act
        Method rotMethod = vector.getClass().getDeclaredMethod("rot", Matrix4.class);
        rotMethod.setAccessible(true);
        Vector3 result = (Vector3) rotMethod.invoke(vector, matrix);
        // Assert
        assertEquals(expected, result);
    }
}
