package com.badlogic.gdx.mutants;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;

public class PolygonMutant_translate_6_0_Test {

    @Test
    void testTranslate() throws Exception {
        PolygonMutant polygon = new PolygonMutant(new float[] { 0, 0, 1, 0, 1, 1, 0, 1 });
        polygon.translate(1, 2);
        assertEquals(1f, polygon.getX());
        assertEquals(2f, polygon.getY());
    }
}
