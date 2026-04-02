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

public class Vector3_scl_14_0_Test {

    @Test
    void testScl() throws Exception {
        // Create a new instance of the focal class
        Vector3 vector = new Vector3(1, 2, 3);
        // Create another Vector3 object to use in scaling
        Vector3 other = new Vector3(0.5f, 1.5f, 2.5f);
        // Call the method with reflection
        Vector3 result = (Vector3) invokeMethod(vector, "scl", new Object[] { other });
        // Check that the scaling is correct
        assertEquals(0.5f, result.x, 0.0001);
        assertEquals(3.75f, result.y, 0.0001);
        assertEquals(6.25f, result.z, 0.0001);
    }

    private static Object invokeMethod(Object obj, String methodName, Object[] args) throws Exception {
        Class<?> clazz = obj.getClass();
        for (java.lang.reflect.Method method : clazz.getDeclaredMethods()) {
            if (method.getName().equals(methodName)) {
                method.setAccessible(true);
                return method.invoke(obj, args);
            }
        }
        throw new NoSuchMethodException("No such method: " + methodName);
    }
}
