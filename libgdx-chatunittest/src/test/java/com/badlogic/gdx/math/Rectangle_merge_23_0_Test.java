package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Rectangle;
import java.lang.reflect.Method;
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

class Rectangle_merge_23_0_Test {

    @Test
    void testMerge() throws Exception {
        // Arrange
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);
        Vector2 vector = new Vector2(5, 6);
        // Act
        Method mergeMethod = Rectangle.class.getDeclaredMethod("merge", Vector2.class);
        Rectangle result = (Rectangle) mergeMethod.invoke(rectangle, vector);
        // Assert
        assertEquals(1f, rectangle.x);
        assertEquals(2f, rectangle.y);
        assertEquals(3f, rectangle.width);
        assertEquals(4f, rectangle.height);
    }
}
