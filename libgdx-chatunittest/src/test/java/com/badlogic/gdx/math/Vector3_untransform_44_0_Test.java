package com.badlogic.gdx.math;

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

class Vector3_untransform_44_0_Test {

    @Test
    void untransform() throws Exception {
        // Create a new instance of the class under test
        Vector3 vector = new Vector3(1, 2, 3);
        // Define the input matrix
        Matrix4 matrix = new Matrix4();
        matrix.setToTranslation(-0.5f, -0.5f, -0.5f);
        // Invoke the untransform method using reflection
        Method untransformMethod = Vector3.class.getDeclaredMethod("untransform", Matrix4.class);
        untransformMethod.setAccessible(true);
        Vector3 result = (Vector3) untransformMethod.invoke(vector, matrix);
        // Check that the method returns the correct result
        assertEquals(-0.5f, result.x);
        assertEquals(-0.5f, result.y);
        assertEquals(-0.5f, result.z);
    }
}
