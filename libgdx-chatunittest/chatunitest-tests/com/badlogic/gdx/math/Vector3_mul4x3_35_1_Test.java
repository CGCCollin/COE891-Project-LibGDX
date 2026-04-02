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

class Vector3_mul4x3_35_1_Test {

    @Test
    void testMul4x3() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        float[] matrix = { 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 };
        assertEquals(vector.mul4x3(matrix), new Vector3(1, 2, 3));
    }
}
