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

class Vector3_scl_13_0_Test {

    @Test
    void scl() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        float scalar = 2f;
        Vector3 result = vector.scl(scalar);
        assertEquals(2f, result.x);
        assertEquals(4f, result.y);
        assertEquals(6f, result.z);
    }

    @Test
    void scl_withZeroScalar() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        float scalar = 0f;
        Vector3 result = vector.scl(scalar);
        assertEquals(0f, result.x);
        assertEquals(0f, result.y);
        assertEquals(0f, result.z);
    }

    @Test
    void scl_withNegativeScalar() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        float scalar = -2f;
        Vector3 result = vector.scl(scalar);
        assertEquals(-2f, result.x);
        assertEquals(-4f, result.y);
        assertEquals(-6f, result.z);
    }

    @Test
    void scl_withLargeScalar() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        float scalar = Float.MAX_VALUE;
        Vector3 result = vector.scl(scalar);
        assertEquals(Float.MAX_VALUE, result.x);
        assertEquals(Float.MAX_VALUE, result.y);
        assertEquals(Float.MAX_VALUE, result.z);
    }

    @Test
    void scl_withSmallScalar() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        float scalar = Float.MIN_NORMAL;
        Vector3 result = vector.scl(scalar);
        assertEquals(Float.MIN_NORMAL, result.x);
        assertEquals(Float.MIN_NORMAL, result.y);
        assertEquals(Float.MIN_NORMAL, result.z);
    }

    @Test
    void scl_withZeroVector() throws Exception {
        Vector3 vector = new Vector3(0, 0, 0);
        float scalar = 2f;
        Vector3 result = vector.scl(scalar);
        assertEquals(0f, result.x);
        assertEquals(0f, result.y);
        assertEquals(0f, result.z);
    }

    @Test
    void scl_withMaxValues() throws Exception {
        Vector3 vector = new Vector3(Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE);
        float scalar = 2f;
        Vector3 result = vector.scl(scalar);
        assertEquals(Float.MAX_VALUE, result.x);
        assertEquals(Float.MAX_VALUE, result.y);
        assertEquals(Float.MAX_VALUE, result.z);
    }

    @Test
    void scl_withMinValues() throws Exception {
        Vector3 vector = new Vector3(-Float.MIN_NORMAL, -Float.MIN_NORMAL, -Float.MIN_NORMAL);
        float scalar = 2f;
        Vector3 result = vector.scl(scalar);
        assertEquals(-Float.MIN_NORMAL, result.x);
        assertEquals(-Float.MIN_NORMAL, result.y);
        assertEquals(-Float.MIN_NORMAL, result.z);
    }
}
