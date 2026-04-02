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

class Vector3_rotate_45_0_Test {

    private final Vector3 vector = new Vector3(1, 0, 0);

    @Test
    void rotate() throws Exception {
        // Test with angle of 90 degrees around the Y-axis
        Vector3 result = vector.rotate(90f, 0, 1, 0);
        assertEquals(0, result.x, 0.0001);
        assertEquals(-1, result.y, 0.0001);
        assertEquals(0, result.z, 0.0001);
        // Test with angle of 90 degrees around the X-axis
        result = vector.rotate(90f, 1, 0, 0);
        assertEquals(-1, result.x, 0.0001);
        assertEquals(0, result.y, 0.0001);
        assertEquals(1, result.z, 0.0001);
        // Test with angle of 90 degrees around the Z-axis
        result = vector.rotate(90f, 0, 0, 1);
        assertEquals(-1, result.x, 0.0001);
        assertEquals(0, result.y, 0.0001);
        assertEquals(-1, result.z, 0.0001);
        // Test with angle of 180 degrees around the Y-axis
        result = vector.rotate(180f, 0, 1, 0);
        assertEquals(0, result.x, 0.0001);
        assertEquals(1, result.y, 0.0001);
        assertEquals(0, result.z, 0.0001);
        // Test with angle of 180 degrees around the X-axis
        result = vector.rotate(180f, 1, 0, 0);
        assertEquals(1, result.x, 0.0001);
        assertEquals(0, result.y, 0.0001);
        assertEquals(-1, result.z, 0.0001);
        // Test with angle of 180 degrees around the Z-axis
        result = vector.rotate(180f, 0, 0, 1);
        assertEquals(-1, result.x, 0.0001);
        assertEquals(0, result.y, 0.0001);
        assertEquals(1, result.z, 0.0001);
        // Test with angle of 360 degrees around any axis
        result = vector.rotate(360f, 0, 1, 0);
        assertEquals(vector.x, result.x, 0.0001);
        assertEquals(vector.y, result.y, 0.0001);
        assertEquals(vector.z, result.z, 0.0001);
        result = vector.rotate(360f, 1, 0, 0);
        assertEquals(vector.x, result.x, 0.0001);
        assertEquals(vector.y, result.y, 0.0001);
        assertEquals(vector.z, result.z, 0.0001);
        result = vector.rotate(360f, 0, 0, 1);
        assertEquals(vector.x, result.x, 0.0001);
        assertEquals(vector.y, result.y, 0.0001);
        assertEquals(vector.z, result.z, 0.0001);
    }
}
