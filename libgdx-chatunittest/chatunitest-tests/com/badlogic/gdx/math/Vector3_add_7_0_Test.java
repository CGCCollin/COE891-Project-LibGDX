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

public class Vector3_add_7_0_Test {

    @Test
    void testAdd() throws Exception {
        // Create a new Vector3 object with x, y, and z set to 1
        Vector3 vector = new Vector3(1, 1, 1);
        // Create another Vector3 object with x, y, and z set to 2
        Vector3 otherVector = new Vector3(2, 2, 2);
        // Use reflection to invoke the add method on the vector object
        Method addMethod = Vector3.class.getDeclaredMethod("add", float.class, float.class, float.class);
        addMethod.setAccessible(true);
        Vector3 result = (Vector3) addMethod.invoke(vector, otherVector.x, otherVector.y, otherVector.z);
        // Check if the result is equal to the sum of the original vector and the other vector
        assertEquals(new Vector3(3, 3, 3), result);
    }
}
