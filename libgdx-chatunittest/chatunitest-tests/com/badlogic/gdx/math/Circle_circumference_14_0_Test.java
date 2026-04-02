package com.badlogic.gdx.math;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.NumberUtils;

public class Circle_circumference_14_0_Test {

    @Test
    void testCircumference() throws Exception {
        // Arrange
        Circle circle = new Circle(0, 0, 5);
        // Act
        float circumference = (Float) invokePrivateMethod(circle, "circumference");
        // Assert
        assertEquals(MathUtils.PI2 * 5, circumference);
    }

    private Object invokePrivateMethod(Object object, String methodName) throws Exception {
        Class<?> clazz = object.getClass();
        java.lang.reflect.Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        return method.invoke(object);
    }
}
