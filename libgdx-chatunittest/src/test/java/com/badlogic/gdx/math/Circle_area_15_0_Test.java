package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Vector2;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.NumberUtils;

public class Circle_area_15_0_Test {

    @Test
    void testArea() throws Exception {
        // Create a new circle with radius 5
        Circle circle = new Circle(0, 0, 5);
        // Check that the area is calculated correctly
        assertEquals(Math.PI * 25, circle.area(), 0.0001);
    }
}
