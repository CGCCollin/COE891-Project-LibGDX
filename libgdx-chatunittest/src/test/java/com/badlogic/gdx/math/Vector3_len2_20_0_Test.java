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

public class Vector3_len2_20_0_Test {

    @Test
    void testLen2() {
        // Test with positive inputs
        assertEquals(Vector3.len2(1, 2, 3), 14);
        // Test with negative inputs
        assertEquals(Vector3.len2(-1, -2, -3), 14);
        // Test with zero inputs
        assertEquals(Vector3.len2(0, 0, 0), 0);
        // Test with floating point inputs
        assertEquals(Vector3.len2(1.5f, 2.5f, 3.5f), 15.625);
        // Test with negative floating point inputs
        assertEquals(Vector3.len2(-1.5f, -2.5f, -3.5f), 15.625);
    }
}
