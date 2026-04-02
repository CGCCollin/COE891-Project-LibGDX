package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Rectangle;
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

public class // ... other test methods remain the same ...
Rectangle_merge_22_0_Test {

    @Test
    void testMerge() {
        // Arrange
        Rectangle rect1 = new Rectangle(0, 0, 2, 2);
        Rectangle rect2 = new Rectangle(1, 1, 3, 3);
        // Act
        rect1.merge(rect2);
        // Assert
        assertEquals(0, rect1.x, 0.001);
        assertEquals(0, rect1.y, 0.001);
        assertEquals(4, rect1.width, 0.001);
        assertEquals(4, rect1.height, 0.001);
    }
}
