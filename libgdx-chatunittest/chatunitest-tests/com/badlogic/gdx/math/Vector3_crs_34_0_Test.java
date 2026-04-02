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

class Vector3_crs_34_0_Test {

    @Test
    void testCrs() throws NoSuchFieldException, IllegalAccessException {
        Vector3 vector3 = new Vector3();
        // Test with positive values
        vector3.crs(1f, 2f, 3f);
        assertEquals(-5.0f, vector3.x);
        assertEquals(10.0f, vector3.y);
        assertEquals(-3.0f, vector3.z);
        // Test with negative values
        vector3.crs(-1f, -2f, -3f);
        assertEquals(5.0f, vector3.x);
        assertEquals(-10.0f, vector3.y);
        assertEquals(3.0f, vector3.z);
        // Test with zero values
        vector3.crs(0f, 0f, 0f);
        assertEquals(0.0f, vector3.x);
        assertEquals(0.0f, vector3.y);
        assertEquals(0.0f, vector3.z);
        // Test with same values
        vector3.crs(1f, 1f, 1f);
        assertEquals(-1.0f, vector3.x);
        assertEquals(2.0f, vector3.y);
        assertEquals(-1.0f, vector3.z);
        // Test with floating point precision issues
        vector3.crs(123456789.0f, 987654321.0f, -123456789.0f);
        assertEquals(-987654321.0f, vector3.x);
        assertEquals(246913578.0f, vector3.y);
        assertEquals(123456789.0f, vector3.z);
    }
}
