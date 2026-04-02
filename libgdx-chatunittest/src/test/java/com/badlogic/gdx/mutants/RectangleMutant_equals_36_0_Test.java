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

public class RectangleMutant_equals_36_0_Test {

    @Test
    void testEquals() throws Exception {
        // Create two instances of RectangleMutant with the same values
        RectangleMutant rect1 = new RectangleMutant(0, 0, 10, 20);
        RectangleMutant rect2 = new RectangleMutant(0, 0, 10, 20);
        // Test that they are equal
        assertTrue(rect1.equals(rect2));
        // Create a third instance of RectangleMutant with different values
        RectangleMutant rect3 = new RectangleMutant(0, 0, 11, 20);
        // Test that it is not equal to the other instances
        assertFalse(rect1.equals(rect3));
        assertFalse(rect2.equals(rect3));
        // Create a fourth instance of RectangleMutant with null values
        RectangleMutant rect4 = new RectangleMutant();
        // Test that it is not equal to the other instances
        assertFalse(rect1.equals(rect4));
        assertFalse(rect2.equals(rect4));
        assertFalse(rect3.equals(rect4));
    }
}
