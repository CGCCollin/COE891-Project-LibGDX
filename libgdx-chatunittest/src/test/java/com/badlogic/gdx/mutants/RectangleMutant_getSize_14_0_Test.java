package com.badlogic.gdx.mutants;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import com.badlogic.gdx.utils.Scaling;

public class RectangleMutant_getSize_14_0_Test {

    private RectangleMutant rectangleMutant;

    @BeforeEach
    public void setUp() {
        rectangleMutant = new RectangleMutant();
    }

    @Test
    public void testGetSize_ReturnsCorrectVector2() throws Exception {
        // Arrange
        Vector2 inputSize = new Vector2(0, 0);
        Vector2 expectedOutputSize = new Vector2(10f, 20f);
        rectangleMutant.setWidth(10f);
        rectangleMutant.setHeight(20f);
        // Act
        Vector2 result = (Vector2) invokeMethod(rectangleMutant, "getSize", inputSize);
        // Assert
        assertEquals(expectedOutputSize, result);
    }

    @Test
    public void testGetSize_ModifiesInputVector() throws Exception {
        // Arrange
        Vector2 inputSize = new Vector2(0, 0);
        rectangleMutant.setWidth(10f);
        rectangleMutant.setHeight(20f);
        // Act
        invokeMethod(rectangleMutant, "getSize", inputSize);
        // Assert
        assertEquals(new Vector2(10f, 20f), inputSize);
    }

    private static Object invokeMethod(Object obj, String methodName, Object... args) throws Exception {
        Class<?> clazz = obj.getClass();
        for (Class<?> c = clazz; c != null; c = c.getSuperclass()) {
            try {
                return c.getDeclaredMethod(methodName, getParameterTypes(args)).invoke(obj, args);
            } catch (NoSuchMethodException e) {
                // ignore
            }
        }
        throw new NoSuchMethodException("No such method: " + clazz + "." + methodName);
    }

    private static Class<?>[] getParameterTypes(Object... args) {
        Class<?>[] parameterTypes = new Class<?>[args.length];
        for (int i = 0; i < args.length; i++) {
            parameterTypes[i] = args[i].getClass();
        }
        return parameterTypes;
    }
}
