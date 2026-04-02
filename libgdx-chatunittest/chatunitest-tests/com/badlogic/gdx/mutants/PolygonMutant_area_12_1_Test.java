package com.badlogic.gdx.mutants;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;

public class PolygonMutant_area_12_1_Test {

    private PolygonMutant polygonMutant;

    @BeforeEach
    void setUp() {
        polygonMutant = new PolygonMutant(new float[] { 0, 0, 1, 0, 1, 1, 0, 1 });
    }

    @Test
    void testArea() throws Exception {
        // Arrange: Set the polygon vertices to a square with sides of length 1
        PolygonMutant polygonMutant = new PolygonMutant(new float[] { 0, 0, 1, 0, 1, 1, 0, 1 });
        // Act: Calculate the area of the polygon
        float area = (float) invokePrivateMethod("area", polygonMutant);
        // Assert: The area should be equal to 1
        assertEquals(1f, area);
    }

    private Object invokePrivateMethod(String methodName, Object instance, Class<?>... parameterTypes) throws Exception {
        java.lang.reflect.Method method = PolygonMutant.class.getDeclaredMethod(methodName, parameterTypes);
        method.setAccessible(true);
        return method.invoke(instance, (Object[]) null);
    }
}
