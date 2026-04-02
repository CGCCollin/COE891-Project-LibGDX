package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Vector2;
import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.NumberUtils;

public class Circle_contains_10_0_Test {

    private Circle circle;

    @BeforeEach
    public void setUp() throws Exception {
        circle = new Circle();
        Method method = Circle.class.getDeclaredMethod("contains", Vector2.class);
        method.setAccessible(true);
    }

    @Test
    public void testContains_InsideCircle() throws Throwable {
        // Given a circle with center (0, 0) and radius 1
        circle = new Circle(0, 0, 1);
        // When we check if the point (0.5f, 0.5f) is inside the circle
        boolean result = (boolean) circle.getClass().getMethod("contains", Vector2.class).invoke(circle, new Vector2(0.5f, 0.5f));
        // Then we expect that it should be true
        assertTrue(result);
    }

    @Test
    public void testContains_OutsideCircle() throws Throwable {
        // Given a circle with center (0, 0) and radius 1
        circle = new Circle(0, 0, 1);
        // When we check if the point (2f, 2f) is inside the circle
        boolean result = (boolean) circle.getClass().getMethod("contains", Vector2.class).invoke(circle, new Vector2(2f, 2f));
        // Then we expect that it should be false
        assertFalse(result);
    }

    @Test
    public void testContains_OnCircle() throws Throwable {
        // Given a circle with center (0, 0) and radius 1
        circle = new Circle(0, 0, 1);
        // When we check if the point (0, 0) is on the circle
        boolean result = (boolean) circle.getClass().getMethod("contains", Vector2.class).invoke(circle, new Vector2(0f, 0f));
        // Then we expect that it should be true
        assertTrue(result);
    }
}
