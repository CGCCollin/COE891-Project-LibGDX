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

public class Vector3_len2_21_0_Test {

    @Test
    void testLen2() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 2, 3);
        // Act
        float result = vector.len2();
        // Assert
        assertEquals(14.0f, result, 0.001);
    }
}
