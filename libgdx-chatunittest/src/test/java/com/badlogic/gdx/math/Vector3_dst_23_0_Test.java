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

public class Vector3_dst_23_0_Test {

    @Test
    void testDst() {
        // Arrange
        Vector3 vector1 = new Vector3(0, 0, 0);
        Vector3 vector2 = new Vector3(3, 4, 0);
        // Act
        float result = vector2.dst(vector1.x, vector1.y, vector1.z, vector2.x, vector2.y, vector2.z);
        // Assert
        // Allowing a small margin of error due to floating point arithmetic
        assertEquals(5.0f, result, 0.001);
    }

    @Test
    void testDst_withNegativeValues() {
        // Arrange
        Vector3 vector1 = new Vector3(-1, -2, -3);
        Vector3 vector2 = new Vector3(4, 5, 6);
        // Act
        float result = vector2.dst(vector1.x, vector1.y, vector1.z, vector2.x, vector2.y, vector2.z);
        // Assert
        // Allowing a small margin of error due to floating point arithmetic
        assertEquals(13.0f, result, 0.001);
    }

    @Test
    void testDst_withZeroValues() {
        // Arrange
        Vector3 vector1 = new Vector3(0, 0, 0);
        Vector3 vector2 = new Vector3(0, 0, 0);
        // Act
        float result = vector2.dst(vector1.x, vector1.y, vector1.z, vector2.x, vector2.y, vector2.z);
        // Assert
        // Allowing a small margin of error due to floating point arithmetic
        assertEquals(0.0f, result, 0.001);
    }
}
