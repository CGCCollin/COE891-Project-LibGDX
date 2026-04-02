package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class Vector3_prj_41_1_Test {

    @Test
    void testPrj() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 2, 3);
        Matrix4 matrix = new Matrix4();
        // Use axis vector and angle instead of individual angles
        matrix.setToRotation(new Vector3(0, 0, 1), 45f);
        // Act
        Vector3 result = (Vector3) invokeMethod(vector, "prj", matrix);
        // Assert
        assertEquals(result.x, 2.23606797749979f, 0.0001);
        assertEquals(result.y, 4.47213595499958f, 0.0001);
        assertEquals(result.z, 6.708203932499369f, 0.0001);
    }

    @Test
    void testPrjWithZeroMatrix() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 2, 3);
        Matrix4 matrix = new Matrix4();
        // Set the matrix to zero instead of identity
        // Use idt() instead of setToZero()
        matrix.idt();
        // Act
        assertThrows(GdxRuntimeException.class, () -> invokeMethod(vector, "prj", matrix));
    }

    private Object invokeMethod(Object instance, String methodName, Object... parameters) throws Exception {
        Class<?>[] parameterTypes = new Class[parameters.length];
        for (int i = 0; i < parameters.length; i++) {
            parameterTypes[i] = parameters[i].getClass();
        }
        return instance.getClass().getMethod(methodName, parameterTypes).invoke(instance, parameters);
    }
}
