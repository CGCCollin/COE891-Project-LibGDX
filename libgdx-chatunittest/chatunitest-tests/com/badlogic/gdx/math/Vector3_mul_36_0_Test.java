package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class Vector3_mul_36_0_Test {

    @Test
    public void testMul() {
        // Create a vector and a rotation matrix to multiply it by
        Vector3 v = new Vector3(1, 2, 3);
        Matrix4 m = new Matrix4();
        m.setToRotation(new Vector3(1, 0, 0), 45f);
        // Multiply the vector by the rotation matrix
        v.mul(m);
        // Check that the result is correct
        assertEquals(1.7320508075688772, v.x, 0.0001);
        assertEquals(3.46410161514, v.y, 0.0001);
        assertEquals(4.242640687119285, v.z, 0.0001);
    }

    @Test
    public void testMulWithNullMatrix() {
        // Create a vector and set the matrix to null
        Vector3 v = new Vector3(1, 2, 3);
        Matrix4 m = null;
        // Attempt to multiply the vector by the null matrix
        assertThrows(NullPointerException.class, () -> {
            v.mul(m);
        });
    }
}
