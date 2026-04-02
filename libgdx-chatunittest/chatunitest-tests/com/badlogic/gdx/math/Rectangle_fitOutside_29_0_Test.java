package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Rectangle;
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

class Rectangle_fitOutside_29_0_Test {

    @Test
    void fitOutside() throws Exception {
        // Arrange
        Rectangle rect = new Rectangle(0, 0, 10, 5);
        Rectangle fittedRect = new Rectangle();
        // Act
        fittedRect.fitOutside(rect);
        // Assert
        assertEquals(5, fittedRect.getWidth());
        assertEquals(2.5f, fittedRect.getHeight());
        assertEquals(-2.5f, fittedRect.getX());
        assertEquals(-1.25f, fittedRect.getY());
    }
}
