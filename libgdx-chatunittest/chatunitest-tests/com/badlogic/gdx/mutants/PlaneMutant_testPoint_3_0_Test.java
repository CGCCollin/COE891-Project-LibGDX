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

public class // Add more tests as needed to cover all possible scenarios
PlaneMutant_testPoint_3_0_Test {

    private PlaneMutant plane;

    private Vector3 point1, point2, point3, normal;

    @BeforeEach
    void setUp() {
        normal = new Vector3(0, 1, 0);
        plane = new PlaneMutant(normal, 0);
        point1 = new Vector3(0, 0, 1);
        point2 = new Vector3(0, 1, 1);
        point3 = new Vector3(1, 0, 1);
    }

    @Test
    void testPointOnPlane() {
        assertEquals(PlaneMutant.PlaneSide.OnPlane, plane.testPoint(new Vector3(0, 0, 0)));
    }

    @Test
    void testPointFront() {
        assertEquals(PlaneMutant.PlaneSide.Front, plane.testPoint(new Vector3(1, 1, 1)));
    }

    @Test
    void testPointBack() {
        assertEquals(PlaneMutant.PlaneSide.Back, plane.testPoint(new Vector3(-1, -1, -1)));
    }

    @Test
    void testNormalization() {
        Vector3 newNormal = new Vector3(0, 1, 0);
        plane.set(point1, point2, point3);
        assertEquals(newNormal, plane.getNormal());
    }

    @Test
    void testDistance() {
        plane.set(point1, point2, point3);
        assertEquals(-1f, plane.getD());
    }
}
