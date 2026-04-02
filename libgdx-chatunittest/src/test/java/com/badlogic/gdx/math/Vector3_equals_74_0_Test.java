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

public class Vector3_equals_74_0_Test {

    private static final float EPSILON = 0.0001f;

    @Test
    void testEquals() throws Exception {
        Vector3 vector1 = new Vector3(1, 2, 3);
        Vector3 vector2 = new Vector3(1, 2, 3);
        Vector3 vector3 = new Vector3(4, 5, 6);
        // reflexive property
        assertTrue(vector1.equals(vector1));
        // null check
        assertFalse(vector1.equals(null));
        // different values
        assertFalse(vector1.equals(vector3));
        // symmetric property
        assertTrue(vector1.equals(vector2));
    }
}
