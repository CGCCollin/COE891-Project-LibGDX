package com.badlogic.gdx.mutants;

import java.lang.reflect.*;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;
import com.badlogic.gdx.utils.NumberUtils;

class CircleMutant_contains_11_0_Test {

    CircleMutant circle, smallerCircle, biggerCircle, overlappingCircle, nonOverlappingCircle;

    @BeforeEach
    void setUp() throws Exception {
        circle = new CircleMutant(0f, 0f, 5f);
        smallerCircle = new CircleMutant(2.5f, 2.5f, 3f);
        biggerCircle = new CircleMutant(7.5f, 7.5f, 8f);
        overlappingCircle = new CircleMutant(0f, 0f, 6f);
        nonOverlappingCircle = new CircleMutant(10f, 10f, 1f);
    }

    @Test
    void testContains() throws Exception {
        Method containsMethod = CircleMutant.class.getDeclaredMethod("contains", CircleMutant.class);
        containsMethod.setAccessible(true);
        // Test that the circle contains itself
        assertTrue((boolean) containsMethod.invoke(circle, circle));
        // Test that the circle does not contain a smaller circle
        assertFalse((boolean) containsMethod.invoke(circle, smallerCircle));
        // Test that the circle contains a bigger circle
        assertTrue((boolean) containsMethod.invoke(circle, biggerCircle));
        // Test that the circle overlaps with another circle
        assertTrue((boolean) containsMethod.invoke(circle, overlappingCircle));
        // Test that the circle does not overlap with a non-overlapping circle
        assertFalse((boolean) containsMethod.invoke(circle, nonOverlappingCircle));
    }
}
