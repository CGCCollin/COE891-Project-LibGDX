package com.badlogic.gdx.math;

import java.lang.reflect.*;
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

class Rectangle_merge_24_0_Test {

    private Method mergeMethod;

    private Field xField, yField, widthField, heightField;

    @BeforeEach
    void setUp() throws NoSuchMethodException, NoSuchFieldException {
        mergeMethod = Rectangle.class.getDeclaredMethod("merge", Vector2[].class);
        xField = Rectangle.class.getDeclaredField("x");
        yField = Rectangle.class.getDeclaredField("y");
        widthField = Rectangle.class.getDeclaredField("width");
        heightField = Rectangle.class.getDeclaredField("height");
        mergeMethod.setAccessible(true);
        xField.setAccessible(true);
        yField.setAccessible(true);
        widthField.setAccessible(true);
        heightField.setAccessible(true);
    }

    @Test
    void testMerge() throws IllegalAccessException, InvocationTargetException {
        Vector2[] vecs = new Vector2[] { new Vector2(1, 1), new Vector2(3, 4), new Vector2(5, 6) };
        Rectangle rect = new Rectangle();
        mergeMethod.invoke(rect, (Object) vecs);
        assertEquals(1, xField.getDouble(rect));
        assertEquals(1, yField.getDouble(rect));
        assertEquals(5, widthField.getDouble(rect));
        assertEquals(6, heightField.getDouble(rect));
    }
}
