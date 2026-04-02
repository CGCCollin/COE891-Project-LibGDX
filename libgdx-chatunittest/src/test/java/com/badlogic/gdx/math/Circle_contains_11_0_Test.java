package com.badlogic.gdx.math;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.NumberUtils;

class Circle_contains_11_0_Test {

    @Test
    void contains() throws Exception {
        Circle circle1 = new Circle(0, 0, 5);
        Circle circle2 = new Circle(3, 4, 2);
        Circle circle3 = new Circle(6, 8, 1);
        assertTrue(circle1.contains(circle2));
        assertFalse(circle1.contains(circle3));
    }
}
