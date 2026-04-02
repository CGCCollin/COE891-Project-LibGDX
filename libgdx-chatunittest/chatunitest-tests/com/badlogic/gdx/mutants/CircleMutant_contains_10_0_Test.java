package com.badlogic.gdx.mutants;

import java.io.Serializable;
import java.lang.reflect.*;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import com.badlogic.gdx.utils.NumberUtils;

class CircleMutant_contains_10_0_Test {

    private CircleMutant circleMutant;

    @BeforeEach
    void setUp() {
        circleMutant = new CircleMutant(new Vector2(0, 0), 5);
    }

    @AfterEach
    void tearDown() {
        circleMutant = null;
    }

    @Test
    void testContainsInsideCircle() throws Exception {
        Vector2 pointInsideCircle = new Vector2(3, 4);
        Method containsMethod = CircleMutant.class.getDeclaredMethod("contains", Vector2.class);
        boolean result = (boolean) containsMethod.invoke(circleMutant, pointInsideCircle);
        assertTrue(result);
    }

    @Test
    void testContainsOutsideCircle() throws Exception {
        Vector2 pointOutsideCircle = new Vector2(6, 7);
        Method containsMethod = CircleMutant.class.getDeclaredMethod("contains", Vector2.class);
        boolean result = (boolean) containsMethod.invoke(circleMutant, pointOutsideCircle);
        assertFalse(result);
    }

    @Test
    void testContainsOnBoundary() throws Exception {
        Vector2 pointOnBoundary = new Vector2(5, 0);
        Method containsMethod = CircleMutant.class.getDeclaredMethod("contains", Vector2.class);
        boolean result = (boolean) containsMethod.invoke(circleMutant, pointOnBoundary);
        assertTrue(result);
    }

    @Test
    void testNullArgument() throws Exception {
        Method containsMethod = CircleMutant.class.getDeclaredMethod("contains", Vector2.class);
        assertThrows(NullPointerException.class, () -> containsMethod.invoke(circleMutant, null));
    }

    @Test
    void testEmptyCircle() throws Exception {
        circleMutant = new CircleMutant(new Vector2(0, 0), 0);
        Vector2 pointInsideEmptyCircle = new Vector2(3, 4);
        Method containsMethod = CircleMutant.class.getDeclaredMethod("contains", Vector2.class);
        boolean result = (boolean) containsMethod.invoke(circleMutant, pointInsideEmptyCircle);
        assertFalse(result);
    }

    @Test
    void testNegativeRadius() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> circleMutant.set(-1, 0, 5));
    }

    @Test
    void testZeroRadius() throws Exception {
        circleMutant = new CircleMutant(new Vector2(0, 0), 0);
        Vector2 pointInsideEmptyCircle = new Vector2();
        Method containsMethod = CircleMutant.class.getDeclaredMethod("contains", Vector2.class);
        boolean result = (boolean) containsMethod.invoke(circleMutant, pointInsideEmptyCircle);
        assertTrue(result);
    }
}
