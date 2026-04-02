package com.badlogic.gdx.mutants;

import com.badlogic.gdx.mutants.RectangleMutant;
import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import com.badlogic.gdx.utils.Scaling;

class RectangleMutant_getPosition_9_0_Test {

    @Test
    void testGetPosition() throws Exception {
        // Arrange
        RectangleMutant rectangle = new RectangleMutant();
        Vector2 position = new Vector2(0, 0);
        Method method = RectangleMutant.class.getDeclaredMethod("getPosition", Vector2.class);
        method.setAccessible(true);
        // Act
        Vector2 result = (Vector2) method.invoke(rectangle, position);
        // Assert
        assertEquals(0f, result.x);
        assertEquals(0f, result.y);
    }
}
