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

public class Vector3_mulAdd_17_0_Test {

    @Test
    public void testMulAdd() throws Exception {
        // Create two vectors
        Vector3 vec1 = new Vector3(1, 2, 3);
        Vector3 mulVec = new Vector3(4, 5, 6);
        // Call the method under test with reflection
        Vector3 result = (Vector3) invokeMethod(vec1, "mulAdd", new Class[] { Vector3.class, Vector3.class }, new Object[] { vec1, mulVec });
        // Check that the result is correct
        assertEquals(5, result.x);
        assertEquals(7, result.y);
        assertEquals(9, result.z);
    }

    private static Object invokeMethod(Object obj, String methodName, Class<?>[] paramTypes, Object[] params) throws Exception {
        java.lang.reflect.Method method = obj.getClass().getDeclaredMethod(methodName, paramTypes);
        method.setAccessible(true);
        return method.invoke(obj, params);
    }
}
