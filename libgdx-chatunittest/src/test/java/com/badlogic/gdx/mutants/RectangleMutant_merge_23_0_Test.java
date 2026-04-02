package com.badlogic.gdx.mutants;

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

class RectangleMutant_merge_23_0_Test {

    @Test
    void merge() throws Exception {
        RectangleMutant rectangle = new RectangleMutant(0, 0, 5, 5);
        Vector2 vector = new Vector2(3, 3);
        // Test case 1: Merge with a point inside the rectangle
        RectangleMutant merged = rectangle.merge(vector);
        assertEquals(merged.getX(), 0);
        assertEquals(merged.getY(), 0);
        assertEquals(merged.getWidth(), 5);
        assertEquals(merged.getHeight(), 5);
        // Test case 2: Merge with a point outside the rectangle
        vector = new Vector2(-1, -1);
        merged = rectangle.merge(vector);
        assertEquals(merged.getX(), -1);
        assertEquals(merged.getY(), -1);
        assertEquals(merged.getWidth(), 7);
        assertEquals(merged.getHeight(), 7);
        // Test case 3: Merge with a point at the top-left corner of the rectangle
        vector = new Vector2(0, 0);
        merged = rectangle.merge(vector);
        assertEquals(merged.getX(), 0);
        assertEquals(merged.getY(), 0);
        assertEquals(merged.getWidth(), 5);
        assertEquals(merged.getHeight(), 5);
        // Test case 4: Merge with a point at the bottom-right corner of the rectangle
        vector = new Vector2(5, 5);
        merged = rectangle.merge(vector);
        assertEquals(merged.getX(), 0);
        assertEquals(merged.getY(), 0);
        assertEquals(merged.getWidth(), 5);
        assertEquals(merged.getHeight(), 5);
        // Test case 5: Merge with a point at the center of the rectangle
        vector = new Vector2(2.5f, 2.5f);
        merged = rectangle.merge(vector);
        assertEquals(merged.getX(), 0);
        assertEquals(merged.getY(), 0);
        assertEquals(merged.getWidth(), 5);
        assertEquals(merged.getHeight(), 5);
    }
}
