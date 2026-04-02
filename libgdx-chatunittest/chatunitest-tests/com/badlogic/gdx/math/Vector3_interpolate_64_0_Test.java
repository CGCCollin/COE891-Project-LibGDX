package com.badlogic.gdx.math;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;

@ExtendWith(MockitoExtension.class)
public class Vector3_interpolate_64_0_Test {

    private final Vector3 vector = new Vector3(1, 2, 3);

    private final Interpolation interpolation = mock(Interpolation.class);

    @BeforeEach
    void setUp() {
        when(interpolation.apply(anyFloat(), anyFloat(), anyFloat())).thenReturn(0.75f);
    }

    @Test
    public void testInterpolate() {
        Vector3 target = new Vector3(4, 6, 8);
        Vector3 result = vector.interpolate(target, 1f, interpolation);
        assertEquals(2.5f, result.x, 0.0001f);
        assertEquals(3.5f, result.y, 0.0001f);
        assertEquals(4.5f, result.z, 0.0001f);
    }
}
