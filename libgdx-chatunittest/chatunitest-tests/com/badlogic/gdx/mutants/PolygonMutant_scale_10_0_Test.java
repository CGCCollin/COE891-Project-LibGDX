package com.badlogic.gdx.mutants;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;

public class PolygonMutant_scale_10_0_Test {

    @Test
    void testScale() throws Exception {
        // Given
        PolygonMutant polygon = new PolygonMutant();
        float amount = 2f;
        float expectedScaleX = 3f;
        float expectedScaleY = 3f;
        // When
        polygon.scale(amount);
        // Then
        assertEquals(expectedScaleX, polygon.getScaleX());
        assertEquals(expectedScaleY, polygon.getScaleY());
    }
}
