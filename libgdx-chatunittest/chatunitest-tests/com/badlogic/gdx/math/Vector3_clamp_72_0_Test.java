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

class Vector3_clamp_72_0_Test {

    @Test
    void clamp_withinRange() {
        Vector3 vector = new Vector3(5, 10, 15);
        Vector3 result = vector.clamp(0, 20);
        assertEquals(vector, result);
    }

    @Test
    void clamp_belowMinimum() {
        Vector3 vector = new Vector3(1, 2, 3);
        Vector3 result = vector.clamp(-5, 10);
        assertEquals(new Vector3(0, 0, 0), result);
    }

    @Test
    void clamp_aboveMaximum() {
        Vector3 vector = new Vector3(30, 40, 50);
        Vector3 result = vector.clamp(10, 25);
        assertEquals(new Vector3(20, 20, 20), result);
    }

    @Test
    void clamp_negativeValues() {
        Vector3 vector = new Vector3(-5, -10, -15);
        Vector3 result = vector.clamp(-20, 0);
        assertEquals(vector, result);
    }
}
