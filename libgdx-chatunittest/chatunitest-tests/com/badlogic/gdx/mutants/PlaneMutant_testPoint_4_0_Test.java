package com.badlogic.gdx.mutants;

import com.badlogic.gdx.mutants.PlaneMutant;
// <-- import PlaneSide enum here
import com.badlogic.gdx.math.Plane.PlaneSide;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;

public class PlaneMutant_testPoint_4_0_Test {

    @Test
    void testPoint_OnPlane() throws Exception {
        // Create a plane with normal (1, 0, 0) and d = 0
        Vector3 normal = new Vector3(1, 0, 0);
        float d = 0;
        PlaneMutant plane = new PlaneMutant(normal, d);
        // Test point that lies on the plane
        assertEquals(PlaneSide.OnPlane, plane.testPoint(0, 0, 0));
    }

    @Test
    void testPoint_Back() throws Exception {
        // Create a plane with normal (1, 0, 0) and d = -2
        Vector3 normal = new Vector3(1, 0, 0);
        float d = -2;
        PlaneMutant plane = new PlaneMutant(normal, d);
        // Test point that lies in the "back" direction
        assertEquals(PlaneSide.Back, plane.testPoint(3, 0, 0));
    }

    @Test
    void testPoint_Front() throws Exception {
        // Create a plane with normal (1, 0, 0) and d = 2
        Vector3 normal = new Vector3(1, 0, 0);
        float d = 2;
        PlaneMutant plane = new PlaneMutant(normal, d);
        // Test point that lies in the "front" direction
        assertEquals(PlaneSide.Front, plane.testPoint(-3, 0, 0));
    }
}
