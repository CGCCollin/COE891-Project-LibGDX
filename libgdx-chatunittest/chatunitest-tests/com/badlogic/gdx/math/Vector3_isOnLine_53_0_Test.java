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

class Vector3_isOnLine_53_0_Test {

    @Test
    void isOnLine_WithValidInputs_ReturnTrue() {
        Vector3 vector1 = new Vector3(1, 0, 0);
        vector1.x = 1f;
        vector1.y = 0f;
        vector1.z = 0f;
        Vector3 vector2 = new Vector3(0, 1, 0);
        vector2.x = 0f;
        vector2.y = 1f;
        vector2.z = 0f;
        float epsilon = 0.0001f;
        assertTrue(vector1.isOnLine(vector2, epsilon));
    }

    @Test
    void IsOnLine_WithInvalidInputs_ReturnFalse() {
        Vector3 vector1 = new Vector3(1, 0, 0);
        vector1.x = 1f;
        vector1.y = 0f;
        vector1.z = 0f;
        Vector3 vector2 = new Vector3(0, 0, 1);
        vector2.x = 0f;
        vector2.y = 0f;
        vector2.z = 1f;
        float epsilon = 0.0001f;
        assertFalse(vector1.isOnLine(vector2, epsilon));
    }

    @Test
    void IsOnLine_WithNegativeEpsilon_ReturnTrue() {
        Vector3 vector1 = new Vector3(1, 0, 0);
        vector1.x = 1f;
        vector1.y = 0f;
        vector1.z = 0f;
        Vector3 vector2 = new Vector3(0, 1, 0);
        vector2.x = 0f;
        vector2.y = 1f;
        vector2.z = 0f;
        float epsilon = -0.0001f;
        assertTrue(vector1.isOnLine(vector2, epsilon));
    }

    @Test
    void IsOnLine_WithZeroEpsilon_ReturnFalse() {
        Vector3 vector1 = new Vector3(1, 0, 0);
        vector1.x = 1f;
        vector1.y = 0f;
        vector1.z = 0f;
        Vector3 vector2 = new Vector3(0, 1, 0);
        vector2.x = 0f;
        vector2.y = 1f;
        vector2.z = 0f;
        float epsilon = 0f;
        assertFalse(vector1.isOnLine(vector2, epsilon));
    }
}
