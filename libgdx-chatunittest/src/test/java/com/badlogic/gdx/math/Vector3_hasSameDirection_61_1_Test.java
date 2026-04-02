package com.badlogic.gdx.math;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;

class Vector3_hasSameDirection_61_1_Test {

    @Test
    void testHasSameDirection() {
        // Create two vectors with the same direction
        Vector3 vector1 = new Vector3(1, 0, 0);
        Vector3 vector2 = new Vector3(vector1);
        assertTrue(vector1.hasSameDirection(vector2));
        // Create two vectors with different directions
        vector1 = new Vector3(1, 0, 0);
        vector2 = new Vector3(-1, 0, 0);
        assertFalse(vector1.hasSameDirection(vector2));
        // Create a vector with zero length and check if it has the same direction as itself
        vector1 = new Vector3();
        vector2 = new Vector3(vector1);
        assertTrue(vector1.hasSameDirection(vector2));
        // Create a vector with non-zero length and check if it does not have the same direction as a vector with zero length
        vector1 = new Vector3(1, 0, 0);
        vector2 = new Vector3();
        assertFalse(vector1.hasSameDirection(vector2));
    }
}
