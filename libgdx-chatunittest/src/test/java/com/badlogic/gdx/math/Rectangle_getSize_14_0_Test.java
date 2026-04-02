package com.badlogic.gdx.math;

import java.io.Serializable;
import java.lang.reflect.Method;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import com.badlogic.gdx.utils.Scaling;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class Rectangle_getSize_14_0_Test {

    @Test
    void testGetSize() throws Exception {
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);
        Vector2 size = new Vector2();
        // Call the method using reflection
        Method getSizeMethod = Rectangle.class.getDeclaredMethod("getSize", Vector2.class);
        Object result = getSizeMethod.invoke(rectangle, size);
        assertEquals(3, size.x);
        assertEquals(4, size.y);
    }
}
