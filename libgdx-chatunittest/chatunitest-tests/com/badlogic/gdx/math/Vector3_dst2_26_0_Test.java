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

public class Vector3_dst2_26_0_Test {

    @Test
    void testDst2() throws Exception {
        Vector3 vector1 = new Vector3(1, 0, 0);
        Vector3 vector2 = new Vector3(0, 1, 0);
        float result = vector1.dst2(vector2.x, vector2.y, vector2.z);
        assertEquals(result, 1f);
    }

    @Test
    void testDst2WithPositiveValues() throws Exception {
        Vector3 vector1 = new Vector3(1, 0, 0);
        Vector3 vector2 = new Vector3(2, 0, 0);
        float result = vector1.dst2(vector2.x, vector2.y, vector2.z);
        assertEquals(result, 4f);
    }

    @Test
    void testDst2WithNegativeValues() throws Exception {
        Vector3 vector1 = new Vector3(-1, 0, 0);
        Vector3 vector2 = new Vector3(0, 0, 0);
        float result = vector1.dst2(vector2.x, vector2.y, vector2.z);
        assertEquals(result, 1f);
    }

    @Test
    void testDst2WithZeroValues() throws Exception {
        Vector3 vector1 = new Vector3(0, 0, 0);
        Vector3 vector2 = new Vector3(0, 0, 0);
        float result = vector1.dst2(vector2.x, vector2.y, vector2.z);
        assertEquals(result, 0f);
    }
}
