package com.badlogic.gdx.math;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;

class Vector3_crs_33_0_Test {

    @Test
    void testCrs() throws Exception {
        // Arrange
        Vector3 vector1 = new Vector3(1, 0, 0);
        Vector3 vector2 = new Vector3(0, 1, 0);
        // Act
        Vector3 result = vector1.crs(vector2);
        // Assert
        assertEquals(-1f, result.x, 0.0001);
        assertEquals(0f, result.y, 0.0001);
        assertEquals(1f, result.z, 0.0001);
    }
}
