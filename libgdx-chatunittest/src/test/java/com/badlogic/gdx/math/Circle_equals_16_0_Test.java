package com.badlogic.gdx.math;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.NumberUtils;

public class Circle_equals_16_0_Test {

    @Test
    void testEquals() throws Exception {
        // Create two circles with the same properties
        Circle circle1 = new Circle(2, 3, 4);
        Circle circle2 = new Circle(2, 3, 4);
        // Test case 1: Two circles are equal if they have the same x, y, and radius
        assertTrue(circle1.equals(circle2));
        // Create a third circle with different properties
        Circle circle3 = new Circle(5, 6, 7);
        // Test case 2: Two circles are not equal if they have different x, y, or radius
        assertFalse(circle1.equals(circle3));
        // Create a fourth circle with the same properties as the first one
        Circle circle4 = new Circle();
        circle4.set(2, 3, 4);
        // Test case 3: Two circles are equal if they have the same x, y, and radius (even if their instances are different)
        assertTrue(circle1.equals(circle4));
        // Create a fifth circle with the same properties as the Third one
        Circle circle5 = new Circle();
        circle5.setX(5);
        circle5.setY(6);
        circle5.setRadius(7);
        // Test case 4: Two circles are equal if they have the same x, y, and radius (even if their instances are different)
        assertTrue(circle3.equals(circle5));
        // Create a sixth circle with the same properties as the Fourth one but different instance
        Circle circle6 = new Circle();
        circle6.setX(2);
        circle6.setY(3);
        circle6.setRadius(4);
        // Test case 5: Two circles are equal if they have the same x, y, and radius (even if their instances are different)
        assertTrue(circle4.equals(circle6));
        // Create a seventh circle with the same properties as the Fifth one but different instance
        Circle circle7 = new Circle();
        circle7.setX(5);
        circle7.setY(6);
        circle7.setRadius(7);
        // Test case 6: Two circles are equal if they have the same x, y, and radius (even if their instances are different)
        assertTrue(circle3.equals(circle7));
    }
}
