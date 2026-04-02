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

public class Vector3_epsilonEquals_78_0_Test {

    @Test
    public void testEpsilonEquals() {
        // Test with exact values
        Vector3 v1 = new Vector3(1, 2, 3);
        assertTrue(v1.epsilonEquals(1, 2, 3));
        // Test with epsilon value too large
        assertFalse(v1.epsilonEquals(1, 2, 4, 0.000001f));
        // Test with epsilon value too small
        assertTrue(v1.epsilonEquals(1, 2, 3, 0.000001f));
        // Test with negative values
        Vector3 v2 = new Vector3(-1, -2, -3);
        assertTrue(v2.epsilonEquals(-1, -2, -3));
        // Test with zero values
        Vector3 v3 = new Vector3(0, 0, 0);
        assertTrue(v3.epsilonEquals(0, 0, 0));
        // Test with different vector
        Vector3 v4 = new Vector3(1, 2, 3);
        assertFalse(v1.epsilonEquals(v4));
    }
}
