package com.badlogic.gdx.math;

import java.lang.reflect.Method;
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

public class Vector3_fromString_67_0_Test {

    @Test
    void testFromString() throws Exception {
        // Arrange
        Vector3 vector = new Vector3();
        String validInput = "(1,2,3)";
        String invalidInput = "Not a valid input";
        // Act
        Method fromStringMethod = Vector3.class.getDeclaredMethod("fromString", String.class);
        fromStringMethod.setAccessible(true);
        Vector3 resultValid = (Vector3) fromStringMethod.invoke(vector, validInput);
        try {
            fromStringMethod.invoke(vector, invalidInput);
            fail("Expected GdxRuntimeException to be thrown");
        } catch (Exception e) {
            assertTrue(e instanceof GdxRuntimeException);
        }
        // Assert
        assertEquals(1f, resultValid.x, 0.001);
        assertEquals(2f, resultValid.y, 0.001);
        assertEquals(3f, resultValid.z, 0.001);
    }
}
