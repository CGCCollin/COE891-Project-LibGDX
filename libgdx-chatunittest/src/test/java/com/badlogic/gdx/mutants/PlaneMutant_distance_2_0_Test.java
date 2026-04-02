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

public class PlaneMutant_distance_2_0_Test {

    @Test
    void testDistance() throws Exception {
        // Create a new instance of the PlaneMutant class
        PlaneMutant plane = new PlaneMutant(new Vector3(1, 0, 0), 0);
        // Get the distance method using reflection
        Method distanceMethod = PlaneMutant.class.getDeclaredMethod("distance", Vector3.class);
        // Set the method accessible
        distanceMethod.setAccessible(true);
        // Create a new instance of the Vector3 class with coordinates (1, 0, 0)
        Vector3 point = new Vector3(1, 0, 0);
        // Call the distance method using reflection and get the result
        float distance = (float) distanceMethod.invoke(plane, point);
        // Assert that the distance is equal to 1.0f
        assert distance == 1.0f : "The distance should be 1.0f";
    }
}
