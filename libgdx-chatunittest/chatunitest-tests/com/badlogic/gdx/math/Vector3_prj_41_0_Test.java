package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Matrix4;
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

class Vector3_prj_41_0_Test {

    private Vector3 vector3;

    private Matrix4 matrix4;

    @BeforeEach
    void setUp() {
        vector3 = new Vector3(1, 2, 3);
        matrix4 = new Matrix4();
    }

    @Test
    void testPrjWithNullMatrix() {
        // Arrange
        matrix4 = null;
        // Act & Assert
        assertThrows(NullPointerException.class, () -> vector3.prj(matrix4));
    }
}
