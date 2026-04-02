package com.badlogic.gdx.mutants;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;
import com.badlogic.gdx.utils.NumberUtils;

public class CircleMutant_circumference_14_0_Test {

    private CircleMutant circle;

    @BeforeEach
    void setUp() {
        circle = new CircleMutant(0, 0, 5);
    }

    @Test
    void testCircumference() {
        Assertions.assertEquals(MathUtils.PI2 * 5, circle.circumference(), 0.0001);
    }
}
