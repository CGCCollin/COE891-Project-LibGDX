package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Matrix3;
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

public class Vector3_traMul_39_0_Test {

    @Test
    public void testTraMul() throws Exception {
        // Create a new Vector3 instance and a Matrix3 instance
        Vector3 vector3 = new Vector3();
        Matrix3 matrix3 = new Matrix3();
        // Set the values of the Vector3 instance
        vector3.x = 1f;
        vector3.y = 2f;
        vector3.z = 3f;
        // Set the values of the Matrix3 instance
        matrix3.val[Matrix3.M00] = 2f;
        matrix3.val[Matrix3.M10] = 3f;
        matrix3.val[Matrix3.M20] = 4f;
        matrix3.val[Matrix3.M01] = 5f;
        matrix3.val[Matrix3.M11] = 6f;
        matrix3.val[Matrix3.M21] = 7f;
        matrix3.val[Matrix3.M02] = 8f;
        matrix3.val[Matrix3.M12] = 9f;
        matrix3.val[Matrix3.M22] = 10f;
        // Use reflection to invoke the traMul method and get the result
        Vector3 result = (Vector3) Vector3.class.getMethod("traMul", Matrix3.class).invoke(vector3, matrix3);
        // Check if the result is correct
        assertEquals(2f * 1f + 3f * 5f + 4f * 8f, result.x);
        assertEquals(2f * 2f + 3f * 6f + 4f * 9f, result.y);
        assertEquals(2f * 3f + 3f * 7f + 4f * 10f, result.z);
    }
}
