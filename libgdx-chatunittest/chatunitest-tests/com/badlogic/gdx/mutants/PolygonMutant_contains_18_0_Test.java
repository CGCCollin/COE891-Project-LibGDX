package com.badlogic.gdx.mutants;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;

public class PolygonMutant_contains_18_0_Test {

    private PolygonMutant polygon;

    @BeforeEach
    void setUp() throws Exception {
        polygon = new PolygonMutant();
        // Set up test data for polygon vertices
        float[] vertices = { 0, 0, 10, 0, 5, 10 };
        Method setVerticesMethod = PolygonMutant.class.getDeclaredMethod("setVertices", float[].class);
        setVerticesMethod.setAccessible(true);
        setVerticesMethod.invoke(polygon, vertices);
        // Set up test data for polygon position and origin
        Field xField = PolygonMutant.class.getDeclaredField("x");
        xField.setAccessible(true);
        xField.set(polygon, 0f);
        Field yField = PolygonMutant.class.getDeclaredField("y");
        yField.setAccessible(true);
        yField.set(polygon, 0f);
        Method setOriginMethod = PolygonMutant.class.getDeclaredMethod("setOrigin", float.class, float.class);
        setOriginMethod.setAccessible(true);
        setOriginMethod.invoke(polygon, 0f, 0f);
        // Set up test data for polygon rotation and scale
        Field rotationField = PolygonMutant.class.getDeclaredField("rotation");
        rotationField.setAccessible(true);
        rotationField.set(polygon, 0f);
        Method setScaleMethod = PolygonMutant.class.getDeclaredMethod("setScale", float.class, float.class);
        setScaleMethod.setAccessible(true);
        setScaleMethod.invoke(polygon, 1f, 1f);
    }

    @Test
    void testContainsInsidePolygon() throws Exception {
        Vector2 point = new Vector2(5, 5);
        boolean result = (boolean) polygon.getClass().getMethod("contains", Vector2.class).invoke(polygon, point);
        Assertions.assertTrue(result, "The point should be inside the polygon");
    }

    @Test
    void testContainsOutsidePolygon() throws Exception {
        Vector2 point = new Vector2(15, 5);
        boolean result = (boolean) polygon.getClass().getMethod("contains", Vector2.class).invoke(polygon, point);
        Assertions.assertFalse(result, "The point should be outside the polygon");
    }

    @Test
    void testContainsOnVertex() throws Exception {
        Vector2 point = new Vector2(5, 0);
        boolean result = (boolean) polygon.getClass().getMethod("contains", Vector2.class).invoke(polygon, point);
        Assertions.assertTrue(result, "The point should be on the vertex of the polygon");
    }

    @Test
    void testContainsOnEdge() throws Exception {
        Vector2 point = new Vector2(10, 5);
        boolean result = (boolean) polygon.getClass().getMethod("contains", Vector2.class).invoke(polygon, point);
        Assertions.assertTrue(result, "The point should be on the edge of the polygon");
    }

    @Test
    void testContainsOnBorder() throws Exception {
        Vector2 point = new Vector2(5, 10);
        boolean result = (boolean) polygon.getClass().getMethod("contains", Vector2.class).invoke(polygon, point);
        Assertions.assertFalse(result, "The point should be outside the polygon on its border");
    }
}
