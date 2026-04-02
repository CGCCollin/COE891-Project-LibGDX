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

public class Vector3_epsilonEquals_75_0_Test {

    @Test
    void testEpsilonEquals() throws Exception {
        Vector3 v1 = new Vector3(1, 2, 3);
        Vector3 v2 = new Vector3(1, 2, 3);
        Vector3 v3 = new Vector3(0.9999f, 0.9999f, 0.9999f);
        Vector3 v4 = new Vector3(1.0001f, 1.0001f, 1.0001f);
        assertTrue(v1.epsilonEquals(v2, 0.0001f));
        assertFalse(v1.epsilonEquals(v3, 0.0001f));
        assertFalse(v1.epsilonEquals(v4, 0.0001f));
    }
}
