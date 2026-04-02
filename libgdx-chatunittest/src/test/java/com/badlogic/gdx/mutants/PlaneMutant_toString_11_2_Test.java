package com.badlogic.gdx.mutants;

import com.badlogic.gdx.mutants.PlaneMutant;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;

public class PlaneMutant_toString_11_2_Test {

    @Test
    public void testToString() throws Exception {
        // Arrange
        PlaneMutant plane = new PlaneMutant();
        plane.normal.set(1, 0, 0);
        plane.d = 3;
        // Act
        String result = (String) invokeMethod(plane, "toString");
        // Assert
        assertEquals("(1.0,0.0,0.0), 3.0", result);
    }

    private Object invokeMethod(Object obj, String methodName, Class<?>... parameterTypes) throws Exception {
        java.lang.reflect.Method method = obj.getClass().getDeclaredMethod(methodName, parameterTypes);
        method.setAccessible(true);
        return method.invoke(obj);
    }
}
