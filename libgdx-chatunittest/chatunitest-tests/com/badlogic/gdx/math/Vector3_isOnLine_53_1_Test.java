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

class Vector3_isOnLine_53_1_Test {

    @Test
    void isOnLine_WithDifferentVectors() throws Exception {
        Vector3 vector1 = new Vector3(1, 0, 0);
        Vector3 vector2 = new Vector3(2, 0, 0);
        float epsilon = 0.0001f;
        boolean result = vector1.isOnLine(vector2, epsilon);
        assertFalse(result);
    }

    @Test
    void IsOnLine_WithSameVectors() throws Exception {
        Vector3 vector1 = new Vector3(1, 0, 0);
        float epsilon = 0.0001f;
        boolean result = vector1.isOnLine(vector1, epsilon);
        assertTrue(result);
    }

    @Test
    void IsOnLine_WithZeroEpsilon() throws Exception {
        Vector3 vector1 = new Vector3(1, 0, 0);
        Vector3 vector2 = new Vector3(2, 0, 0);
        boolean result = vector1.isOnLine(vector2, 0f);
        assertFalse(result);
    }

    @Test
    void IsOnLine_WithNegativeEpsilon() throws Exception {
        Vector3 vector1 = new Vector3(1, 0, 0);
        Vector3 vector2 = new Vector3(2, 0, 0);
        float epsilon = -0.0001f;
        boolean result = vector1.isOnLine(vector2, epsilon);
        assertFalse(result);
    }

    @Test
    void IsOnLine_WithZeroVector() throws Exception {
        Vector3 vector1 = new Vector3(1, 0, 0);
        Vector3 vector2 = new Vector3(0, 0, 0);
        float epsilon = 0.0001f;
        boolean result = vector1.isOnLine(vector2, epsilon);
        assertTrue(result);
    }
}
