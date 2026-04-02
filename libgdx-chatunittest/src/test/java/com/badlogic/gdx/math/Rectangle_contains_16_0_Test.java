package com.badlogic.gdx.math;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import com.badlogic.gdx.utils.Scaling;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class Rectangle_contains_16_0_Test {

    @Spy
    private Rectangle rectangle = new Rectangle();

    @Test
    void testContains() {
        rectangle.setX(0);
        rectangle.setY(0);
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        assertTrue(rectangle.contains(new Vector2(5, 15)));
        assertFalse(rectangle.contains(new Vector2(-1, -1)));
    }
}
