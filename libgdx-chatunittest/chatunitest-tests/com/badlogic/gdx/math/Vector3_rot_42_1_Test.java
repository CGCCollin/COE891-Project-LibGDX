package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import java.lang.reflect.Method;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class Vector3_rot_42_1_Test {

    @Test
    void testRot() throws Exception {
        // Given
        Vector3 vector = new Vector3(1, 2, 3);
        Matrix4 matrix = new Matrix4();
        // cast angle to float
        matrix.setToRotation(0, 1, 0, (float) Math.toRadians(90));
        // When
        Method rotMethod = Vector3.class.getDeclaredMethod("rot", Matrix4.class);
        Vector3 result = (Vector3) rotMethod.invoke(vector, matrix);
        // Then
        assertEquals(-2, result.x, 0.001);
        assertEquals(1, result.y, 0.001);
        assertEquals(3, result.z, 0.001);
    }
}
