package com.badlogic.gdx.math;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.NumberUtils;

public class Circle_toString_13_0_Test {

    @Test
    public void testToString() throws Exception {
        // Arrange
        Circle circle = new Circle(1, 2, 3);
        String expectedResult = "1,2,3";
        // Act
        String actualResult = circle.toString();
        // Assert
        assertEquals(expectedResult, actualResult);
    }
}
