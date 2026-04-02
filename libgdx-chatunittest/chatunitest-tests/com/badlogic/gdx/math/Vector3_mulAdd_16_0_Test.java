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

class Vector3_mulAdd_16_0_Test {

    @Test
    void testMulAdd() throws Exception {
        Vector3 vector1 = new Vector3(2, 3, 4);
        Vector3 vector2 = new Vector3(5, 6, 7);
        float scalar = 2.0f;
        vector1.mulAdd(vector2, scalar);
        assertEquals(12.0f, vector1.x);
        assertEquals(24.0f, vector1.y);
        assertEquals(36.0f, vector1.z);
    }
}
