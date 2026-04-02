package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Vector2;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import com.badlogic.gdx.utils.Scaling;

public class Rectangle_getPosition_9_0_Test {

    @Test
    void testGetPosition() throws Exception {
        // Arrange
        Rectangle rectangle = new Rectangle(10, 20, 30, 40);
        Vector2 position = new Vector2();
        // Act
        rectangle.getPosition(position);
        // Assert
        assertEquals(10f, position.x, 0.001);
        assertEquals(20f, position.y, 0.001);
    }
}
