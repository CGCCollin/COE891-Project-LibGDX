package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Vector3;
import java.lang.reflect.Method;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class Vector3_isUnit_50_0_Test {

    @Test
    void testIsUnit() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 0, 0);
        float margin = 0.0001f;
        Method isUnit = Vector3.class.getDeclaredMethod("isUnit", float.class);
        // Act
        boolean result = (boolean) isUnit.invoke(vector, margin);
        // Assert
        assertTrue(result);
    }

    @Test
    void testIsNotUnit() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 0, 0.0002f);
        float margin = 0.0001f;
        Method isUnit = Vector3.class.getDeclaredMethod("isUnit", float.class);
        // Act
        boolean result = (boolean) isUnit.invoke(vector, margin);
        // Assert
        assertFalse(result);
    }

    @Test
    void testIsUnitWithZeroMargin() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 0, 0);
        float margin = 0f;
        Method isUnit = Vector3.class.getDeclaredMethod("isUnit", float.class);
        // Act
        boolean result = (boolean) isUnit.invoke(vector, margin);
        // Assert
        assertFalse(result);
    }
}
