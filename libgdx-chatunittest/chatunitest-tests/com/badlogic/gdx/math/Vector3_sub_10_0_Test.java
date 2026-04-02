package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Vector3;
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

public class Vector3_sub_10_0_Test {

    @Test
    void testSub() throws Exception {
        // Create a new instance of Vector3
        Vector3 v1 = new Vector3(10, 20, 30);
        Vector3 v2 = new Vector3(-5, -10, -15);
        // Use reflection to invoke the sub method
        Method subMethod = Vector3.class.getDeclaredMethod("sub", float.class, float.class, float.class);
        subMethod.setAccessible(true);
        Vector3 result = (Vector3) subMethod.invoke(v1, v2.x, v2.y, v2.z);
        // Check if the result is correct
        assertEquals(15, result.x, 0.001);
        assertEquals(10, result.y, 0.001);
        assertEquals(15, result.z, 0.001);
    }
}
