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

public class RectangleMutant_merge_22_0_Test {

    @Test
    void testMerge() throws Exception {
        // Create two instances of RectangleMutant
        RectangleMutant rect1 = new RectangleMutant();
        rect1.set(0, 0, 2, 3);
        RectangleMutant rect2 = new RectangleMutant();
        rect2.set(1, 1, 2, 4);
        // Merge the two rectangles
        Method mergeMethod = RectangleMutant.class.getDeclaredMethod("merge", float.class, float.class);
        RectangleMutant mergedRect = (RectangleMutant) mergeMethod.invoke(rect1, 1, 1);
        // Check that the merged rectangle has the correct coordinates and size
        assertEquals(0, mergedRect.getX(), 0.001);
        assertEquals(0, mergedRect.getY(), 0.001);
        assertEquals(3, mergedRect.getWidth(), 0.001);
        assertEquals(4, mergedRect.getHeight(), 0.001);
        // Merge the rectangles again with different coordinates
        mergedRect = (RectangleMutant) mergeMethod.invoke(rect1, -2, -3);
        assertEquals(-2, mergedRect.getX(), 0.001);
        assertEquals(-3, mergedRect.getY(), 0.001);
        assertEquals(5, mergedRect.getWidth(), 0.001);
        assertEquals(7, mergedRect.getHeight(), 0.001);
    }
}
