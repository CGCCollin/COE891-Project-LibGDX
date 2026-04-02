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

public class Vector3_limit_68_0_Test {

    @Test
    void testLimit() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        float limit = 5f;
        vector.limit(limit);
        assertTrue((Math.pow(vector.x, 2) + Math.pow(vector.y, 2) + Math.pow(vector.z, 2)) <= Math.pow(limit, 2));
    }

    @Test
    void testLimitWithZero() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        float limit = 0f;
        vector.limit(limit);
        assertEquals(new Vector3(), vector);
    }

    @Test
    void testLimitWithNegative() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        float limit = -5f;
        vector.limit(limit);
        assertEquals(new Vector3(), vector);
    }

    @Test
    void testLimitWithLargeNumber() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        float limit = Float.MAX_VALUE;
        vector.limit(limit);
        assertEquals(new Vector3(1, 2, 3), vector);
    }

    @Test
    void testLimitWithSmallNumber() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        float limit = Float.MIN_VALUE;
        vector.limit(limit);
        assertEquals(new Vector3(), vector);
    }

    @Test
    void testLimitWithNaN() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        float limit = Float.NaN;
        vector.limit(limit);
        assertEquals(new Vector3(), vector);
    }

    @Test
    void testLimitWithInfinite() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        float limit = Float.POSITIVE_INFINITY;
        vector.limit(limit);
        assertEquals(new Vector3(1, 2, 3), vector);
    }

    @Test
    void testLimitWithNegativeInfinite() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        float limit = Float.NEGATIVE_INFINITY;
        vector.limit(limit);
        assertEquals(new Vector3(), vector);
    }

    @Test
    void testLimitWithZeroVector() throws Exception {
        Vector3 vector = new Vector3();
        float limit = 5f;
        vector.limit(limit);
        assertEquals(new Vector3(), vector);
    }

    @Test
    void testLimitWithOneVector() throws Exception {
        Vector3 vector = new Vector3(1, 0, 0);
        float limit = 5f;
        vector.limit(limit);
        assertEquals(new Vector3(1, 0, 0), vector);
    }

    @Test
    void testLimitWithNegativeVector() throws Exception {
        Vector3 vector = new Vector3(-1, -2, -3);
        float limit = 5f;
        vector.limit(limit);
        assertEquals(new Vector3(-1, -2, -3), vector);
    }

    @Test
    void testLimitWithLargeNumberVector() throws Exception {
        Vector3 vector = new Vector3(Float.MAX_VALUE, 0, 0);
        float limit = 5f;
        vector.limit(limit);
        assertEquals(new Vector3(1, 0, 0), vector);
    }

    @Test
    void testLimitWithSmallNumberVector() throws Exception {
        Vector3 vector = new Vector3(Float.MIN_VALUE, 0, 0);
        float limit = 5f;
        vector.limit(limit);
        assertEquals(new Vector3(), vector);
    }
}
