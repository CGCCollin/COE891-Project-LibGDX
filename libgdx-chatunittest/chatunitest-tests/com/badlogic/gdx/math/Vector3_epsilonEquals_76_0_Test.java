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

class Vector3_epsilonEquals_76_0_Test {

    @Test
    void epsilonEquals() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        Method method = Vector3.class.getDeclaredMethod("epsilonEquals", float.class, float.class, float.class, float.class);
        method.setAccessible(true);
        // Test with epsilon greater than the difference between vector components
        boolean result1 = (boolean) method.invoke(vector, 0.5f, 2.5f, 3.5f, 0.6f);
        assertTrue(result1);
        // Test with epsilon less than the difference between vector components
        boolean result2 = (boolean) method.invoke(vector, 0.5f, 2.5f, 3.5f, 0.4f);
        assertFalse(result2);
    }
}
