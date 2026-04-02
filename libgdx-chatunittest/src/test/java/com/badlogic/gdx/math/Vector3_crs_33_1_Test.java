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

public class Vector3_crs_33_1_Test {

    @Test
    public void testCrs() throws Exception {
        // Create two vectors to calculate cross product
        Vector3 vector1 = new Vector3(1, 0, 0);
        Vector3 vector2 = new Vector3(0, 1, 0);
        // Calculate the cross product using reflection
        Vector3 result = (Vector3) invokePrivateMethod(vector1, "crs", new Object[] { vector2 });
        // Check if the result is correct
        assertEquals(new Vector3(0, -1, 0), result);
    }

    private static Object invokePrivateMethod(Object instance, String methodName, Object[] args) throws Exception {
        Class<?> clazz = instance.getClass();
        java.lang.reflect.Method method = clazz.getDeclaredMethod(methodName, args[0].getClass());
        method.setAccessible(true);
        return method.invoke(instance, args);
    }
}
