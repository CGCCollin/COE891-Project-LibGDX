package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import java.lang.reflect.*;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;

class Vector3_traMul_37_1_Test {

    @Test
    public void testTraMul() throws Exception {
        // create a new instance of the Vector3 class
        Vector3 vector3 = new Vector3(1, 2, 3);
        // create a mock Matrix4 object with predefined values
        Matrix4 matrix4 = new Matrix4();
        matrix4.setToRotation(90, 0, 1, 0);
        // invoke the traMul method using reflection
        Method traMulMethod = Vector3.class.getDeclaredMethod("traMul", Matrix4.class);
        traMulMethod.setAccessible(true);
        Vector3 result = (Vector3) traMulMethod.invoke(vector3, matrix4);
        // check if the result is correct
        assertEquals(result.x, -2);
        assertEquals(result.y, 1);
        assertEquals(result.z, 0);
    }
}
