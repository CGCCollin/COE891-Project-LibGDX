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

class Vector3_dot_32_2_Test {

    private Vector3 vector1 = new Vector3(1, 2, 3);

    private Vector3 vector2 = new Vector3(4, 5, 6);

    @Test
    void dot() throws Exception {
        assertEquals(14.0f, vector1.dot(vector2));
    }

    @Test
    void set() throws Exception {
        Vector3 result = vector1.set(7, 8, 9);
        assertEquals(7, result.x);
        assertEquals(8, result.y);
        assertEquals(9, result.z);
    }

    @Test
    void add() throws Exception {
        Vector3 result = vector1.add(vector2);
        assertEquals(5, result.x);
        assertEquals(7, result.y);
        assertEquals(9, result.z);
        result = vector1.add(10);
        assertEquals(11, result.x);
        assertEquals(12, result.y);
        assertEquals(13, result.z);
        result = vector1.add(vector2.x, vector2.y, vector2.z);
        assertEquals(5, result.x);
        assertEquals(7, result.y);
        assertEquals(9, result.z);
    }

    @Test
    void sub() throws Exception {
        Vector3 result = vector1.sub(vector2);
        assertEquals(-3, result.x);
        assertEquals(-3, result.y);
        assertEquals(-3, result.z);
        result = vector1.sub(10);
        assertEquals(-9, result.x);
        assertEquals(-8, result.y);
        assertEquals(-7, result.z);
        result = vector1.sub(vector2.x, vector2.y, vector2.z);
        assertEquals(-3, result.x);
        assertEquals(-3, result.y);
        assertEquals(-3, result.z);
    }

    @Test
    void scl() throws Exception {
        Vector3 result = vector1.scl(vector2);
        assertEquals(4, result.x);
        assertEquals(10, result.y);
        assertEquals(18, result.z);
        result = vector1.scl(10);
        assertEquals(10, result.x);
        assertEquals(20, result.y);
        assertEquals(30, result.z);
        result = vector1.scl(vector2.x, vector2.y, vector2.z);
        assertEquals(4, result.x);
        assertEquals(10, result.y);
        assertEquals(18, result.z);
    }

    @Test
    void crs() throws Exception {
        Vector3 result = vector1.crs(vector2);
        assertEquals(-6, result.x);
        assertEquals(12, result.y);
        assertEquals(-6, result.z);
    }

    @Test
    public void testToString() throws Exception {
        String expected = "Vector3{x=1.0f, y=2.0f, z=3.0f}";
        assertEquals(expected, vector1.toString());
    }
}
