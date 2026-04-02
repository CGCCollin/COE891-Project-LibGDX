package com.badlogic.gdx.math;

import com.badlogic.gdx.math.MathUtils;
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

public class Vector3_isPerpendicular_59_0_Test {

    @Test
    public void testIsPerpendicular() throws Exception {
        // Create a Vector3 instance with x=1, y=0, z=0
        Vector3 vector = new Vector3(1, 0, 0);
        // Create another Vector3 instance with x=0, y=1, z=0
        Vector3 perpendicularVector = new Vector3(0, 1, 0);
        // Call the isPerpendicular method using reflection
        Method method = Vector3.class.getDeclaredMethod("isPerpendicular", Vector3.class);
        method.setAccessible(true);
        boolean result = (boolean) method.invoke(vector, perpendicularVector);
        // Check that the result is true
        assertTrue(result);
    }
}
