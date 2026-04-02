package com.badlogic.gdx.mutants;

import static java.lang.reflect.Method.*;
import com.badlogic.gdx.mutants.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.NumberUtils;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import com.badlogic.gdx.math.*;

@ExtendWith(MockitoExtension.class)
public class CircleMutant_overlaps_12_1_Test {

    private final Class<CircleMutant> circleClass = CircleMutant.class;

    private CircleMutant circleInstance;

    @BeforeEach
    public void setUp() throws Exception {
        // Create an instance of the focal class using reflection
        circleInstance = (CircleMutant) circleClass.getDeclaredConstructor().newInstance();
    }

    @Test
    public void testOverlapsPositiveCases() throws Exception {
        // Test overlapping circles with different positions and radii
        CircleMutant c1 = new CircleMutant(0, 0, 5);
        CircleMutant c2 = new CircleMutant(3, 4, 6);
        assertTrue((boolean) circleClass.getMethod("overlaps", CircleMutant.class).invoke(circleInstance, c1));
        assertTrue((boolean) circleClass.getMethod("overlaps", CircleMutant.class).invoke(circleInstance, c2));
        // Test overlapping circles with same position and different radii
        c1 = new CircleMutant(0, 0, 5);
        c2 = new CircleMutant(0, 0, 6);
        assertTrue((boolean) circleClass.getMethod("overlaps", CircleMutant.class).invoke(circleInstance, c1));
        assertFalse((boolean) circleClass.getMethod("overlaps", CircleMutant.class).invoke(circleInstance, c2));
        // Test overlapping circles with same position and radii
        c1 = new CircleMutant(0, 0, 5);
        c2 = new CircleMutant(0, 0, 5);
        assertTrue((boolean) circleClass.getMethod("overlaps", CircleMutant.class).invoke(circleInstance, c1));
        assertFalse((boolean) circleClass.getMethod("overlaps", CircleMutant.class).invoke(circleInstance, c2));
    }
}
