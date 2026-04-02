package com.badlogic.gdx.math;

import java.lang.reflect.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class Vector3_rotateRad_46_2_Test {

    private static final float EPSILON = 0.0001f;

    private Vector3 vector;

    private Field xField, yField, zField;

    @BeforeEach
    void setUp() throws Exception {
        vector = new Vector3();
        xField = Vector3.class.getDeclaredField("x");
        yField = Vector3.class.getDeclaredField("y");
        zField = Vector3.class.getDeclaredField("z");
        xField.setAccessible(true);
        yField.setAccessible(true);
        zField.setAccessible(true);
    }

    @Test
    void testRotateRad() throws Exception {
        // Given
        float radians = 1f;
        float axisX = 0f;
        float axisY = 1f;
        float axisZ = 0f;
        Vector3 expected = new Vector3(vector.x, vector.y + 1f, vector.z);
        // When
        Method rotateRad = Vector3.class.getDeclaredMethod("rotateRad", float.class, float.class, float.class, float.class);
        rotateRad.setAccessible(true);
        Vector3 result = (Vector3) rotateRad.invoke(vector, radians, axisX, axisY, axisZ);
        // Then
        assertEquals((float) xField.get(result), expected.x, EPSILON, "X value is not close to the expected value");
        assertEquals((float) yField.get(result), expected.y, EPSILON, "Y value is not close to the expected value");
        assertEquals((float) zField.get(result), expected.z, EPSILON, "Z value is not close to the expected value");
        // Check that the vector has not changed after rotation
        assertEquals((float) xField.get(vector), 0f, EPSILON, "Original X value should be unchanged");
        assertEquals((float) yField.get(vector), 0f, EPSILON, "Original Y value should be unchanged");
        assertEquals((float) zField.get(vector), 0f, EPSILON, "Original Z value should be unchanged");
    }
}
