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

class Vector3_len_18_0_Test {

    private Vector3 vector3;

    @BeforeEach
    void setUp() {
        vector3 = new Vector3();
    }

    @AfterEach
    void tearDown() {
        vector3 = null;
    }

    @Test
    void len_withZeroVector_returnsZero() {
        float result = vector3.len(0, 0, 0);
        assertEquals(0f, result, 0.0001);
    }

    @Test
    void len_withXUnitVector_returnsOne() {
        float result = vector3.len(1, 0, 0);
        assertEquals(1f, result, 0.0001);
    }

    @Test
    void len_withYUnitVector_returnsOne() {
        float result = vector3.len(0, 1, 0);
        assertEquals(1f, result, 0.0001);
    }

    @Test
    void len_withZUnitVector_returnsOne() {
        float result = vector3.len(0, 0, 1);
        assertEquals(1f, result, 0.0001);
    }

    @Test
    void len_withNegativeXUnitVector_returnsOne() {
        float result = vector3.len(-1, 0, 0);
        assertEquals(1f, result, 0.0001);
    }

    @Test
    void len_withNegativeYUnitVector_returnsOne() {
        float result = vector3.len(0, -1, 0);
        assertEquals(1f, result, 0.0001);
    }

    @Test
    void len_withNegativeZUnitVector_returnsOne() {
        float result = vector3.len(0, 0, -1);
        assertEquals(1f, result, 0.0001);
    }

    @Test
    void len_withPositiveXUnitVector_returnsOne() {
        float result = vector3.len(1, 0, 0);
        assertEquals(1f, result, 0.0001);
    }

    @Test
    void len_withPositiveYUnitVector_returnsOne() {
        float result = vector3.len(0, 1, 0);
        assertEquals(1f, result, 0.0001);
    }

    @Test
    void len_withPositiveZUnitVector_returnsOne() {
        float result = vector3.len(0, 0, 1);
        assertEquals(1f, result, 0.0001);
    }

    @Test
    void len_withRandomVector_returnsCorrectLength() {
        float x = (float) Math.random();
        float y = (float) Math.random();
        float z = (float) Math.random();
        float result = vector3.len(x, y, z);
        assertEquals((float) Math.sqrt(x * x + y * y + z * z), result, 0.0001);
    }
}
