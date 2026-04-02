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

public class Vector3_mul_38_2_Test {

    private final Vector3 vector = new Vector3(1, 2, 3);

    private final Matrix3 matrix = new Matrix3();

    private final float[] matrixValues = { 1, 0, 0, 0, 1, 0, 0, 0, 1 };

    @Test
    public void testMul() throws Exception {
        // Arrange
        matrix.set(matrixValues);
        Vector3 expected = new Vector3(4, 6, 8);
        expected.x *= vector.x;
        expected.y *= vector.y;
        expected.z *= vector.z;
        // Act
        Vector3 result = vector.mul(matrix);
        // Assert
        assertEquals(expected, result);
    }
}
