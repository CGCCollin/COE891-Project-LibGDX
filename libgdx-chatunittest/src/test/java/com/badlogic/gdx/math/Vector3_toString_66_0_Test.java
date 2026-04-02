package com.badlogic.gdx.math;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class Vector3_toString_66_0_Test {

    @Test
    void testToString() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 2, 3);
        String expectedResult = "(1,2,3)";
        // Act
        Object result = invokeMethod(vector, "toString");
        // Assert
        // Cast result to String before comparing
        assertEquals(expectedResult, (String) result);
    }

    private static Object invokeMethod(Object instance, String methodName) throws Exception {
        return invokeMethod(instance, methodName, new Class<?>[] {}, new Object[] {});
    }

    private static Object invokeMethod(Object instance, String methodName, Class<?>[] parameterTypes, Object[] parameters) throws Exception {
        java.lang.reflect.Method method = instance.getClass().getDeclaredMethod(methodName, parameterTypes);
        method.setAccessible(true);
        return method.invoke(instance, parameters);
    }
}
