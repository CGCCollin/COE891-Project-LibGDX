package com.badlogic.gdx.math;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.NumberUtils;

public class Circle_overlaps_12_0_Test {

    private Circle circle1, circle2, circle3, circle4, circle5;

    @BeforeEach
    public void setUp() {
        circle1 = new Circle(0, 0, 1);
        circle2 = new Circle(2, 2, 1);
        circle3 = new Circle(-2, -2, 1);
        circle4 = new Circle(new Vector2(0, 0), 1);
        circle5 = new Circle(new Vector2(2, 2), 1);
    }

    @Test
    public void testOverlaps() {
        assertFalse(circle1.overlaps(circle2));
        assertTrue(circle1.overlaps(circle3));
        assertFalse(circle4.overlaps(circle5));
    }
}
