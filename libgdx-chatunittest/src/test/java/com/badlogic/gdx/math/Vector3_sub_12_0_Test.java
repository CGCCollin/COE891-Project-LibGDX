package com.badlogic.gdx.math;

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

class Vector3_sub_12_0_Test {

    @Test
    void sub() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 2, 3);
        float value = 0.5f;
        // Act
        vector.sub(value);
        // Assert
        assertEquals(0.5f, vector.x);
        assertEquals(1.5f, vector.y);
        assertEquals(2.5f, vector.z);
    }
}
