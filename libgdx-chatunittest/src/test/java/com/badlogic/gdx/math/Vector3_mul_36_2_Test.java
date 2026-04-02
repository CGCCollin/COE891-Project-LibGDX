package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;

class Vector3_mul_36_2_Test {

    @Test
    void testMul() throws Exception {
        // Set up a Matrix4 and a Vector3 for testing
        Matrix4 matrix = new Matrix4();
        // Rotate 90 degrees around the y-axis
        matrix.setToRotation(90, 0, 1, 0);
        // Set the x component to 1
        Vector3 vector = new Vector3(1, 0, 0);
        // Get the private method 'mul' using reflection
        Method mulMethod = Vector3.class.getDeclaredMethod("mul", Matrix4.class);
        // Allow access to private methods
        mulMethod.setAccessible(true);
        // Call the 'mul' method and get the result
        Vector3 result = (Vector3) mulMethod.invoke(vector, matrix);
        // Check that the x component of the result is 0 and the y and z components are -1
        assertEquals(0, result.x, 0.0001f);
        assertEquals(-1, result.y, 0.0001f);
        assertEquals(-1, result.z, 0.0001f);
        // Check that the original Vector3 has not changed
        assertEquals(1, vector.x, 0.0001f);
        assertEquals(0, vector.y, 0.0001f);
        assertEquals(0, vector.z, 0.0001f);
    }
}
