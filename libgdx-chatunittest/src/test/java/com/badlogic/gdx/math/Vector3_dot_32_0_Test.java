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

public class Vector3_dot_32_0_Test {

    @Test
    public void testDot() {
        // Test case 1: Normal dot product
        Vector3 vector1 = new Vector3(1, 2, 3);
        Vector3 vector2 = new Vector3(4, 5, 6);
        assertEquals(32, vector1.dot(vector2));
        // Test case 2: Zero vectors
        Vector3 zeroVector = new Vector3(0, 0, 0);
        assertEquals(0, vector1.dot(zeroVector));
        // Test case 3: Vectors with negative coordinates
        Vector3 negativeVector = new Vector3(-1, -2, -3);
        assertEquals(-32, vector1.dot(negativeVector));
        // Test case 4: Vectors with same coordinates
        Vector3 sameVector = new Vector3(1, 2, 3);
        assertEquals(14, vector1.dot(sameVector));
    }
}
