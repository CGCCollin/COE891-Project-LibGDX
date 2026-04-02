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

public class Vector3_idt_22_0_Test {

    private Vector3 vector1, vector2, vector3, vector4;

    @BeforeEach
    void setUp() {
        vector1 = new Vector3(1f, 0f, 0f);
        vector2 = new Vector3(0f, 1f, 0f);
        vector3 = new Vector3(0f, 0f, 1f);
        vector4 = new Vector3(0f, 0f, 0f);
    }

    @Test
    void testIdt() {
        assertTrue(vector1.idt(vector1));
        assertFalse(vector1.idt(vector2));
        assertFalse(vector1.idt(vector3));
        assertTrue(vector4.idt(vector4));
    }
}
