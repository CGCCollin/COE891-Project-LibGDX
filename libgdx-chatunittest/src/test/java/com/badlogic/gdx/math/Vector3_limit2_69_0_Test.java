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

class Vector3_limit2_69_0_Test {

    @Test
    void limit2() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(3, 4, 0);
        // sqrt(3^2 + 4^2) = 5.6569...
        float limit2 = 16;
        // Act
        vector.limit2(limit2);
        // Assert
        assertEquals(5.6569f, vector.len2(), 0.0001);
    }
}
