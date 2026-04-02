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

public class Rectangle_contains_15_0_Test {

    @Test
    void testContains() throws Exception {
        Rectangle rectangle = new Rectangle(0, 0, 1, 1);
        assertTrue(rectangle.contains(0.5f, 0.5f));
        assertFalse(rectangle.contains(-0.1f, 0.5f));
        assertFalse(rectangle.contains(0.5f, -0.1f));
        assertFalse(rectangle.contains(1.1f, 0.5f));
        assertFalse(rectangle.contains(0.5f, 1.1f));
    }
}
