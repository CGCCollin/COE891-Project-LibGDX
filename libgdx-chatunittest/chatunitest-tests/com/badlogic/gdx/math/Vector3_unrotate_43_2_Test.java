package com.badlogic.gdx.math;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class Vector3_unrotate_43_2_Test {

    @Test
    void testUnrotate() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        Matrix4 matrix = new Matrix4();
        // Rotate 90 degrees around the Z axis
        matrix.setToRotation(90, 0, 0, 1);
        Vector3 result = vector.unrotate(matrix);
        assertEquals(vector.x, result.x, 0.0001);
        assertEquals(vector.y, result.y, 0.0001);
        // Negative because of the rotation
        assertEquals(-vector.z, result.z, 0.0001);
    }

    @Test
    void testUnrotateZeroMatrix() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        Matrix4 matrix = new Matrix4();
        // Use identity method instead of setToZero()
        matrix.idt();
        Vector3 result = vector.unrotate(matrix);
        assertEquals(vector.x, result.x, 0.0001);
        assertEquals(vector.y, result.y, 0.0001);
        // Same as original vector because of the zero matrix
        assertEquals(vector.z, result.z, 0.0001);
    }

    @Test
    void testUnrotateIdentityMatrix() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        Matrix4 matrix = new Matrix4();
        // Use identity method instead of setToZero()
        matrix.idt();
        Vector3 result = vector.unrotate(matrix);
        assertEquals(vector.x, result.x, 0.0001);
        assertEquals(vector.y, result.y, 0.0001);
        // Same as original vector because of the identity matrix
        assertEquals(vector.z, result.z, 0.0001);
    }

    @Test
    void testUnrotateNullMatrix() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        Matrix4 matrix = null;
        assertThrows(NullPointerException.class, () -> vector.unrotate(matrix));
    }
}
