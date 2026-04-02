package com.badlogic.gdx.mutants;

import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import com.badlogic.gdx.utils.Scaling;

class RectangleMutant_contains_16_0_Test {

    private RectangleMutant rectangleMutant;

    @BeforeEach
    public void setUp() throws Exception {
        rectangleMutant = new RectangleMutant(1, 2, 3, 4);
    }

    @Test
    public void testContainsWithPointInsideRectangle() throws Exception {
        Vector2 point = new Vector2(2, 3);
        Method containsMethod = RectangleMutant.class.getDeclaredMethod("contains", Vector2.class);
        boolean result = (boolean) containsMethod.invoke(rectangleMutant, point);
        assertTrue(result, "Point should be inside the rectangle");
    }

    @Test
    public void testContainsWithPointOutsideRectangle() throws Exception {
        Vector2 point = new Vector2(5, 6);
        Method containsMethod = RectangleMutant.class.getDeclaredMethod("contains", Vector2.class);
        boolean result = (boolean) containsMethod.invoke(rectangleMutant, point);
        assertFalse(result, "Point should not be inside the rectangle");
    }

    @Test
    public void testContainsWithPointOnEdgeOfRectangle() throws Exception {
        Vector2 point = new Vector2(1, 2);
        Method containsMethod = RectangleMutant.class.getDeclaredMethod("contains", Vector2.class);
        boolean result = (boolean) containsMethod.invoke(rectangleMutant, point);
        assertTrue(result, "Point on edge should be inside the rectangle");
    }
}
