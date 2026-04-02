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

public class Vector3_epsilonEquals_78_1_Test {

    @Test
    void testEpsilonEquals() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        float x = 1f;
        float y = 2f;
        float z = 3f;
        Method epsilonEquals = Vector3.class.getDeclaredMethod("epsilonEquals", float.class, float.class, float.class, float.class);
        boolean result = (boolean) epsilonEquals.invoke(vector, x, y, z, MathUtils.FLOAT_ROUNDING_ERROR);
        assertTrue(result);
        // Test with different epsilon value
        float epsilon = 0.1f;
        result = (boolean) epsilonEquals.invoke(vector, x, y, z, epsilon);
        assertFalse(result);
    }
}
