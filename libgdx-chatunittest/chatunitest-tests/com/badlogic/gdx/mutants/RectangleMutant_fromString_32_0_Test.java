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

public class RectangleMutant_fromString_32_0_Test {

    @Test
    void testFromString() {
        // Test valid input
        RectangleMutant rectangle = new RectangleMutant();
        rectangle.fromString("[1,2,3,4]");
        assertEquals(1f, rectangle.getX());
        assertEquals(2f, rectangle.getY());
        assertEquals(3f, rectangle.getWidth());
        assertEquals(4f, rectangle.getHeight());
        // Test invalid input with missing bracket
        assertThrows(GdxRuntimeException.class, () -> {
            rectangle.fromString("1,2,3,4");
        });
        // Test invalid input with too many commas
        assertThrows(GdxRuntimeException.class, () -> {
            rectangle.fromString("[1,2,3,4,5]");
        });
        // Test invalid input with non-float values
        assertThrows(NumberFormatException.class, () -> {
            rectangle.fromString("[a,b,c,d]");
        });
    }
}
