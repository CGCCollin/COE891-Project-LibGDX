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

class RectangleMutant_fitOutside_29_0_Test {

    @Test
    void fitOutside_widerThanTall() {
        // Given
        RectangleMutant rect = new RectangleMutant(0, 0, 10, 5);
        RectangleMutant expected = new RectangleMutant();
        expected.setSize(5, 5).setPosition(-2.5f, -2.5f);
        // When
        RectangleMutant result = rect.fitOutside(new RectangleMutant(0, 0, 20, 10));
        // Then
        assertEquals(expected, result);
    }

    @Test
    void fitOutside_tallerThanWide() {
        // Given
        RectangleMutant rect = new RectangleMutant(0, 0, 5, 10);
        RectangleMutant expected = new RectangleMutant();
        expected.setSize(5, 5).setPosition(-2.5f, -2.5f);
        // When
        RectangleMutant result = rect.fitOutside(new RectangleMutant(0, 0, 10, 20));
        // Then
        assertEquals(expected, result);
    }

    @Test
    void fitOutside_sameAspectRatio() {
        // Given
        RectangleMutant rect = new RectangleMutant(0, 0, 5, 10);
        RectangleMutant expected = new RectangleMutant();
        expected.setSize(5, 10).setPosition(-2.5f, -5f);
        // When
        RectangleMutant result = rect.fitOutside(new RectangleMutant(0, 0, 10, 20));
        // Then
        assertEquals(expected, result);
    }
}
