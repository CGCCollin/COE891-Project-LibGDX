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

public class Vector3_dot_30_0_Test {

    @Test
    public void testDot() throws Exception {
        Vector3 vector = new Vector3();
        float x1 = 1f, y1 = 2f, z1 = 3f;
        float x2 = 4f, y2 = 5f, z2 = 6f;
        float result = (float) invokePrivateMethod(vector, "dot", new Class[] { float.class, float.class, float.class, float.class, float.class, float.class }, x1, y1, z1, x2, y2, z2);
        assertEquals(x1 * x2 + y1 * y2 + z1 * z2, result);
    }

    private static Object invokePrivateMethod(Object instance, String methodName, Class<?>[] parameterTypes, Object... args) throws Exception {
        Class<?> clazz = instance.getClass();
        java.lang.reflect.Method method = clazz.getDeclaredMethod(methodName, parameterTypes);
        method.setAccessible(true);
        return method.invoke(instance, args);
    }
}
