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

class RectangleMutant_overlaps_19_0_Test {

    @Test
    public void testOverlaps() throws Exception {
        // Arrange
        RectangleMutant rect1 = new RectangleMutant(0, 0, 10, 10);
        RectangleMutant rect2 = new RectangleMutant(5, 5, 10, 10);
        Method overlapsMethod = RectangleMutant.class.getDeclaredMethod("overlaps", RectangleMutant.class);
        overlapsMethod.setAccessible(true);
        // Act
        boolean result = (boolean) overlapsMethod.invoke(rect1, rect2);
        // Assert
        assertTrue(result);
    }

    @Test
    public void testNoOverlap() throws Exception {
        // Arrange
        RectangleMutant rect1 = new RectangleMutant(0, 0, 10, 10);
        RectangleMutant rect2 = new RectangleMutant(15, 15, 5, 5);
        Method overlapsMethod = RectangleMutant.class.getDeclaredMethod("overlaps", RectangleMutant.class);
        overlapsMethod.setAccessible(true);
        // Act
        boolean result = (boolean) overlapsMethod.invoke(rect1, rect2);
        // Assert
        assertFalse(result);
    }
}
