package com.badlogic.gdx.math;

import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;

public class Vector3_lerp_63_0_Test {

    @Test
    void testLerp() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        Vector3 target = new Vector3(4, 5, 6);
        float alpha = 0.5f;
        Method lerpMethod = Vector3.class.getDeclaredMethod("lerp", Vector3.class, float.class);
        lerpMethod.setAccessible(true);
        Vector3 result = (Vector3) lerpMethod.invoke(vector, target, alpha);
        assertEquals(2.5f, result.x, 0.0001);
        assertEquals(3.5f, result.y, 0.0001);
        assertEquals(4.5f, result.z, 0.0001);
    }
}
