package com.badlogic.gdx.mutants;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;

class PolygonMutant_resetTransformations_26_0_Test {

    private PolygonMutant polygonMutant;

    @BeforeEach
    void setUp() {
        polygonMutant = new PolygonMutant();
    }

    @AfterEach
    void tearDown() {
        polygonMutant = null;
    }

    @Test
    void testResetTransformations() throws Exception {
        // Set initial values
        setField(polygonMutant, "x", 10f);
        setField(polygonMutant, "y", 20f);
        setField(polygonMutant, "originX", 30f);
        setField(polygonMutant, "originY", 40f);
        setField(polygonMutant, "rotation", 50f);
        setField(polygonMutant, "scaleX", 60f);
        setField(polygonMutant, "scaleY", 70f);
        setField(polygonMutant, "dirty", false);
        // Call the method to be tested
        polygonMutant.resetTransformations();
        // Verify that the fields have been reset
        assertEquals(0f, getField(polygonMutant, "x"));
        assertEquals(0f, getField(polygonMutant, "y"));
        assertEquals(0f, getField(polygonMutant, "originX"));
        assertEquals(0f, getField(polygonMutant, "originY"));
        assertEquals(0f, getField(polygonMutant, "rotation"));
        assertEquals(1f, getField(polygonMutant, "scaleX"));
        assertEquals(1f, getField(polygonMutant, "scaleY"));
        assertTrue((boolean) getField(polygonMutant, "dirty"));
    }

    private void setField(Object obj, String fieldName, Object value) throws NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = obj.getClass();
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(obj, value);
    }

    private Object getField(Object obj, String fieldName) throws NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = obj.getClass();
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        return field.get(obj);
    }
}
