package com.badlogic.gdx.mutants;

import java.lang.reflect.*;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;

class PolygonMutant_getVertex_14_0_Test {

    private PolygonMutant polygonMutant;

    private Field localVerticesField, worldVerticesField, xField, yField, originXField, originYField, rotationField, scaleXField, scaleYField, dirtyField, boundsField;

    @BeforeEach
    void setUp() throws Exception {
        polygonMutant = new PolygonMutant();
        localVerticesField = polygonMutant.getClass().getDeclaredField("localVertices");
        worldVerticesField = polygonMutant.getClass().getDeclaredField("worldVertices");
        xField = polygonMutant.getClass().getDeclaredField("x");
        yField = polygonMutant.getClass().getDeclaredField("y");
        originXField = polygonMutant.getClass().getDeclaredField("originX");
        originYField = polygonMutant.getClass().getDeclaredField("originY");
        rotationField = polygonMutant.getClass().getDeclaredField("rotation");
        scaleXField = polygonMutant.getClass().getDeclaredField("scaleX");
        scaleYField = polygonMutant.getClass().getDeclaredField("scaleY");
        dirtyField = polygonMutant.getClass().getDeclaredField("dirty");
        boundsField = polygonMutant.getClass().getDeclaredField("bounds");
        localVerticesField.setAccessible(true);
        worldVerticesField.setAccessible(true);
        xField.setAccessible(true);
        yField.setAccessible(true);
        originXField.setAccessible(true);
        originYField.setAccessible(true);
        rotationField.setAccessible(true);
        scaleXField.setAccessible(true);
        scaleYField.setAccessible(true);
        dirtyField.setAccessible(true);
        boundsField.setAccessible(true);
    }

    @Test
    void testGetVertex() throws Exception {
        // Set up the localVertices field with test data
        float[] testData = new float[] { 1, 2, 3, 4, 5, 6 };
        localVerticesField.set(polygonMutant, testData);
        // Call the getVertex method with a valid vertex number
        Vector2 pos = new Vector2();
        // Index of the third vertex (0-based)
        int testIndex = 2;
        polygonMutant.getVertex(testIndex, pos);
        // Check that the position returned matches the expected result
        assertEquals(3, pos.x);
        assertEquals(4, pos.y);
        // Test with an invalid vertex number
        assertThrows(IllegalArgumentException.class, () -> {
            polygonMutant.getVertex(-1, new Vector2());
        });
    }
}
