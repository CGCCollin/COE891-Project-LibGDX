package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Quaternion;
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

public class Vector3_mul_40_0_Test {

    @Test
    public void testMul() throws Exception {
        // Create a new instance of the focal class
        Vector3 vector = new Vector3(1, 2, 3);
        // Create a new instance of the dependent class
        Quaternion quaternion = new Quaternion();
        // Set up the values for the test case
        float x = 4;
        float y = 5;
        float z = 6;
        quaternion.set(x, y, z, 1);
        // Call the method under test and store the result in a variable
        Vector3 result = vector.mul(quaternion);
        // Assert that the result is as expected
        assertEquals(0.5f * x + 0.5f * y - 0.5f * z, result.x);
        assertEquals(-0.5f * x + 0.5f * y + 0.5f * z, result.y);
        assertEquals(0.5f * x - 0.5f * y + 0.5f * z, result.z);
    }
}
