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

public class Vector3_idt_22_1_Test {

    private Vector3 vector1, vector2, vector3;

    @BeforeEach
    public void setUp() {
        vector1 = new Vector3(1, 1, 1);
        vector2 = new Vector3(0, 0, 0);
        vector3 = new Vector3(1, 1, 1);
    }

    @Test
    public void testIdt() throws Exception {
        // Test with equal vectors
        boolean result1 = (boolean) invokePrivateMethod("idt", vector1, vector1);
        Assertions.assertTrue(result1, "Vectors are equal");
        // Test with different vectors
        boolean result2 = (boolean) invokePrivateMethod("idt", vector1, vector2);
        Assertions.assertFalse(result2, "Vectors are not equal");
        // Test with the same object
        boolean result3 = (boolean) invokePrivateMethod("idt", vector1, vector3);
        Assertions.assertTrue(result3, "Vectors are equal");
    }

    private Object invokePrivateMethod(String methodName, Object instance, Object... args) throws Exception {
        Class<?> clazz = instance.getClass();
        java.lang.reflect.Method method = clazz.getDeclaredMethod(methodName, getParameterTypes(args));
        method.setAccessible(true);
        return method.invoke(instance, args);
    }

    private Class<?>[] getParameterTypes(Object... args) {
        Class<?>[] parameterTypes = new Class<?>[args.length];
        for (int i = 0; i < args.length; i++) {
            parameterTypes[i] = args[i].getClass();
        }
        return parameterTypes;
    }
}
