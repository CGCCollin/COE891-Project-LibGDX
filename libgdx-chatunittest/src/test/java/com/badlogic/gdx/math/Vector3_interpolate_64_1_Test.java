package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Interpolation;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;

class Vector3_interpolate_64_1_Test {

    private Vector3 vector3;

    @BeforeEach
    void setUp() throws Exception {
        vector3 = new Vector3(1, 2, 3);
    }

    @AfterEach
    void tearDown() throws Exception {
        vector3 = null;
    }

    @Test
    public void testInterpolate() throws Exception {
        Vector3 target = new Vector3(4, 5, 6);
        float alpha = 0.5f;
        Interpolation interpolation = Interpolation.linear;
        // Reflectively invoke the interpolate method using reflection
        java.lang.reflect.Method interpolateMethod = Vector3.class.getDeclaredMethod("interpolate", Vector3.class, float.class, Interpolation.class);
        Vector3 result = (Vector3) interpolateMethod.invoke(vector3, target, alpha, interpolation);
        assertEquals(2.5f, result.x, 0.0001);
        assertEquals(3.5f, result.y, 0.0001);
        assertEquals(4.5f, result.z, 0.0001);
    }
}
