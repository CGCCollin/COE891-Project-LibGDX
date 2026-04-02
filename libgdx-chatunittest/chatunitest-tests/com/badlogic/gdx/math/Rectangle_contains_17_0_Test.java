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

class Rectangle_contains_17_0_Test {

    @Test
    void contains_shouldReturnTrueWhenCircleIsInside() {
        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        Circle circle = new Circle(5, 5, 1);
        boolean result = rectangle.contains(circle);
        assertTrue(result);
    }

    @Test
    void contains_shouldReturnFalseWhenCircleIsOutside() {
        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        Circle circle = new Circle(11, 11, 1);
        boolean result = rectangle.contains(circle);
        assertFalse(result);
    }

    @Test
    void contains_shouldReturnTrueWhenCircleIsOnTheBorder() {
        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        Circle circle = new Circle(5, 5, 2);
        boolean result = rectangle.contains(circle);
        assertTrue(result);
    }
}
