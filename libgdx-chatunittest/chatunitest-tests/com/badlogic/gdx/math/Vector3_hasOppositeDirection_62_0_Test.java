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

class Vector3_hasOppositeDirection_62_0_Test {

    private Vector3 vector1;

    private Vector3 vector2;

    private Vector3 vector3;

    @BeforeEach
    void setUp() {
        vector1 = new Vector3(0, 0, 1);
        vector2 = new Vector3(1, 0, 0);
        vector3 = new Vector3(1, 1, 1);
    }

    @Test
    void hasOppositeDirection() {
        assertFalse(vector1.hasOppositeDirection(vector2));
        assertTrue(vector1.hasOppositeDirection(vector3));
    }
}
