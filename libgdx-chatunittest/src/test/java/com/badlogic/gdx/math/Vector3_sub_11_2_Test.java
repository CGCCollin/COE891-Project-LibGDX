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

public class Vector3_sub_11_2_Test {

    @Test
    void testSub() throws Exception {
        // Arrange
        Vector3 vector1 = new Vector3(5, 10, 15);
        Vector3 vector2 = new Vector3(1, 2, 3);
        Vector3 expectedResult = new Vector3(4, 8, 12);
        // Act
        Vector3 result = vector1.sub(vector2.x, vector2.y, vector2.z);
        // Assert
        assertEquals(expectedResult.x, result.x);
        assertEquals(expectedResult.y, result.y);
        assertEquals(expectedResult.z, result.z);
    }
}
