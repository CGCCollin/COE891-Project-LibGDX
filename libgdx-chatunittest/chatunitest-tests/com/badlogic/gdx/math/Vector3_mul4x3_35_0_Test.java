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

public class Vector3_mul4x3_35_0_Test {

    @Test
    void testMul4x3() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        float[] matrix = { 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 2, 3, 1 };
        Vector3 result = vector.mul4x3(matrix);
        assertEquals(1, result.x, 0.0001);
        assertEquals(2, result.y, 0.0001);
        assertEquals(3, result.z, 0.0001);
    }
}
