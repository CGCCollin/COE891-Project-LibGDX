package com.badlogic.gdx.mutants;

import java.lang.reflect.*;
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

class RectangleMutant_contains_17_0_Test {

    private static final float EPSILON = 0.0001f;

    private RectangleMutant rectangle;

    private Circle circle;

    @BeforeEach
    void setUp() throws Exception {
        rectangle = new RectangleMutant(2, 3, 4, 5);
        circle = new Circle(6, 7, 8);
    }

    @Test
    void testContainsCircleInsideRectangle() {
        assertTrue(rectangle.contains(circle));
    }

    @Test
    void testContainsCircleOutsideRectangle() {
        circle.x = -1;
        circle.y = -2;
        assertFalse(rectangle.contains(circle));
    }

    @Test
    void testContainsCircleOnEdgeOfRectangle() {
        circle.x = 3;
        circle.y = 5;
        assertTrue(rectangle.contains(circle));
    }

    @Test
    void testContainsCircleOutsideAndInsideRectangle() {
        circle.x = -1;
        circle.y = -2;
        circle.radius = 10;
        assertTrue(rectangle.contains(circle));
    }

    @Test
    void testContainsCircleOnDiagonalOfRectangle() {
        circle.x = 4;
        circle.y = 5;
        assertFalse(rectangle.contains(circle));
    }

    @Test
    void testContainsCircleWithZeroRadius() {
        circle.radius = 0;
        assertFalse(rectangle.contains(circle));
    }

    @Test
    void testContainsCircleInRectangleWithNegativeCoordinates() {
        rectangle.x = -1;
        rectangle.y = -2;
        rectangle.width = 4;
        rectangle.height = 5;
        circle.x = 0;
        circle.y = 0;
        assertTrue(rectangle.contains(circle));
    }

    @Test
    void testContainsCircleInRectangleWithZeroWidthOrHeight() {
        rectangle.width = 0;
        assertFalse(rectangle.contains(circle));
        rectangle.height = 0;
        assertFalse(rectangle.contains(circle));
    }

    @Test
    void testContainsCircleInRectangleWithNegativeRadius() {
        rectangle.width = 4;
        rectangle.height = 5;
        circle.radius = -1;
        assertFalse(rectangle.contains(circle));
    }

    @Test
    void testContainsCircleInRectangleWithNegativeXOrY() {
        rectangle.x = -2;
        rectangle.y = -3;
        circle.x = 0;
        circle.y = 0;
        assertTrue(rectangle.contains(circle));
    }

    @Test
    void testContainsCircleInRectangleWithZeroXOrY() {
        rectangle.x = 0;
        rectangle.y = 0;
        circle.x = 2;
        circle.y = 3;
        assertTrue(rectangle.contains(circle));
    }

    @Test
    void testContainsCircleInRectangleWithNegativeWidthOrHeight() {
        rectangle.width = -4;
        rectangle.height = -5;
        circle.x = 0;
        circle.y = 0;
        assertTrue(rectangle.contains(circle));
    }

    @Test
    void testContainsCircleInRectangleWithZeroWidthOrHeightAndNegativeCoordinates() {
        rectangle.width = -4;
        rectangle.height = -5;
        rectangle.x = -2;
    }
}
