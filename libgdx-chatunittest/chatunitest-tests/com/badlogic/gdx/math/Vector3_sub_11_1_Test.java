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

class Vector3_sub_11_1_Test {

    @Test
    void sub() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(5, 10, 15);
        float x = 2;
        float y = 4;
        float z = 6;
        // Act
        vector.sub(x, y, z);
        // Assert
        assertEquals(3, vector.x);
        assertEquals(6, vector.y);
        assertEquals(9, vector.z);
    }
}
