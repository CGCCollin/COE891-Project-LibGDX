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

public class Rectangle_equals_36_0_Test {

    @Test
    void testEquals_sameObject() {
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);
        assertTrue(rectangle.equals(rectangle));
    }

    @Test
    void testEquals_nullObject() {
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);
        assertFalse(rectangle.equals(null));
    }

    @Test
    void testEquals_differentClass() {
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);
        assertFalse(rectangle.equals("Hello"));
    }

    @Test
    void testEquals_sameValues() {
        Rectangle rectangle1 = new Rectangle(1, 2, 3, 4);
        Rectangle rectangle2 = new Rectangle(1, 2, 3, 4);
        assertTrue(rectangle1.equals(rectangle2));
    }

    @Test
    void testEquals_differentValues() {
        Rectangle rectangle1 = new Rectangle(1, 2, 3, 4);
        Rectangle rectangle2 = new Rectangle(5, 6, 7, 8);
        assertFalse(rectangle1.equals(rectangle2));
    }

    @Test
    void testEquals_differentValuesWithNegativeNumbers() {
        Rectangle rectangle1 = new Rectangle(-1, -2, -3, -4);
        Rectangle rectangle2 = new Rectangle(-5, -6, -7, -8);
        assertFalse(rectangle1.equals(rectangle2));
    }

    @Test
    void testEquals_differentValuesWithZero() {
        Rectangle rectangle1 = new Rectangle(0, 0, 0, 0);
        Rectangle rectangle2 = new Rectangle(-5, -6, -7, -8);
        assertFalse(rectangle1.equals(rectangle2));
    }

    @Test
    void testEquals_differentValuesWithNonZeroTolerance() {
        Rectangle rectangle1 = new Rectangle(1.00001f, 2.00001f, 3.00001f, 4.00001f);
        Rectangle rectangle2 = new Rectangle(1.00002f, 2.00002f, 3.00002f, 4.00002f);
        assertFalse(rectangle1.equals(rectangle2));
    }

    @Test
    void testEquals_differentValuesWithZeroTolerance() {
        Rectangle rectangle1 = new Rectangle(1.0f, 2.0f, 3.0f, 4.0f);
        Rectangle rectangle2 = new Rectangle(1.00002f, 2.00002f, 3.00002f, 4.00002f);
        assertTrue(rectangle1.equals(rectangle2));
    }

    @Test
    void testEquals_differentValuesWithNonZeroToleranceAndNegativeNumbers() {
        Rectangle rectangle1 = new Rectangle(-1.00001f, -2.00001f, -3.00001f, -4.00001f);
        Rectangle rectangle2 = new Rectangle(-1.00002f, -2.00002f, -3.00002f, -4.00002f);
        assertFalse(rectangle1.equals(rectangle2));
    }

    @Test
    void testEquals_differentValuesWithZeroToleranceAndNegativeNumbers() {
        Rectangle rectangle1 = new Rectangle(-1.0f, -2.0f, -3.0f, -4.0f);
        Rectangle rectangle2 = new Rectangle(-1.00002f, -2.00002f, -3.00002f, -4.00002f);
    }
}
