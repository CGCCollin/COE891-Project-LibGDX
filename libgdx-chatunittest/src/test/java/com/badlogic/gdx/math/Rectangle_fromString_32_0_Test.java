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

class Rectangle_fromString_32_0_Test {

    @Test
    void testFromString() {
        Rectangle rectangle = new Rectangle();
        assertEquals(rectangle, rectangle.fromString("[0.0, 0.0, 0.0, 0.0]"));
        assertEquals(rectangle, rectangle.fromString("[1.2, 3.4, 5.6, 7.8]"));
        assertThrows(GdxRuntimeException.class, () -> {
            rectangle.fromString("[invalid, values]");
        });
    }
}
