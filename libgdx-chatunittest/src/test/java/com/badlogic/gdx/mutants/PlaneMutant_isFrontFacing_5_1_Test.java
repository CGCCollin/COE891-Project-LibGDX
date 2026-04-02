package com.badlogic.gdx.mutants;

import com.badlogic.gdx.mutants.PlaneMutant;
import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;

public class PlaneMutant_isFrontFacing_5_1_Test {

    @Test
    public void testIsFrontFacing() throws Exception {
        // Create a new instance of PlaneMutant
        PlaneMutant plane = new PlaneMutant(new Vector3(0, 1, 0), 0);
        // Get the private method isFrontFacing using reflection
        Method method = PlaneMutant.class.getDeclaredMethod("isFrontFacing", Vector3.class);
        // Set the method to accessible
        method.setAccessible(true);
        // Create a new instance of Vector3 for testing
        Vector3 direction = new Vector3(0, -1, 0);
        // Invoke the private method using reflection and get the result
        boolean result = (boolean) method.invoke(plane, direction);
        // Assert that the result is true because the direction vector is in front of the plane
        assertTrue(result);
        // Test with a direction vector that is not in front of the plane
        direction = new Vector3(0, 1, 0);
        result = (boolean) method.invoke(plane, direction);
        assertFalse(result);
    }
}
