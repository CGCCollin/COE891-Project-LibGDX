package com.badlogic.gdx.math;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
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

public class Vector3_dst_25_0_Test {

    private Vector3 vector3;

    @BeforeEach
    public void setUp() throws Exception {
        vector3 = new Vector3();
    }

    @Test
    public void testDst_WithZeroVector_ReturnsZero() throws NoSuchFieldException, IllegalAccessException {
        // Given
        float x = 0;
        float y = 0;
        float z = 0;
        // When
        float dst = vector3.dst(x, y, z);
        // Then
        assertEquals(0, dst, 0.0001);
    }

    @Test
    public void testDst_WithNonZeroVector_ReturnsCorrectDistance() throws NoSuchFieldException, IllegalAccessException {
        // Given
        float x = 3;
        float y = 4;
        float z = 0;
        // When
        float dst = vector3.dst(x, y, z);
        // Then
        assertEquals(5, dst, 0.0001);
    }

    @Test
    public void testDst_WithSameVector_ReturnsZero() throws NoSuchFieldException, IllegalAccessException {
        // Given
        float x = 1;
        float y = 2;
        float z = 3;
        vector3.set(x, y, z);
        // When
        float dst = vector3.dst(x, y, z);
        // Then
        assertEquals(0, dst, 0.0001);
    }

    @Test
    public void testDst_WithNegativeVector_ReturnsCorrectDistance() throws NoSuchFieldException, IllegalAccessException {
        // Given
        float x = -3;
        float y = -4;
        float z = 0;
        // When
        float dst = vector3.dst(x, y, z);
        // Then
        assertEquals(5, dst, 0.0001);
    }

    @Test
    public void testDst_WithDecimalVector_ReturnsCorrectDistance() throws NoSuchFieldException, IllegalAccessException {
        // Given
        float x = 3.5f;
        float y = 4.75f;
        float z = 0;
        // When
        float dst = vector3.dst(x, y, z);
        // Then
        assertEquals(6.25, dst, 0.0001);
    }
}
