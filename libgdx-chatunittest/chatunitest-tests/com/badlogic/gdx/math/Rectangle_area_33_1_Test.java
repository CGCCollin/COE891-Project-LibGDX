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
import com.badlogic.gdx.utils.Scaling;

class Rectangle_area_33_1_Test {

    @Test
    void testArea() {
        // Arrange
        Rectangle rectangle = new Rectangle(0, 0, 5, 10);
        // Act
        float area = rectangle.area();
        // Assert
        assertEquals(50, area);
    }
}
