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

public class Vector3_dot_30_1_Test {

    @Test
    public void testDot() {
        // Test with positive values
        Vector3 v1 = new Vector3(1, 2, 3);
        Vector3 v2 = new Vector3(4, 5, 6);
        assertEquals(32.0f, Vector3.dot(v1.x, v1.y, v1.z, v2.x, v2.y, v2.z), 0.0001);
        // Test with negative values
        Vector3 v3 = new Vector3(-1, -2, -3);
        Vector3 v4 = new Vector3(4, 5, 6);
        assertEquals(-32.0f, Vector3.dot(v3.x, v3.y, v3.z, v4.x, v4.y, v4.z), 0.0001);
        // Test with zero values
        Vector3 v5 = new Vector3(0, 0, 0);
        Vector3 v6 = new Vector3(4, 5, 6);
        assertEquals(0.0f, Vector3.dot(v5.x, v5.y, v5.z, v6.x, v6.y, v6.z), 0.0001);
    }
}
