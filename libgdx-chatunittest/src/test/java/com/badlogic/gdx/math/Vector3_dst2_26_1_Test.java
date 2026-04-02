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

public class Vector3_dst2_26_1_Test {

    @Test
    public void testDst2() throws Exception {
        // Given
        Vector3 vector = new Vector3(1, 2, 3);
        float x1 = 4;
        float y1 = 5;
        float z1 = 6;
        // When
        float result = vector.dst2(x1, y1, z1);
        // Then
        // (3-4)^2 + (2-5)^2 + (1-6)^2 = 34
        assertEquals(result, 34f);
    }

    @Test
    public void testDst2_zeroVector() throws Exception {
        // Given
        Vector3 vector = new Vector3(0, 0, 0);
        float x1 = 4;
        float y1 = 5;
        float z1 = 6;
        // When
        float result = vector.dst2(x1, y1, z1);
        // Then
        // (0-4)^2 + (0-5)^2 + (0-6)^2 = 34
        assertEquals(result, 34f);
    }

    @Test
    public void testDst2_sameVector() throws Exception {
        // Given
        Vector3 vector = new Vector3(1, 2, 3);
        // When
        float result = vector.dst2(vector.x, vector.y, vector.z);
        // Then
        // (1-1)^2 + (2-2)^2 + (3-3)^2 = 0
        assertEquals(result, 0f);
    }

    @Test
    public void testDst2_negativeNumbers() throws Exception {
        // Given
        Vector3 vector = new Vector3(1, 2, 3);
        float x1 = -4;
        float y1 = -5;
        float z1 = -6;
        // When
        float result = vector.dst2(x1, y1, z1);
        // Then
        // (-4-1)^2 + (-5-2)^2 + (-6-3)^2 = 34
        assertEquals(result, 34f);
    }
}
