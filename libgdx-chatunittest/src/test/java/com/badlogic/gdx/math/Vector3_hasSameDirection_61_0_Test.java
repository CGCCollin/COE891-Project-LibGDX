package com.badlogic.gdx.math;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class Vector3_hasSameDirection_61_0_Test {

    private static final Vector3 VECTOR1 = new Vector3(1, 0, 0);

    private static final Vector3 VECTOR2 = new Vector3(0, 1, 0);

    private static final Vector3 VECTOR3 = new Vector3(0, 0, 1);

    @Test
    void testHasSameDirection() throws Exception {
        // Check that the input vectors are not null before calling dot() method
        assertNotNull(VECTOR1);
        assertNotNull(VECTOR2);
        assertNotNull(VECTOR3);
        // Act - positive direction
        boolean result1 = VECTOR1.hasSameDirection(VECTOR2);
        // Assert - positive direction
        assertTrue(result1);
        // Act - negative direction
        boolean result2 = VECTOR1.hasSameDirection(VECTOR3);
        // Assert - negative direction
        assertFalse(result2);
    }
}
