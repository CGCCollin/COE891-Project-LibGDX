package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.NumberUtils;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.Scaling;

public class Rectangle_hashCode_35_0_Test {

    @Test
    public void testHashCode() throws Exception {
        // Create a new instance of the focal class
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);
        // Get the expected hash code value using the manual calculation
        int expected = 31 * (31 * (31 * (31 + Float.floatToRawIntBits(rectangle.width)) + Float.floatToRawIntBits(rectangle.height)) + Float.floatToRawIntBits(rectangle.x)) + Float.floatToRawIntBits(rectangle.y);
        // Get the actual hash code value using reflection
        int actual = (int) Rectangle.class.getMethod("hashCode").invoke(rectangle);
        // Check if the expected and actual values are equal
        assert expected == actual : "The calculated hash code is not correct";
    }
}
