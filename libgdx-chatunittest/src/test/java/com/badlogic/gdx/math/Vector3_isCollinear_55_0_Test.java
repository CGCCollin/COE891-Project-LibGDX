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

public class Vector3_isCollinear_55_0_Test {

    private static final float EPSILON = 0.0001f;

    @Test
    public void testIsCollinear() throws Exception {
        Vector3 v1 = new Vector3(1, 0, 0);
        Vector3 v2 = new Vector3(0, 1, 0);
        Vector3 v3 = new Vector3(1, 1, 0);
        assertTrue(v1.isCollinear(v2, EPSILON));
        assertFalse(v1.isCollinear(v3, EPSILON));
    }
}
