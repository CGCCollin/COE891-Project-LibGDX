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

public class Vector3_traMul_37_4_Test {

    @Test
    public void testTraMul() throws Exception {
        // Create a new instance of the Vector3 class
        Vector3 vector = new Vector3(1, 2, 3);
        // Create a new instance of the Matrix4 class
        Matrix4 matrix = new Matrix4();
        matrix.setToRotation(90f, 0, 1, 0);
        // Invoke the traMul method using reflection
        Method traMulMethod = Vector3.class.getDeclaredMethod("traMul", Matrix4.class);
        traMulMethod.setAccessible(true);
        Vector3 result = (Vector3) traMulMethod.invoke(vector, matrix);
        // Check that the result is as expected
        assertEquals(new Vector3(0, 3, -2), result);
    }
}
