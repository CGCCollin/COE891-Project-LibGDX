package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Vector3;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;

public class Vector3_dot_31_0_Test {

    private Vector3 vector1, vector2;

    @BeforeEach
    void setUp() {
        vector1 = new Vector3(1, 2, 3);
        vector2 = new Vector3(4, 5, 6);
    }

    @Test
    void testDot() {
        float result = vector1.dot(vector2);
        assertEquals(32, result);
    }
}
