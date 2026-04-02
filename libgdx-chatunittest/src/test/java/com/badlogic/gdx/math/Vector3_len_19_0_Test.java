package com.badlogic.gdx.math;

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

public class Vector3_len_19_0_Test {

    @Test
    void testLen() throws Exception {
        // Arrange
        // Vector (3, 4, 0) has length 5
        Vector3 vector = new Vector3(3, 4, 0);
        // Act
        float len = vector.len();
        // Assert
        assertEquals(5.0f, len, 0.0001);
    }

    @Test
    void testLenWithZeroVector() throws Exception {
        // Arrange
        // Zero vector has length 0
        Vector3 zeroVector = Vector3.Zero;
        // Act
        float len = zeroVector.len();
        // Assert
        assertEquals(0.0f, len, 0.0001);
    }

    @Test
    void testLenWithNegativeValues() throws Exception {
        // Arrange
        // Negative vector has length 5
        Vector3 negativeVector = new Vector3(-3, -4, 0);
        // Act
        float len = negativeVector.len();
        // Assert
        assertEquals(5.0f, len, 0.0001);
    }

    @Test
    void testLenWithDecimalValues() throws Exception {
        // Arrange
        // Decimal vector has length 5.0990195135927845
        Vector3 decimalVector = new Vector3(2.5f, 3.5f, 0);
        // Act
        float len = decimalVector.len();
        // Assert
        assertEquals(5.0990195135927845f, len, 0.0001);
    }
}
