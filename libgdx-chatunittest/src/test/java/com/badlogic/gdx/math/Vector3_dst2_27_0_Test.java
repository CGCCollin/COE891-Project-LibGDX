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

public class Vector3_dst2_27_0_Test {

    private Vector3 vector3 = new Vector3(1, 2, 3);

    @Test
    void testDst2() throws Exception {
        // Arrange
        Vector3 point = new Vector3(4, 5, 6);
        // Act
        float result = vector3.dst2(point);
        // Assert
        assertEquals(27f, result, 0.0001f);
    }
}
